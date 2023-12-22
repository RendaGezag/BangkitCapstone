package com.example.educasea.ui.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.educasea.ui.model.BiotaViewModel
import com.example.educasea.ui.route.Destinations
import com.example.educasea.ui.screen.BiotaPage
import com.example.educasea.ui.screen.HomePage
import com.example.educasea.ui.screen.LearningPage
import com.example.educasea.ui.screen.ProfilePage
import com.example.educasea.ui.screen.ScanPage

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Destinations.HomePage.route) {
        composable(Destinations.HomePage.route) {
            HomePage(modifier = Modifier.fillMaxSize())
        }

        composable(Destinations.ScanPage.route) {
            ScanPage(modifier = Modifier.fillMaxSize())
        }

        composable(Destinations.LearningPage.route) {
            BiotaPage(modifier = Modifier.fillMaxSize(), vm = BiotaViewModel())
        }

        composable(Destinations.ProfilePage.route) {
            ProfilePage(modifier = Modifier.fillMaxSize())
        }
    }
}