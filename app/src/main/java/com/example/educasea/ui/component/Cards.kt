package com.example.educasea.ui.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
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
import androidx.compose.ui.text.style.TextAlign
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
                    text = "Ikan Badut",
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
fun RecommendationCard (
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Blue
        ),
        modifier = Modifier
            .width(150.dp)
            .requiredHeight(200.dp)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = Modifier
                .requiredHeight(160.dp)
                .fillMaxWidth()
                .background(color = Color.Gray)
            )
            Text(
                text = "Ikan  Badut",
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
@Preview
fun RecommendationCardPreview () {
    RecommendationCard()
}

@Composable
fun CategoryCard () {
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
            .padding(12.dp)
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
                    text = "Biota Laut",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
@Preview
fun CategoryCardPreview () {
    CategoryCard()
}

@Composable
fun ProfileCard () {
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
        Column (
            modifier = Modifier.padding(16.dp)
        ) {
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

                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Renda Gezag",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )

                    Text(
                        text = "Aku anak baik dan tidak tidak cengeng",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Light,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun ProfileCardPreview () {
    ProfileCard()
}

@Composable
fun MenuCard () {
    Row {
        Row {
            Canvas(modifier = Modifier.size(20.dp), onDraw = {
                val size = 20.dp.toPx()
                drawCircle(
                    color = Color.Gray,
                    radius = size / 2f
                )
            })

            Text(
                text = "Profile",
                fontFamily = Poppins,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
        }
    }
}