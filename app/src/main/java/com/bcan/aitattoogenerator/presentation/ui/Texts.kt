package com.bcan.aitattoogenerator.presentation.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.bcan.aitattoogenerator.ui.theme.White

@Composable
fun TitleText(
    modifier: Modifier = Modifier,
    text: String?
) {
    Text(
        text = text.orEmpty(),
        modifier = modifier,
        color = White, fontSize = 15.sp
    )
}