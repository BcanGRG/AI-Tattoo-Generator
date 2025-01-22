package com.bcan.aitattoogenerator.presentation.generate.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bcan.aitattoogenerator.ui.theme.Boulder
import com.bcan.aitattoogenerator.ui.theme.Heliotrope
import com.bcan.aitattoogenerator.ui.theme.RoyalBlue
import com.bcan.aitattoogenerator.ui.theme.describeTattooTextFieldGradient

@Composable
fun DescribeTattooTextField(
    modifier: Modifier = Modifier,
    text: String,
    onValueChange: (String) -> Unit
) {
    val maxCharacters = 50

    Box(
        modifier = modifier
            .requiredHeightIn(min = 100.dp)
            .fillMaxWidth()
            .border(
                border = BorderStroke(1.dp, describeTattooTextFieldGradient),
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        BasicTextField(
            value = text,
            onValueChange = { newText ->
                if (newText.length <= maxCharacters) {
                    onValueChange(newText)
                }
            },
            modifier = Modifier
                .matchParentSize()
                .padding(
                    horizontal = 16.dp,
                    vertical = 12.dp
                ),
            textStyle = TextStyle(
                fontSize = 14.sp,
                lineHeight = 14.sp,
                color = Heliotrope
            ),
            cursorBrush = SolidColor(RoyalBlue),
        )
        Text(
            text = "${text.length}/$maxCharacters",
            style = TextStyle(
                fontSize = 12.sp,
                color = if (text.length == maxCharacters) Heliotrope else Boulder
            ),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(10.dp)
        )
    }
}
