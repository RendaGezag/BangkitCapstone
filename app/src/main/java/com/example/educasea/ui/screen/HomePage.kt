package com.example.educasea.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomePage(
    modifier: Modifier
) {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column {
            Text(text = "Lanjut Belajar Yuk...");

        }
    }
}

@Composable
@Preview
fun HomePagePreview() {
    HomePage(modifier = Modifier.fillMaxSize())
}