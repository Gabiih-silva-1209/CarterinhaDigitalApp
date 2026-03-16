package com.senai.carterinhadigital.app

import androidx.compose.runtime.Composable

@Composable
fun App(){
    CarterinhaDigitalApp(){
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}