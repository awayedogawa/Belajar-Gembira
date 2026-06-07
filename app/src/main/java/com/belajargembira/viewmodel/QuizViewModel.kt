package com.belajargembira.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.belajargembira.data.model.Question
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

    private val _quizState = MutableStateFlow<QuizUiState>(QuizUiState.Idle)
    val quizState: StateFlow<QuizUiState> = _quizState.asStateFlow()

    private val _updateState = MutableStateFlow<UpdateInfo?>(null)
    val updateState: StateFlow<UpdateInfo?> = _updateState.asStateFlow()

    private var timerJob: Job? = null
    private var updateChecked = false

    /**
     * Mengecek versi terbaru aplikasi secara online (sekali per sesi).
     * Jika ada versi lebih baru, [updateState] akan terisi dan kartu update muncul di Home.
     */
    fun checkForUpdate(currentVersion: String) {
        if (updateChecked) return
        updateChecked = true
        viewModelScope.launch {
            _updateState.value = UpdateChecker.checkForUpdate(currentVersion)
        }
    }

    fun selectQuestionCount(count: Int) {
        val validated = count.coerceIn(25, 100)
        _homeState.value = _homeState.value.copy(questionCount = validated)
    }

    fun startQuiz() {
        val count = _homeState.value.questionCount
        val questions = repository.getRandomQuestions(count).map { QuizQuestionState(it) }
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
