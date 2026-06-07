package com.belajargembira.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.belajargembira.R

/**
 * Overlay animasi singkat yang muncul begitu jawaban dipilih,
 * menunjukkan apakah jawaban tersebut benar atau salah.
 */
@Composable
fun AnswerFeedbackOverlay(
    visible: Boolean,
    isCorrect: Boolean,
    modifier: Modifier = Modifier
) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut(),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.2f)),
            contentAlignment = Alignment.Center
        ) {
            val rawRes = if (isCorrect) R.raw.anim_jawaban_benar else R.raw.anim_jawaban_salah
            val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(rawRes))
            val progress by animateLottieCompositionAsState(
                composition = composition,
                iterations = 1
            )
            LottieAnimation(
                composition = composition,
                progress = { progress },
                modifier = Modifier.size(220.dp)
            )
        }
    }
}
