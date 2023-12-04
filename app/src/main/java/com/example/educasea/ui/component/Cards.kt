package com.example.educasea.ui.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.educasea.ui.theme.Poppins

@Composable
fun LearnCard () {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Blue
        ),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(5.dp)
            ) {
                Canvas(modifier = Modifier.size(40.dp), onDraw = {
                    val size = 40.dp.toPx()
                    drawCircle(
                        color = Color.Gray,
                        radius = size / 2f
                    )
                })

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = "Mengenal ragam biota bawah laut Bunaken",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
            }
            Row (
                modifier = Modifier.padding(10.dp, 10.dp)
            ) {
                LinearProgressIndicator(
                    progress = 0.7f,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    color = Color.Yellow,
                    trackColor = Color.White,

                )
            }
        }
    }
}

@Composable
@Preview
fun LearnCardPreview () {
    LearnCard()
}

@Composable
fun RecommendationCard () {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Blue
        ),
        modifier = Modifier
            .width(100.dp)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }
    }
}