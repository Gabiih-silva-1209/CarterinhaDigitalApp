package com.senai.carterinhadigital.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.senai.carterinhadigital.core.designsystem.navigation.AppNavHost

@Composable
fun App(){
    CarterinhaDigitalApp(){
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}