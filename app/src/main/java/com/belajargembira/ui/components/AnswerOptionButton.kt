package com.belajargembira.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.belajargembira.ui.theme.Green600
import com.belajargembira.ui.theme.Red600

private val optionLabels = listOf("A", "B", "C", "D")

@Composable
fun AnswerOptionButton(
    index: Int,
    text: String,
    selectedIndex: Int?,
    correctIndex: Int?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isSelected = selectedIndex == index
    val showResult = correctIndex != null
    val isCorrect = correctIndex == index
    val isWrongSelection = isSelected && !isCorrect

    val containerColor = when {
        showResult && isCorrect -> Green600
        showResult && isWrongSelection -> Red600
        isSelected -> MaterialTheme.colorScheme.primary
        else -> Color.Transparent
    }

    val contentColor = when {
        showResult && (isCorrect || isWrongSelection) -> Color.White
        isSelected -> MaterialTheme.colorScheme.onPrimary
        else -> MaterialTheme.colorScheme.onSurface
    }

    val border = when {
        showResult && isCorrect -> BorderStroke(2.dp, Green600)
        showResult && isWrongSelection -> BorderStroke(2.dp, Red600)
        isSelected -> BorderStroke(2.dp, MaterialTheme.colorScheme.primary)
        else -> BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
    }

    OutlinedButton(
        onClick = { if (correctIndex == null) onClick() },
        modifier = modifier.fillMaxWidth().padding(vertical = 4.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        border = border,
        shape = MaterialTheme.shapes.medium
    ) {
        Text(
            text = "${optionLabels[index]}. $text",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
        )
    }
}
