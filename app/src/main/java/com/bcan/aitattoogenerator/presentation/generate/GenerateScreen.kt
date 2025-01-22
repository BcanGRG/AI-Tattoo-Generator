package com.bcan.aitattoogenerator.presentation.generate

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bcan.aitattoogenerator.presentation.generate.components.DescribeTattooTextField
import com.bcan.aitattoogenerator.presentation.ui.TitleText
import com.bcan.aitattoogenerator.ui.theme.White
import com.bcan.aitattoogenerator.ui.theme.getProButtonGradient

@Composable
fun GenerateScreen() {

    var describeTattooText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TitleText(text = "Describe Your Tattoo".uppercase())
            Surface(
                color = Color.Transparent,
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(getProButtonGradient)
                    .clickable { }
            ) {
                Text(
                    text = "Get Pro".uppercase(),
                    modifier = Modifier.padding(vertical = 3.dp, horizontal = 10.dp),
                    color = White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold, letterSpacing = 1.2.sp
                )
            }
        }

        DescribeTattooTextField(
            text = describeTattooText,
            onValueChange = { describeTattooText = it }
        )

        TitleText(text = "Select Style".uppercase())
    }
}