package com.senai.carterinhadigital.feature.unidadecurricular.presentation

import com.senai.carterinhadigital.feature.unidadecurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)