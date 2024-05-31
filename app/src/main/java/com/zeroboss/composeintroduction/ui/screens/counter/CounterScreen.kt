package com.zeroboss.composeintroduction.ui.screens.counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class CounterScreen(
    private val counterViewModel: CounterViewModel,
) : Screen {

    @Composable
    override fun Content() {
        val leftButtonEnabled by counterViewModel.leftButtonEnabled
        val rightButtonEnabled by counterViewModel.rightButtonEnabled
        val count by counterViewModel.count

        Surface(
            modifier = Modifier.fillMaxSize()
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
                        onClick = { counterViewModel.decrementCount() },
                        enabled = leftButtonEnabled
                    ) {
                        Icon(
                            Icons.AutoMirrored.Rounded.ArrowBack,
                            contentDescription = "left",
                            tint = if (leftButtonEnabled) Color.Blue else Color.DarkGray,
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Text(
                        text = count.toString(),
                        Modifier.padding(start = 20.dp, end = 20.dp),
                        fontSize = 40.sp
                    )

                    IconButton(
                        onClick = { counterViewModel.incrementCount() },
                        enabled = rightButtonEnabled
                    ) {
                        Icon(
                            Icons.AutoMirrored.Rounded.ArrowForward,
                            contentDescription = "right",
                            tint = if (rightButtonEnabled) Color.Blue else Color.DarkGray,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ShowMainScreen() {
    CounterScreen(CounterViewModel())
}
