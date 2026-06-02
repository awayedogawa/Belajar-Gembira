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
    primary = Orange500,
    onPrimary = SurfaceLight,
    primaryContainer = Orange200,
    onPrimaryContainer = Orange700,
    secondary = SkyBlue500,
    onSecondary = SurfaceLight,
    secondaryContainer = SkyBlue200,
    onSecondaryContainer = SkyBlue700,
    tertiary = Purple500,
    onTertiary = SurfaceLight,
    tertiaryContainer = Purple200,
    onTertiaryContainer = Purple700,
    error = Red600,
    errorContainer = Red200,
    background = Background,
    surface = SurfaceLight,
    onSurface = OnSurfaceLight,
    onBackground = OnSurfaceLight
)

private val DarkColors = darkColorScheme(
    primary = Orange200,
    onPrimary = Orange700,
    primaryContainer = Orange700,
    onPrimaryContainer = Orange200,
    secondary = SkyBlue200,
    onSecondary = SkyBlue700,
    secondaryContainer = SkyBlue700,
    onSecondaryContainer = SkyBlue200,
    tertiary = Purple200,
    onTertiary = Purple700,
    tertiaryContainer = Purple700,
    onTertiaryContainer = Purple200,
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
    dynamicColor: Boolean = false,
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
