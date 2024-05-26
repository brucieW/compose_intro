package com.zeroboss.composeintroduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.zeroboss.composeintroduction.ui.theme.ComposeIntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeIntroductionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(MainViewModel(), innerPadding)
                }
            }
        }
    }
}

@Composable
fun MainScreen(
    mainViewModel: MainViewModel,
    innerPadding: PaddingValues
) {
    val leftButtonEnabled by mainViewModel.leftButtonEnabled
    val rightButtonEnabled by mainViewModel.rightButtonEnabled
    val count by mainViewModel.count

    Surface(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { mainViewModel.decrementCount() },
                    enabled = leftButtonEnabled
                ) {
                    Icon(
                        Icons.Rounded.ArrowBack,
                        contentDescription = "left"
                    )
                }

                Text(
                    count.toString()
                )

                IconButton(
                    onClick = { mainViewModel.incrementCount() },
                    enabled = rightButtonEnabled
                ) {
                    Icon(
                        Icons.Rounded.ArrowForward,
                        contentDescription = "right"
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ShowMainScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        MainScreen(MainViewModel(), innerPadding)
    }
}
