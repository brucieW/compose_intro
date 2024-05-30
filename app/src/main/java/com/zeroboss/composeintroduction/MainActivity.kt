package com.zeroboss.composeintroduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.zeroboss.composeintroduction.ui.screens.language.LanguageScreen
import com.zeroboss.composeintroduction.ui.screens.language.LanguageViewModel
import com.zeroboss.composeintroduction.ui.theme.ComposeIntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeIntroductionTheme {
                LanguageScreen(LanguageViewModel())
            }
        }
    }
}
