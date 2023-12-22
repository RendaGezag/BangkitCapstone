package com.example.educasea.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.educasea.R
import com.example.educasea.ui.component.PasswordInput
import com.example.educasea.ui.component.PrimaryButton
import com.example.educasea.ui.component.TextInput
import com.example.educasea.ui.component.TextOnlyButton
import com.example.educasea.ui.theme.Poppins

@Composable
fun SignUpPage(
    modifier: Modifier
) {
    val gradient = Brush.verticalGradient(
        listOf(Color(0xFF081130), Color(0xFF0934C1)),
        startY = 700f,
        endY = 2000f
    )

    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient)
    ) {
        Column (
            modifier = modifier,
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_educasea),
                contentDescription = "Logo",
                modifier = Modifier.size(200.dp)
            )

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxHeight()
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Buat Akun",
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Column {
                        TextInput(label = "Nama Kamu")
                        Spacer(modifier = Modifier.height(16.dp))
                        TextInput(label = "Email")
                        Spacer(modifier = Modifier.height(16.dp))
                        PasswordInput(label = "Kata Sandi")
                        Spacer(modifier = Modifier.height(16.dp))
                        PasswordInput(label = "Tulis lagi kata sandi")
                    }
                }

                Column (
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 20.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        PrimaryButton(label = "Daftar")
                    }

                    TextOnlyButton(label = "Sudah punya akun?", color = Color.White)
                }
            }
        }
    }
}

@Composable
@Preview
fun SignUpPagePreview() {
    SignUpPage(modifier = Modifier.fillMaxSize())
}