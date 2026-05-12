package com.senai.carterinhadigital.feature.carteirinha.presentation

sealed interface CarteirinhaEvent {
    data object OnCarregarDados : CarteirinhaEvent
    data object OnTentarNovamenteClick : CarteirinhaEvent
    data object OnVoltarClick : CarteirinhaEvent
}