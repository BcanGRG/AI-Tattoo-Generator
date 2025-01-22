package com.bcan.aitattoogenerator.presentation.generate.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bcan.aitattoogenerator.presentation.ui.GradientButton
import com.bcan.aitattoogenerator.presentation.ui.TitleText
import com.bcan.aitattoogenerator.ui.theme.White
import com.bcan.aitattoogenerator.ui.theme.getProButtonGradient

@Composable
fun TitleAndGetProSection(
    onGetProClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TitleText(text = "Describe Your Tattoo".uppercase())
        GradientButton(
            shape = RoundedCornerShape(12.dp),
            backgroundColor = getProButtonGradient,
            onClick = onGetProClick
        ) {
            Text(
                text = "Get Pro".uppercase(),
                modifier = Modifier.padding(vertical = 3.dp, horizontal = 10.dp),
                color = White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.2.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}