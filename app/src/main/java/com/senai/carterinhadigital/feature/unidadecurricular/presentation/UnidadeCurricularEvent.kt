package com.senai.carterinhadigital.feature.unidadecurricular.presentation

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados : UnidadeCurricularEvent //carregar dados
    data object OnTentarNovamenteClick : UnidadeCurricularEvent // em caso de falhas
    data object OnVoltarClick : UnidadeCurricularEvent //voltar a tela anterior
}