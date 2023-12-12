package com.example.educasea.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.educasea.ui.component.CategoryCard
import com.example.educasea.ui.component.LearnCard
import com.example.educasea.ui.component.RecommendationCard
import com.example.educasea.ui.component.SearchInput
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
            SearchInput(label = "Cari")
            Column (
                modifier = Modifier.verticalScroll(rememberScrollState())
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
