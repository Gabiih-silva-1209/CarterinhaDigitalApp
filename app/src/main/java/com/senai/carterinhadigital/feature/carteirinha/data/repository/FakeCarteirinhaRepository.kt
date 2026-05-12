package com.senai.carterinhadigital.feature.carteirinha.data.repository

import com.senai.carterinhadigital.feature.carteirinha.domain.model.Carteirinha

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun buscarCarteirinha(): Result<Routes.Carteirinha> {
        delay(1500)

        return Result.success(
            Carteirinha(
                nome = "Gabrieli da Silva Marcelino",
                curso = "Técnico em Desenvolvimento de Sistemas",
                turma = "4DEVM-T1",
                matricula = "12202602",
                unidade = "SENAI Anchieta",
                status = "Ativo",
                qrCodeContent = "MATRICULA:20260001;ALUNO:Gabrieli da Silva Marcelino;TURMA:4DEVM-T1"
            )
        )
    }
}