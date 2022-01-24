package com.myricseptember.countryfactcomposefinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.myricseptember.countryfactcomposefinal.navigation.Navigation
import com.myricseptember.countryfactcomposefinal.ui.theme.CountryFactComposeFinalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountriesApp {
                Navigation()
            }
        }
    }
}

@Composable
fun CountriesApp(content: @Composable () -> Unit) {
    CountryFactComposeFinalTheme() {
        content()
    }
}

@Preview(showBackground = true)
@Composable

fun DefaultPreview() {
    CountriesApp {
        Navigation()
    }
}