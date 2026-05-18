package com.senai.carterinhadigital.feature.carteirinha.data.repository


import com.senai.carterinhadigital.feature.carteirinha.domain.model.Carteirinha
interface CarteirinhaRepository {
    suspend fun buscarCarteirinha(): Result<Carteirinha>
}