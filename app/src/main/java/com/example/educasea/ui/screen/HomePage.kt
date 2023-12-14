package com.example.educasea.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.educasea.R
import com.example.educasea.ui.component.LearnCard
import com.example.educasea.ui.component.RecommendationCard
import com.example.educasea.ui.component.SearchInput
import com.example.educasea.ui.theme.Poppins

@Composable
fun HomePage(
    modifier: Modifier
) {
    BoxWithConstraints(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column (
            modifier = Modifier.padding(10.dp, 10.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth().padding(0.dp, 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_educasea),
                    contentDescription = "Logo",
                    modifier = Modifier.size(30.dp)
                )

                Text(
                    text = "EducaSea",
                    fontFamily = Poppins,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            SearchInput(label = "Cari")
            Column (
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Lanjut Belajar Yuk..",
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
                    repeat(6) {
                        RecommendationCard()

                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }

                Text(
                    text = "Intip Kategori Menarik Lainnya",
                    fontFamily = Poppins,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 5.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun HomePagePreview() {
    HomePage(modifier = Modifier.fillMaxSize())
}
