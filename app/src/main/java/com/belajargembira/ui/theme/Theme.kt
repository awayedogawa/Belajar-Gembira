package com.belajargembira.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColors = lightColorScheme(
    primary = Blue500,
    onPrimary = SurfaceLight,
    primaryContainer = Blue200,
    onPrimaryContainer = Blue700,
    secondary = Amber500,
    onSecondary = SurfaceLight,
    secondaryContainer = Color(0xFFFFECB3),
    tertiary = Green600,
    onTertiary = SurfaceLight,
    tertiaryContainer = Green200,
    error = Red600,
    errorContainer = Red200,
    background = Background,
    surface = SurfaceLight,
    onSurface = OnSurfaceLight,
    onBackground = OnSurfaceLight
)

private val DarkColors = darkColorScheme(
    primary = Blue200,
    onPrimary = Blue700,
    primaryContainer = Blue700,
    onPrimaryContainer = Blue200,
    secondary = Amber500,
    onSecondary = OnSurfaceLight,
    tertiary = Green200,
    onTertiary = Green600,
    error = Red200,
    errorContainer = Red600,
    background = SurfaceDark,
    surface = SurfaceDark,
    onSurface = OnSurfaceDark,
    onBackground = OnSurfaceDark
)

@Composable
fun BelajarGembiraTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColors
        else -> LightColors
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
