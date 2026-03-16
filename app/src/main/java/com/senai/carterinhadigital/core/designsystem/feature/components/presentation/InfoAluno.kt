package com.senai.carterinhadigital.core.designsystem.feature.components.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun InfoAluno(
    modifier: Modifier = Modifier,
    labelText: String,
    valueText: String,
    fontSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize,
    fontWeight: FontWeight = MaterialTheme.typography.titleLarge.fontWeight ?: FontWeight.Normal,

    ) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        LabelText(
            labelText,
            modifier = Modifier.weight(1f)
        )
        ValueText(
            valueText,
            modifier = Modifier.weight(4f),
            fontWeight = fontWeight,
            fontSize = fontSize
        )
    }
}

@Composable
fun ValueText(x0: String, modifier: Modifier, fontWeight: FontWeight, fontSize: TextUnit) {
    TODO("Not yet implemented")
}