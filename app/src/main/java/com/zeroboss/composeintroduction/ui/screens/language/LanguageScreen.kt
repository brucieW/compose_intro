package com.zeroboss.composeintroduction.ui.screens.language

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LanguageScreen(paddingValues: PaddingValues) {
    Surface(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LazyRow(
                modifier = Modifier.fillMaxWidth()
            ) {
                items(ComputerLanguage.entries) {
                    RowItem()
                }
            }
            
            LazyColumn(
                
            ) {
                items(ComputerLanguage.entries) {
                    ColItem()
                }
            }
        }
    }
}

@Composable
fun RowItem(modifier: Modifier = Modifier) {
    
}