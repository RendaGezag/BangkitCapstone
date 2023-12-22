package com.example.educasea.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.educasea.R
import com.example.educasea.ui.component.PrimaryButton
import com.example.educasea.ui.component.SecondaryButton
import com.example.educasea.ui.theme.Poppins

@Composable
fun LandingPage(
    modifier: Modifier
) {
    val gradient = Brush.verticalGradient(
        listOf(Color(0xFF081130), Color(0xFF0934C1)),
        startY = 700f,
        endY = 2000f
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient)
    ) {
        Column (
            modifier = modifier,
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "Ayo jelajahi lautan",
                    style = MaterialTheme.typography.displayLarge,
                    color = Color(0xFF0934C1),
                    textAlign = TextAlign.Center,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Jelajahi keajaiban bawah laut dan temukan harta karun yang tersembunyi!",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

            Image(
                painter = painterResource(id = R.drawable.logo_educasea),
                contentDescription = "Logo",
                modifier = Modifier.size(200.dp)
            )

            Row(
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 40.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                PrimaryButton(label = "Masuk")
                Spacer(modifier = Modifier.width(10.dp))
                SecondaryButton(label = "Daftar")
            }
        }
    }
}

@Composable
@Preview(name = "PIXEL_2_XL", device = Devices.PIXEL_2_XL)
fun LandingPagePreview () {
    LandingPage(
        modifier = Modifier.fillMaxSize()
    )
}