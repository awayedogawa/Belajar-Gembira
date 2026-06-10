package com.belajargembira.ui.navigation

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.belajargembira.data.model.ExamType
import com.belajargembira.data.model.Level
import com.belajargembira.data.model.Subject
import com.belajargembira.ui.screens.GradeSelectionScreen
import com.belajargembira.ui.screens.HomeScreen
import com.belajargembira.ui.screens.LevelSelectionScreen
import com.belajargembira.ui.screens.QuizScreen
import com.belajargembira.ui.screens.QuizSetupScreen
import com.belajargembira.ui.screens.ResultScreen
import com.belajargembira.ui.screens.SubjectSelectionScreen
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
                onStartLatihan = {
                    navController.navigate(Screen.LevelSelection.route)
                },
                onStartSas = {
                    navController.navigate(Screen.GradeSelection.route)
                },
                updateInfo = viewModel.updateState.collectAsState().value,
                isCheckingUpdate = viewModel.isCheckingUpdate.collectAsState().value,
                updateCheckMessage = viewModel.updateCheckMessage.collectAsState().value,
                onCheckUpdate = viewModel::checkForUpdateManually,
                onDismissUpdateCheckMessage = viewModel::clearUpdateCheckMessage
            )
        }

        composable(Screen.LevelSelection.route) {
            LevelSelectionScreen(
                windowSizeClass = windowSizeClass,
                onLevelSelected = { level ->
                    viewModel.selectLevel(level)
                    navController.navigate(Screen.SubjectSelection.route)
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(Screen.GradeSelection.route) {
            GradeSelectionScreen(
                windowSizeClass = windowSizeClass,
                onGradeSelected = { grade ->
                    viewModel.selectGrade(grade)
                    navController.navigate(Screen.SubjectSelection.route)
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(Screen.SubjectSelection.route) {
            val selection = viewModel.selectionState.collectAsState().value
            if (selection.examType == ExamType.SAS) {
                val grade = selection.grade ?: 4
                SubjectSelectionScreen(
                    windowSizeClass = windowSizeClass,
                    prompt = "Mata pelajaran apa yang ingin kamu latih?\nSAS Kelas $grade",
                    subjectLabel = { subject -> subject.displayName },
                    unavailableMessage = { subject ->
                        "Latihan SAS ${subject.displayName} Kelas $grade " +
                            "belum diaktifkan. Nantikan pembaruan berikutnya ya! 🚧"
                    },
                    onSelectSubject = viewModel::trySelectSubject,
                    onNavigateToQuizSetup = {
                        navController.navigate(Screen.QuizSetup.route)
                    },
                    onBack = { navController.popBackStack() }
                )
            } else {
                val level = selection.level ?: Level.SD
                SubjectSelectionScreen(
                    windowSizeClass = windowSizeClass,
                    prompt = "OSN apa yang ingin kamu latih?\nJenjang ${level.displayName}",
                    subjectLabel = { subject -> "OSN ${subject.displayName}" },
                    unavailableMessage = { subject ->
                        "Latihan ${subject.displayName} jenjang ${level.displayName} " +
                            "belum diaktifkan. Nantikan pembaruan berikutnya ya! 🚧"
                    },
                    onSelectSubject = viewModel::trySelectSubject,
                    onNavigateToQuizSetup = {
                        navController.navigate(Screen.QuizSetup.route)
                    },
                    onBack = { navController.popBackStack() }
                )
            }
        }

        composable(Screen.QuizSetup.route) {
            val selection = viewModel.selectionState.collectAsState().value
            val subjectName = (selection.subject ?: Subject.IPS).displayName
            val isSas = selection.examType == ExamType.SAS
            val contextName = if (isSas) {
                "Kelas ${selection.grade ?: 4}"
            } else {
                "Jenjang ${(selection.level ?: Level.SD).displayName}"
            }
            QuizSetupScreen(
                windowSizeClass = windowSizeClass,
                topBarTitle = if (isSas) {
                    "SAS $subjectName $contextName"
                } else {
                    "OSN $subjectName ${(selection.level ?: Level.SD).displayName}"
                },
                headline = if (isSas) {
                    "Latihan SAS $subjectName\n$contextName"
                } else {
                    "Latihan OSN $subjectName\n$contextName"
                },
                homeState = viewModel.homeState.collectAsState().value,
                onCountSelected = viewModel::selectQuestionCount,
                onStart = {
                    viewModel.startQuiz()
                    navController.navigate(Screen.Quiz.route) {
                        popUpTo(Screen.Home.route)
                    }
                },
                onBack = { navController.popBackStack() }
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
