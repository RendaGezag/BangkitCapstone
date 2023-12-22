package com.example.educasea.ui.route

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.DocumentScanner
import androidx.compose.material.icons.outlined.MenuBook
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destinations(
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    data object HomePage : Destinations(
        route = "home_page",
        title = "Beranda",
        icon = Icons.Filled.Home
    )

    data object ScanPage : Destinations(
        route = "scan_page",
        title = "Scan",
        icon = Icons.Outlined.DocumentScanner
    )

    data object LearningPage : Destinations(
        route = "learning_page",
        title = "Belajar",
        icon = Icons.Outlined.MenuBook
    )

    data object ProfilePage : Destinations(
        route = "profile_screen",
        title = "Profil",
        icon = Icons.Filled.Person
    )
}