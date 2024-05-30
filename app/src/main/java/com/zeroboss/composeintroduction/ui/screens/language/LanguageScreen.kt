package com.zeroboss.composeintroduction.ui.screens.language

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zeroboss.composeintroduction.ui.screens.language.ComputerLanguage.Companion.getImage
import com.zeroboss.composeintroduction.ui.theme.ComposeIntroductionTheme

@Composable
fun LanguageScreen(
    languageViewModel: LanguageViewModel
) {

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            LazyRow(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            ) {
                items(ComputerLanguage.entries) {
                    RowItem(it, languageViewModel)
                }
            }

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                items(ComputerLanguage.entries) {
                    ColItem(it)
                }
            }
        }
    }
}


@Composable
fun RowItem(
    language: ComputerLanguage,
    languageViewModel: LanguageViewModel
) {
    val selectedItem by languageViewModel.selectedItem

    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .defaultMinSize(120.dp)
            .height(80.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selectedItem == language) Color(0xFFDDEDEA) else Color.White
        ),
        onClick = { languageViewModel.onClick(language) },
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
                .align(Alignment.CenterHorizontally),
            contentAlignment = Alignment.Center
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = getImage(language),
                    modifier = Modifier.padding(end = 20.dp),
                    contentDescription = ""
                )

                Text(
                    text = language.languageName,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun ColItem(
    language: ComputerLanguage
) {
}

@Preview
@Composable
private fun ShowRowItem() {
    ComposeIntroductionTheme {
        val modifier = Modifier

        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            RowItem(ComputerLanguage.ObjectiveC, LanguageViewModel())
        }
    }
}


