package com.senai.carterinhadigital.feature.carteirinha.presentation

import com.senai.carterinhadigital.feature.carteirinha.domain.model.Carteirinha

data class CarteirinhaUiState(
    val isLoading: Boolean = false,
    val carteirinha: Carteirinha? = null,
    val errorMessage: String? = null
)