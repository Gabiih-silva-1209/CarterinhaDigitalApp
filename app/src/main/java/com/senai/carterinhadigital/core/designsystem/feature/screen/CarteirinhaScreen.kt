package com.senai.carterinhadigital.core.designsystem.feature.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    CarteirinhaContent(
        qrCodeContent = "seunumerodematriculaaqui",
        modifier = modifier
    )
}