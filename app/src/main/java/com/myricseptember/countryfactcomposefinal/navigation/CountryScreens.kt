package com.myricseptember.countryfactcomposefinal.navigation

sealed class CountryScreens(val route: String) {
    object HomeScreen : CountryScreens("home_screen")
    object DetailScreen : CountryScreens("detail_screen")
}
