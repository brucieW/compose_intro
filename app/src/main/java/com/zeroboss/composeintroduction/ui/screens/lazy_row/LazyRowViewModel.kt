package com.zeroboss.composeintroduction.ui.screens.lazy_row

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.zeroboss.composeintroduction.ui.common.ComputerLanguage

class LazyRowViewModel : ViewModel() {
    val selectedItem = mutableStateOf<ComputerLanguage?>(null)

    fun onClick(language: ComputerLanguage) {
        selectedItem.value = if (selectedItem.value == language) null else language
    }
}