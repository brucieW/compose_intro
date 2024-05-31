package com.zeroboss.composeintroduction.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.zeroboss.composeintroduction.ui.screens.counter.CounterScreen
import com.zeroboss.composeintroduction.ui.screens.counter.CounterViewModel
import com.zeroboss.composeintroduction.ui.screens.lazy_column.LazyColumnScreen
import com.zeroboss.composeintroduction.ui.screens.lazy_column.LazyColumnViewModel
import com.zeroboss.composeintroduction.ui.screens.lazy_row.LazyRowScreen
import com.zeroboss.composeintroduction.ui.screens.lazy_row.LazyRowViewModel

class HomeScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = Modifier.padding(bottom = 20.dp),
                    onClick = { navigator.push(CounterScreen(CounterViewModel())) }
                ) {
                    Text("Counter")
                }

                Button(
                    modifier = Modifier.padding(bottom = 20.dp),
                    onClick = { navigator.push(LazyRowScreen(LazyRowViewModel())) }
                ) {
                    Text("Lazy Row")
                }

                Button(
                    onClick = { navigator.push(LazyColumnScreen(LazyColumnViewModel())) }
                ) {
                    Text("Lazy Column")
                }
            }
        }
    }
}
