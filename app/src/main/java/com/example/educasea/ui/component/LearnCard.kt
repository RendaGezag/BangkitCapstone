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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LearnCard () {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
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

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "Mari belajar bersama saya karena saya renda"
                )
            }

            LinearProgressIndicator(
                progress = 90f,
                modifier = Modifier.padding(2.dp)
            )
        }
    }
}

@Composable
@Preview
fun LearnCardPreview () {
    LearnCard()
}