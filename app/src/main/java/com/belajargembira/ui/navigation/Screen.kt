package com.belajargembira.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object LevelSelection : Screen("level_selection")
    object GradeSelection : Screen("grade_selection")
    object SubjectSelection : Screen("subject_selection")
    object QuizSetup : Screen("quiz_setup")
    object Quiz : Screen("quiz")
    object Result : Screen("result")
}
