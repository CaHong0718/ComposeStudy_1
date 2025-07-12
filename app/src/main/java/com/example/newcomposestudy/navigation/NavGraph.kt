package com.example.newcomposestudy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.newcomposestudy.MainActivity
import com.example.newcomposestudy.ui.screen.input.InputScreen
import com.example.newcomposestudy.ui.screen.main.MainScreen

object Routes {
    const val MAIN = "main"
    const val INPUT = "input"
}

@Composable
fun AppNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Routes.MAIN) {
        composable(Routes.MAIN) {
            MainScreen(navController)
        }

        composable(Routes.INPUT){
            InputScreen(navController)
        }
    }
}