package com.zeroboss.composeintroduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.zeroboss.composeintroduction.ui.screens.home.HomeScreen
import com.zeroboss.composeintroduction.ui.theme.ComposeIntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIntroductionTheme {
                Navigator(HomeScreen()) {
                    SlideTransition(it)
                }
            }
        }
    }
}
