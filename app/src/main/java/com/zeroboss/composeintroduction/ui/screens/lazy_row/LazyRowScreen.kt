package com.zeroboss.composeintroduction.ui.screens.lazy_row

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.zeroboss.composeintroduction.ui.common.ComputerLanguage
import com.zeroboss.composeintroduction.ui.common.Constants.selectedColor
import com.zeroboss.composeintroduction.ui.common.LanguageTitle
import com.zeroboss.composeintroduction.ui.theme.ComposeIntroductionTheme

class LazyRowScreen(
    private val lazyRowViewModel: LazyRowViewModel
) : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val selectedLanguage by lazyRowViewModel.selectedItem

            LazyRow(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            ) {
                items(ComputerLanguage.entries) { language ->
                    RowItem(language, lazyRowViewModel)
                }
            }

            LanguageDetails(selectedLanguage)
        }
    }
}

@Composable
fun RowItem(
    language: ComputerLanguage,
    lazyRowViewModel: LazyRowViewModel
) {
    val selectedItem by lazyRowViewModel.selectedItem

    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .defaultMinSize(120.dp)
            .height(80.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selectedItem == language) selectedColor else Color.White
        ),
        onClick = { lazyRowViewModel.onClick(language) },
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
                .align(Alignment.CenterHorizontally),
            contentAlignment = Alignment.Center
        ) {
            LanguageTitle(language)
        }
    }
}

@Composable
fun LanguageDetails(
    language: ComputerLanguage?,
) {
    val expanded = language != null

    Card(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .animateContentSize(),
        colors = CardDefaults.cardColors(containerColor = selectedColor),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        if (expanded) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    LanguageTitle(
                        language!!,
                        modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                    )

                    Row(
                        modifier = Modifier.padding(20.dp)
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
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp),
                        text = language.notes,
                        fontSize = 18.sp,
                        overflow = TextOverflow.Visible
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun ShowRowItem() {
    ComposeIntroductionTheme {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            RowItem(ComputerLanguage.ObjectiveC, LazyRowViewModel())
        }
    }
}


