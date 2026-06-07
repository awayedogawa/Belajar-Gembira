package com.belajargembira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.belajargembira.ui.navigation.AppNavigation
import com.belajargembira.ui.theme.BelajarGembiraTheme
import com.belajargembira.viewmodel.QuizViewModel

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BelajarGembiraTheme {
                val windowSizeClass = calculateWindowSizeClass(this)
                val viewModel: QuizViewModel = viewModel()
                val navController = rememberNavController()

                LaunchedEffect(Unit) {
                    viewModel.checkForUpdate(BuildConfig.VERSION_NAME)
                }

                AppNavigation(
                    navController = navController,
                    windowSizeClass = windowSizeClass,
                    viewModel = viewModel
                )
            }
        }
    }
}
