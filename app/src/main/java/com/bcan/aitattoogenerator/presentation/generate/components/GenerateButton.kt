package com.bcan.aitattoogenerator.presentation.generate.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bcan.aitattoogenerator.presentation.ui.GradientButton
import com.bcan.aitattoogenerator.ui.theme.White
import com.bcan.aitattoogenerator.ui.theme.generateButtonGradient

@Composable
fun GenerateButton(
    onClick: () -> Unit,
) {
    GradientButton(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = generateButtonGradient,
        onClick = onClick
    ) {
        Text(
            text = "Generate".uppercase(),
            modifier = Modifier.padding(vertical = 12.dp), fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = White, textAlign = TextAlign.Center
        )
    }
}