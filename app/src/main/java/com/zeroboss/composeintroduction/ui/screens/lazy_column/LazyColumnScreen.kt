package com.zeroboss.composeintroduction.ui.screens.lazy_column

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.zeroboss.composeintroduction.ui.common.ComputerLanguage
import com.zeroboss.composeintroduction.ui.common.ComputerLanguage.Companion.getImage
import com.zeroboss.composeintroduction.ui.common.Constants.selectedColor
import com.zeroboss.composeintroduction.ui.common.LanguageTitle
import com.zeroboss.composeintroduction.ui.common.LanguageTitleColumn
import com.zeroboss.composeintroduction.ui.screens.lazy_row.LanguageDetails
import com.zeroboss.composeintroduction.ui.theme.ComposeIntroductionTheme

class LazyColumnScreen(
    private val lazyColumnViewModel: LazyColumnViewModel
) : Screen {
    @Composable
    override fun Content() {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            val selectedLanguage by lazyColumnViewModel.selectedItem

            LazyColumn(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
            ) {
                items(ComputerLanguage.entries) { language ->
                    ColumnItem(language, lazyColumnViewModel)
                }
            }
        }
    }
}

@Composable
fun ColumnItem(
    language: ComputerLanguage,
    lazyColumnViewModel: LazyColumnViewModel
) {
    val selectedItem by lazyColumnViewModel.selectedItem

    Card(
        modifier = Modifier
            .padding(10.dp)
            .defaultMinSize(120.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selectedItem == language) selectedColor else Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            LanguageTitleColumn(language)
            LanguageColumnDetails(language)
        }
    }
}

@Composable
fun LanguageColumnDetails(
    language: ComputerLanguage,
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Row(
                modifier = Modifier.padding(10.dp)
            ) {
                Text(
                    text = "Relative Usage: ",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Text(
                    text = language.relativeUsage.text,
                    fontSize = 18.sp
                )
            }

            Text(
                modifier = Modifier.padding(start = 10.dp, end = 20.dp, bottom = 20.dp),
                text = language.notes,
                fontSize = 18.sp,
                overflow = TextOverflow.Visible
            )
        }
    }
}
