package com.example.educasea.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.educasea.ui.component.LearnCard
import com.example.educasea.ui.theme.Poppins

@Composable
fun HomePage(
    modifier: Modifier
) {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column (
            modifier = Modifier.padding(10.dp, 10.dp)
        ) {
            Text(
                text = "Mari Lanjutkan!",
                fontFamily = Poppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 5.dp)
            )

            LearnCard()

            Text(
                text = "Rekomendasi Buat Kamu",
                fontFamily = Poppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 5.dp)
            )

            Row (
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
            ) {

            }
        }
    }
}

@Composable
@Preview
fun HomePagePreview() {
    HomePage(modifier = Modifier.fillMaxSize())
}