package com.senai.carterinhadigital

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.senai.carterinhadigital.ui.theme.bodyFontFamily

@Composable
fun LabelText(
    label: String,
    modifier: Modifier,
){
    Text(
        text = label,
        textAlign = TextAlign.Right,
        style = MaterialTheme.typography.bodyLarge,
        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
        modifier = modifier,
    )
}