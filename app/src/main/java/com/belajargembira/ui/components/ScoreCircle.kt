package com.belajargembira.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.belajargembira.ui.theme.Green600
import com.belajargembira.ui.theme.Red600

@Composable
fun ScoreCircle(
    percentage: Float,
    size: Dp = 160.dp,
    modifier: Modifier = Modifier
) {
    var animatedTarget by remember { mutableFloatStateOf(0f) }
    val sweepAngle by animateFloatAsState(
        targetValue = animatedTarget,
        animationSpec = tween(durationMillis = 1200),
        label = "score_arc"
    )

    LaunchedEffect(percentage) {
        animatedTarget = percentage * 3.6f
    }

    val trackColor = MaterialTheme.colorScheme.surfaceVariant
    val arcColor = if (percentage >= 60f) Green600 else Red600

    Box(contentAlignment = Alignment.Center, modifier = modifier.size(size)) {
        Canvas(modifier = Modifier.size(size)) {
            val stroke = Stroke(width = (size.toPx() * 0.1f), cap = StrokeCap.Round)
            drawArc(color = trackColor, startAngle = -90f, sweepAngle = 360f, useCenter = false, style = stroke)
            if (sweepAngle > 0f) {
                drawArc(color = arcColor, startAngle = -90f, sweepAngle = sweepAngle, useCenter = false, style = stroke)
            }
        }
        Text(
            text = "${percentage.toInt()}%",
            fontSize = (size.value * 0.22f).sp,
            fontWeight = FontWeight.Bold,
            color = arcColor
        )
    }
}
