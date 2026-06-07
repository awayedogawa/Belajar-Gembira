package com.belajargembira.ui.navigation

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.belajargembira.ui.screens.HomeScreen
import com.belajargembira.ui.screens.QuizScreen
import com.belajargembira.ui.screens.ResultScreen
import com.belajargembira.viewmodel.QuizViewModel

@Composable
fun AppNavigation(
    navController: NavHostController,
    windowSizeClass: WindowSizeClass,
    viewModel: QuizViewModel
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {

        composable(Screen.Home.route) {
            HomeScreen(
                windowSizeClass = windowSizeClass,
                homeState = viewModel.homeState.collectAsState().value,
                onCountSelected = viewModel::selectQuestionCount,
                onStart = {
                    viewModel.startQuiz()
                    navController.navigate(Screen.Quiz.route)
                },
                updateInfo = viewModel.updateState.collectAsState().value
            )
        }

        composable(Screen.Quiz.route) {
            QuizScreen(
                windowSizeClass = windowSizeClass,
                quizState = viewModel.quizState.collectAsState().value,
                onAnswerSelected = viewModel::selectAnswer,
                onNext = viewModel::goToNextQuestion,
                onPrevious = viewModel::goToPreviousQuestion,
                onSubmit = {
                    viewModel.submitQuiz()
                    navController.navigate(Screen.Result.route) {
                        popUpTo(Screen.Quiz.route) { inclusive = true }
                    }
                },
                onBack = {
                    viewModel.restartQuiz()
                    navController.popBackStack(Screen.Home.route, false)
                }
            )
        }

        composable(Screen.Result.route) {
            ResultScreen(
                windowSizeClass = windowSizeClass,
                quizState = viewModel.quizState.collectAsState().value,
                onRetry = {
                    viewModel.retryWithSameSettings()
                    navController.navigate(Screen.Quiz.route) {
                        popUpTo(Screen.Result.route) { inclusive = true }
                    }
                },
                onHome = {
                    viewModel.restartQuiz()
                    navController.popBackStack(Screen.Home.route, false)
                }
            )
        }
    }
}
