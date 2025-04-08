package com.example.navegacionentreventanas

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavigationExample() {
    val navController = rememberNavController()
    val viewModel = remember { SharedViewModel() }

    NavHost(navController = navController, startDestination = "screen_a") {
        composable("screen_a") {
            ScreenA(navController, viewModel)
        }
        composable("screen_b") {
            ScreenB(navController, viewModel)
        }
    }
}

