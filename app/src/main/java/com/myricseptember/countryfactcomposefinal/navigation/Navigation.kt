package com.myricseptember.countryfactcomposefinal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.myricseptember.countryfactcomposefinal.screens.detail.DetailScreen
import com.myricseptember.countryfactcomposefinal.screens.home.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = CountryScreens.HomeScreen.route) {
        composable(route = CountryScreens.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = CountryScreens.DetailScreen.route + "/{countryId}",
            arguments = listOf(navArgument(name = "countryId") {
                type = NavType.IntType
            })
        ) { entry ->
            DetailScreen(navController, entry.arguments?.getInt("countryId"))
        }
    }
}