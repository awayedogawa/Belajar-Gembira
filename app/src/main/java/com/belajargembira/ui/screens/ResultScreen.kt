package com.belajargembira.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.belajargembira.ui.components.ScoreCircle
import com.belajargembira.ui.theme.Green600
import com.belajargembira.ui.theme.Red600
import com.belajargembira.viewmodel.QuizUiState

@Composable
fun ResultScreen(
    windowSizeClass: WindowSizeClass,
    quizState: QuizUiState,
    onRetry: () -> Unit,
    onHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    val finished = quizState as? QuizUiState.Finished ?: return

    val isWide = windowSizeClass.widthSizeClass != WindowWidthSizeClass.Compact

    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier
                    .widthIn(max = if (isWide) 600.dp else Int.MAX_VALUE.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = if (finished.passed) "Selamat! 🎉" else "Tetap Semangat!",
                    style = MaterialTheme.typography.headlineMedium,
                    color = if (finished.passed) Green600 else Red600,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = if (finished.passed) "Kamu lulus dengan nilai baik!" else "Pelajari lagi dan coba kembali!",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(32.dp))

                ScoreCircle(percentage = finished.percentage)

                Spacer(modifier = Modifier.height(32.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        StatRow(label = "Jawaban Benar", value = "${finished.correctAnswers} soal")
                        StatRow(label = "Jawaban Salah", value = "${finished.totalQuestions - finished.correctAnswers} soal")
                        StatRow(label = "Total Soal", value = "${finished.totalQuestions} soal")
                        StatRow(label = "Waktu", value = formatTime(finished.timeTakenSeconds))
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    OutlinedButton(
                        onClick = onHome,
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Menu Utama")
                    }
                    Button(
                        onClick = onRetry,
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary
                        )
                    ) {
                        Text("Coba Lagi")
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

@Composable
private fun StatRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

private fun formatTime(seconds: Int): String {
    val m = seconds / 60
    val s = seconds % 60
    return "%02d:%02d".format(m, s)
}
