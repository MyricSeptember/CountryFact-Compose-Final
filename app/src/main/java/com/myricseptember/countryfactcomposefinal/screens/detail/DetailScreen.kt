package com.myricseptember.countryfactcomposefinal.screens.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.myricseptember.countryfactcomposefinal.data.CountryRepository

@Composable
fun DetailScreen(navController: NavController, countryId: Int?) {
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Transparent, elevation = 0.dp) {
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow Back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Country Detail", fontWeight = FontWeight.Bold)
            }
        }
    }) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            val country = countryId?.let { it1 -> CountryRepository.findCountry(it1) }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "${country?.name} ",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Population", fontWeight = FontWeight.Bold)
                Text(text = "${country?.population}")

                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Largest City", fontWeight = FontWeight.Bold)
                Text(text = "${country?.largest_city} ")

                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Capital City", fontWeight = FontWeight.Bold)
                Text(text = "${country?.capital_city} ")

                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Major Language", fontWeight = FontWeight.Bold)
                Text(text = "${country?.major_language} ", textAlign = TextAlign.Center)

                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Major Religion", fontWeight = FontWeight.Bold)
                Text(text = "${country?.major_religion} ")

                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Monetary Unit", fontWeight = FontWeight.Bold)
                Text(text = "${country?.monetary_unit} ")
            }
        }
    }
}