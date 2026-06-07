package com.belajargembira.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.belajargembira.ui.components.AnswerFeedbackOverlay
import com.belajargembira.ui.components.AnswerOptionButton
import com.belajargembira.ui.components.ProgressHeader
import com.belajargembira.viewmodel.QuizUiState
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
    windowSizeClass: WindowSizeClass,
    quizState: QuizUiState,
    onAnswerSelected: (Int) -> Unit,
    onNext: () -> Unit,
    onPrevious: () -> Unit,
    onSubmit: () -> Unit,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler { onBack() }

    val inProgress = quizState as? QuizUiState.InProgress ?: return

    // Dua kolom hanya untuk tablet landscape (Expanded).
    // Tablet portrait (Medium) dan ponsel → satu kolom (soal di atas, jawaban di bawah).
    val isTwoColumn = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Expanded &&
            windowSizeClass.heightSizeClass != WindowHeightSizeClass.Compact

    // Tampilkan animasi singkat begitu jawaban dipilih (terkunci) — benar atau salah.
    val selectedIndex = inProgress.currentQuestion.selectedIndex
    val isCorrectSelection = selectedIndex != null && selectedIndex == inProgress.currentQuestion.question.correctIndex
    var feedbackVisible by remember { mutableStateOf(false) }

    LaunchedEffect(inProgress.currentIndex, selectedIndex) {
        if (selectedIndex != null) {
            feedbackVisible = true
            delay(1200L)
            feedbackVisible = false
        } else {
            feedbackVisible = false
        }
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("IPS SD", style = MaterialTheme.typography.titleMedium) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali")
                    }
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        Surface(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            color = MaterialTheme.colorScheme.background
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                if (isTwoColumn) {
                    TwoColumnQuizLayout(inProgress, onAnswerSelected, onPrevious, onNext, onSubmit)
                } else {
                    SingleColumnQuizLayout(inProgress, onAnswerSelected, onPrevious, onNext, onSubmit)
                }

                AnswerFeedbackOverlay(
                    visible = feedbackVisible,
                    isCorrect = isCorrectSelection,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
private fun SingleColumnQuizLayout(
    state: QuizUiState.InProgress,
    onAnswerSelected: (Int) -> Unit,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onSubmit: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        ProgressHeader(
            currentQuestion = state.currentIndex + 1,
            totalQuestions = state.totalCount,
            progress = state.progress,
            timeElapsedSeconds = state.timeElapsedSeconds
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            QuestionCard(text = state.currentQuestion.question.text)
            Spacer(modifier = Modifier.height(16.dp))
            state.currentQuestion.question.options.forEachIndexed { index, option ->
                AnswerOptionButton(
                    index = index,
                    text = option,
                    selectedIndex = state.currentQuestion.selectedIndex,
                    correctIndex = if (state.currentQuestion.selectedIndex != null)
                        state.currentQuestion.question.correctIndex else null,
                    onClick = { onAnswerSelected(index) }
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
        HorizontalDivider()
        NavigationRow(state, onPrevious, onNext, onSubmit)
    }
}

@Composable
private fun TwoColumnQuizLayout(
    state: QuizUiState.InProgress,
    onAnswerSelected: (Int) -> Unit,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onSubmit: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        ProgressHeader(
            currentQuestion = state.currentIndex + 1,
            totalQuestions = state.totalCount,
            progress = state.progress,
            timeElapsedSeconds = state.timeElapsedSeconds
        )

        // Dua kolom: soal (kiri) dan jawaban (kanan) — keduanya dari atas
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp)
        ) {
            // Kolom kiri: teks soal
            Column(
                modifier = Modifier
                    .weight(0.45f)
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState())
                    .padding(top = 24.dp, end = 12.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.Top
            ) {
                QuestionCard(
                    text = state.currentQuestion.question.text,
                    isTablet = true
                )
            }

            VerticalDivider(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = 16.dp)
            )

            // Kolom kanan: pilihan jawaban — tanpa NavigationRow di sini
            Column(
                modifier = Modifier
                    .weight(0.55f)
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState())
                    .padding(top = 24.dp, start = 12.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.Top
            ) {
                state.currentQuestion.question.options.forEachIndexed { index, option ->
                    AnswerOptionButton(
                        index = index,
                        text = option,
                        selectedIndex = state.currentQuestion.selectedIndex,
                        correctIndex = null,
                        onClick = { onAnswerSelected(index) }
                    )
                }
            }
        }

        // NavigationRow fixed di bawah — selalu terlihat tanpa perlu scroll
        HorizontalDivider()
        NavigationRow(state, onPrevious, onNext, onSubmit)
    }
}

@Composable
private fun QuestionCard(
    text: String,
    isTablet: Boolean = false,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Text(
            text = text,
            style = if (isTablet) MaterialTheme.typography.titleMedium
                    else MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(20.dp),
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
private fun NavigationRow(
    state: QuizUiState.InProgress,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onSubmit: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedButton(
            onClick = onPrevious,
            enabled = !state.isFirstQuestion,
            modifier = Modifier.weight(1f)
        ) {
            Text("← Sebelumnya")
        }

        Spacer(modifier = Modifier.width(12.dp))

        if (state.isLastQuestion) {
            Button(
                onClick = onSubmit,
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.tertiary
                )
            ) {
                Text("Selesai ✓")
            }
        } else {
            Button(
                onClick = onNext,
                modifier = Modifier.weight(1f)
            ) {
                Text("Lanjut →")
            }
        }
    }
}
