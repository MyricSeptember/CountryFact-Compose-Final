package com.myricseptember.countryfactcomposefinal.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.myricseptember.countryfactcomposefinal.data.CountryRepository.Companion.getAllCountries
import com.myricseptember.countryfactcomposefinal.data.model.Country
import com.myricseptember.countryfactcomposefinal.navigation.CountryScreens
import com.myricseptember.countryfactcomposefinal.widgets.CountryRow

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color.Transparent, elevation =
            0.dp, modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(text = "Countries", fontWeight = FontWeight.Bold)
        }
    }) {
        val country = getAllCountries()
        MainContent(navController, country)
    }
}

@Composable
fun MainContent(
    navController: NavController,
    countryList: List<Country>
) {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = countryList) {

                CountryRow(country = it) { countryId ->

                    navController.navigate(CountryScreens.DetailScreen.route + "/$countryId")
                }
            }
        }
    }
}