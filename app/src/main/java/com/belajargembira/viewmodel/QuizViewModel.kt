package com.belajargembira.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.belajargembira.data.model.Level
import com.belajargembira.data.model.Question
import com.belajargembira.data.model.Subject
import com.belajargembira.data.repository.QuestionRepository
import com.belajargembira.data.update.UpdateChecker
import com.belajargembira.data.update.UpdateInfo
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class HomeUiState(
    val questionCount: Int = 25
)

data class SelectionUiState(
    val level: Level? = null,
    val subject: Subject? = null
)

data class QuizQuestionState(
    val question: Question,
    val selectedIndex: Int? = null
)

sealed interface QuizUiState {
    object Idle : QuizUiState

    data class InProgress(
        val questions: List<QuizQuestionState>,
        val currentIndex: Int,
        val totalCount: Int,
        val timeElapsedSeconds: Int = 0
    ) : QuizUiState {
        val currentQuestion: QuizQuestionState get() = questions[currentIndex]
        val progress: Float get() = (currentIndex + 1).toFloat() / totalCount
        val isFirstQuestion: Boolean get() = currentIndex == 0
        val isLastQuestion: Boolean get() = currentIndex == totalCount - 1
        val answeredCount: Int get() = questions.count { it.selectedIndex != null }
    }

    data class Finished(
        val totalQuestions: Int,
        val correctAnswers: Int,
        val timeTakenSeconds: Int,
        val perQuestionResults: List<QuizQuestionState>
    ) : QuizUiState {
        val percentage: Float get() = if (totalQuestions == 0) 0f else correctAnswers.toFloat() / totalQuestions * 100f
        val passed: Boolean get() = percentage >= 60f
    }
}

class QuizViewModel(
    private val repository: QuestionRepository = QuestionRepository()
) : ViewModel() {

    private val _homeState = MutableStateFlow(HomeUiState())
    val homeState: StateFlow<HomeUiState> = _homeState.asStateFlow()

    private val _selectionState = MutableStateFlow(SelectionUiState())
    val selectionState: StateFlow<SelectionUiState> = _selectionState.asStateFlow()

    private val _quizState = MutableStateFlow<QuizUiState>(QuizUiState.Idle)
    val quizState: StateFlow<QuizUiState> = _quizState.asStateFlow()

    private val _updateState = MutableStateFlow<UpdateInfo?>(null)
    val updateState: StateFlow<UpdateInfo?> = _updateState.asStateFlow()

    private val _isCheckingUpdate = MutableStateFlow(false)
    val isCheckingUpdate: StateFlow<Boolean> = _isCheckingUpdate.asStateFlow()

    private val _updateCheckMessage = MutableStateFlow<String?>(null)
    val updateCheckMessage: StateFlow<String?> = _updateCheckMessage.asStateFlow()

    private var timerJob: Job? = null
    private var updateChecked = false
    private var currentVersion: String = ""

    /**
     * Mengecek versi terbaru aplikasi secara online (sekali per sesi, otomatis saat dibuka).
     * Jika ada versi lebih baru, [updateState] akan terisi dan kartu update muncul di Home.
     */
    fun checkForUpdate(currentVersion: String) {
        this.currentVersion = currentVersion
        if (updateChecked) return
        updateChecked = true
        viewModelScope.launch {
            _updateState.value = UpdateChecker.checkForUpdate(currentVersion)
        }
    }

    /**
     * Cek pembaruan secara manual saat pengguna menekan tombol "Cek Pembaruan".
     * Berbeda dari [checkForUpdate], ini bisa dipanggil berkali-kali dan selalu
     * memberi umpan balik: kartu update muncul jika ada versi baru, atau pesan
     * "sudah versi terbaru" jika tidak ada.
     */
    fun checkForUpdateManually() {
        if (_isCheckingUpdate.value || currentVersion.isEmpty()) return
        viewModelScope.launch {
            _isCheckingUpdate.value = true
            _updateCheckMessage.value = null
            val result = UpdateChecker.checkForUpdate(currentVersion)
            _isCheckingUpdate.value = false
            if (result != null) {
                _updateState.value = result
            } else {
                _updateCheckMessage.value = "Kamu sudah memakai versi terbaru ✓"
            }
        }
    }

    fun clearUpdateCheckMessage() {
        _updateCheckMessage.value = null
    }

    fun selectQuestionCount(count: Int) {
        val validated = count.coerceIn(25, 100)
        _homeState.value = _homeState.value.copy(questionCount = validated)
    }

    /**
     * Pilih jenjang (SD/SMP) — mereset mata pelajaran yang sebelumnya terpilih.
     */
    fun selectLevel(level: Level) {
        _selectionState.value = SelectionUiState(level = level)
    }

    /**
     * Coba pilih mata pelajaran. Mengembalikan true & menyimpan pilihan jika
     * bank soal untuk kombinasi jenjang+mapel ini sudah tersedia; false jika
     * belum (layar pemanggil akan menampilkan pesan "fitur belum diaktifkan").
     */
    fun trySelectSubject(subject: Subject): Boolean {
        val level = _selectionState.value.level ?: return false
        return if (repository.hasQuestions(level, subject)) {
            _selectionState.value = _selectionState.value.copy(subject = subject)
            true
        } else {
            false
        }
    }

    fun startQuiz() {
        val selection = _selectionState.value
        val level = selection.level ?: Level.SD
        val subject = selection.subject ?: Subject.IPS
        val count = _homeState.value.questionCount
        val questions = repository.getRandomQuestions(count, level, subject).map { QuizQuestionState(it) }
        _quizState.value = QuizUiState.InProgress(
            questions = questions,
            currentIndex = 0,
            totalCount = count
        )
        startTimer()
    }

    fun selectAnswer(answerIndex: Int) {
        val current = _quizState.value as? QuizUiState.InProgress ?: return
        val q = current.questions[current.currentIndex]
        if (q.selectedIndex != null) return // jawaban sudah terkunci, tidak bisa diganti
        val updatedQuestions = current.questions.toMutableList().also { list ->
            list[current.currentIndex] = q.copy(selectedIndex = answerIndex)
        }
        _quizState.value = current.copy(questions = updatedQuestions)
    }

    fun goToNextQuestion() {
        val current = _quizState.value as? QuizUiState.InProgress ?: return
        if (!current.isLastQuestion) {
            _quizState.value = current.copy(currentIndex = current.currentIndex + 1)
        }
    }

    fun goToPreviousQuestion() {
        val current = _quizState.value as? QuizUiState.InProgress ?: return
        if (!current.isFirstQuestion) {
            _quizState.value = current.copy(currentIndex = current.currentIndex - 1)
        }
    }

    fun submitQuiz() {
        val current = _quizState.value as? QuizUiState.InProgress ?: return
        timerJob?.cancel()
        val correct = current.questions.count { q ->
            q.selectedIndex == q.question.correctIndex
        }
        _quizState.value = QuizUiState.Finished(
            totalQuestions = current.totalCount,
            correctAnswers = correct,
            timeTakenSeconds = current.timeElapsedSeconds,
            perQuestionResults = current.questions
        )
    }

    fun retryWithSameSettings() {
        startQuiz()
    }

    fun restartQuiz() {
        timerJob?.cancel()
        _quizState.value = QuizUiState.Idle
    }

    private fun startTimer() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (true) {
                delay(1000L)
                val current = _quizState.value as? QuizUiState.InProgress ?: break
                _quizState.value = current.copy(timeElapsedSeconds = current.timeElapsedSeconds + 1)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        timerJob?.cancel()
    }
}
