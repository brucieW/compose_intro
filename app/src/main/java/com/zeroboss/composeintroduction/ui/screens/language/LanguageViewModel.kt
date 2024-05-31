package com.zeroboss.composeintroduction.ui.screens.language

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LanguageViewModel : ViewModel() {
    val selectedItem = mutableStateOf<ComputerLanguage?>(null)

    fun onClick(language: ComputerLanguage) {
        selectedItem.value = if (selectedItem.value == language) null else language
    }
}