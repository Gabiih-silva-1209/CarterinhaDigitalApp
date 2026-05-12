package com.senai.carterinhadigital.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.senai.carterinhadigital.navigation.AppNavHost
import com.senai.carterinhadigital.core.designsystem.theme.CarterinhaDigitalTheme

@Composable
fun App() {
    CarterinhaDigitalTheme {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}