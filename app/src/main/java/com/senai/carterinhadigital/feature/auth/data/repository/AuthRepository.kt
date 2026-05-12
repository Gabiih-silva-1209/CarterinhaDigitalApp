package com.senai.carterinhadigital.feature.auth.data.repository

import com.senai.carterinhadigital.feature.auth.domain.model.UsuarioLogado


interface AuthRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}