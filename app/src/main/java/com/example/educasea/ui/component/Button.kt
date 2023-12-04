package com.example.educasea.ui.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton (
    label: String
) {
    Button(
        modifier = Modifier
            .shadow(
            elevation = 5.dp,
            shape = RoundedCornerShape(10)
            ),
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2654F0),
            contentColor = Color.White
        )
    ) {
        Text(label)
    }
}

@Composable
@Preview
fun PrimaryButtonPreview () {
    PrimaryButton(label = "Sign In")
}

@Composable
fun SecondaryButton (
    label: String
) {
    Button(
        modifier = Modifier
            .shadow(
            elevation = 5.dp,
            shape = RoundedCornerShape(10)
            ),
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    ) {
        Text(label)
    }
}

@Composable
@Preview
fun SecondaryButtonPreview () {
    SecondaryButton(label = "Sign Up")
}

@Composable
fun DisabledButton (
    label: String
) {
    Button(
        onClick = { /*TODO*/ },
        enabled = false,
        shape = RoundedCornerShape(10)
    ) {
        Text(label)
    }
}

@Composable
@Preview
fun DisabledButtonPreview () {
    DisabledButton(label = "Not Available")
}

@Composable
fun TextOnlyButton (
    label: String,
    color: Color
) {
    TextButton(
        colors = ButtonDefaults.buttonColors(
            contentColor = color,
            containerColor = Color.Transparent
        ),
        onClick = { /*TODO*/ }
    ) {
        Text(text = label)
    }
}

@Composable
@Preview
fun TextOnlyButtonPreview () {
    TextOnlyButton(
        label = "Forgot your password?",
        color = Color.White
    )
}