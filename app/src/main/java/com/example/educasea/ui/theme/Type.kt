package com.example.educasea.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.educasea.R

val Poppins = FontFamily(
    Font(R.font.poppins_black, weight = FontWeight.Black),
    Font(R.font.poppins_blackitalic, weight = FontWeight.Black, style = FontStyle.Italic),
    Font(R.font.poppins_extrabold, weight = FontWeight.ExtraBold),
    Font(R.font.poppins_extrabolditalic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(R.font.poppins_bold, weight = FontWeight.Bold),
    Font(R.font.poppins_bolditalic, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(R.font.poppins_medium, weight = FontWeight.Medium),
    Font(R.font.poppins_mediumitalic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.poppins_regular, weight = FontWeight.Normal),
    Font(R.font.poppins_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(R.font.poppins_thin, weight = FontWeight.Thin),
    Font(R.font.poppins_thinitalic, weight = FontWeight.Thin, style = FontStyle.Italic),
    Font(R.font.poppins_light, weight = FontWeight.Light),
    Font(R.font.poppins_lightitalic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(R.font.poppins_extralight, weight = FontWeight.ExtraLight),
    Font(R.font.poppins_extralightitalic, weight = FontWeight.ExtraLight, style = FontStyle.Italic)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 40.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )
)

val myTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 40.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    )
)