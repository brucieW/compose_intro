package com.zeroboss.composeintroduction.ui.screens.counter

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val leftButtonEnabled = mutableStateOf(false)
    val rightButtonEnabled = mutableStateOf(true)

    val count = mutableIntStateOf(0)

    fun decrementCount() {
        rightButtonEnabled.value = true
        --count.intValue
        leftButtonEnabled.value = (count.intValue > 0)
    }

    fun incrementCount() {
        leftButtonEnabled.value = true
        ++count.intValue

        if (count.intValue == 5) {
            rightButtonEnabled.value = false
        }
    }
}