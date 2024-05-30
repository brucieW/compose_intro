package com.zeroboss.composeintroduction.ui.screens.language

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LanguageViewModel : ViewModel() {
    val selectedItem = mutableStateOf<ComputerLanguage?>(null)

    fun onClick(language: ComputerLanguage) {
        if (selectedItem.value != language) {
            selectedItem.value = language
        } else {
            selectedItem.value = null
        }
    }
}