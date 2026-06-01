package com.belajargembira.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.belajargembira.ui.components.AnswerOptionButton
import com.belajargembira.ui.components.ProgressHeader
import com.belajargembira.viewmodel.QuizUiState

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

    val isTwoColumn = windowSizeClass.widthSizeClass >= WindowWidthSizeClass.Medium &&
            windowSizeClass.heightSizeClass != WindowHeightSizeClass.Compact

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
            if (isTwoColumn) {
                TwoColumnQuizLayout(inProgress, onAnswerSelected, onPrevious, onNext, onSubmit)
            } else {
                SingleColumnQuizLayout(inProgress, onAnswerSelected, onPrevious, onNext, onSubmit)
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
                .padding(horizontal = 16.dp)
        ) {
            QuestionCard(text = state.currentQuestion.question.text)
            Spacer(modifier = Modifier.height(16.dp))
            state.currentQuestion.question.options.forEachIndexed { index, option ->
                AnswerOptionButton(
                    index = index,
                    text = option,
                    selectedIndex = state.currentQuestion.selectedIndex,
                    correctIndex = null,
                    onClick = { onAnswerSelected(index) }
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
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
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(0.45f)
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState())
                    .padding(end = 12.dp),
                verticalArrangement = Arrangement.Center
            ) {
                QuestionCard(text = state.currentQuestion.question.text)
            }

            Column(
                modifier = Modifier
                    .weight(0.55f)
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center
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
                Spacer(modifier = Modifier.height(16.dp))
                NavigationRow(state, onPrevious, onNext, onSubmit)
            }
        }
    }
}

@Composable
private fun QuestionCard(text: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp),
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
