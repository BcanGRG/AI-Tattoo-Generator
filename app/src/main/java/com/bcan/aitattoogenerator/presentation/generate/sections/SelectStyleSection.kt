package com.bcan.aitattoogenerator.presentation.generate.sections

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bcan.aitattoogenerator.presentation.generate.components.SelectStyleItem
import com.bcan.aitattoogenerator.presentation.ui.TitleText

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SelectStyleSection() {
    Column {
        TitleText(text = "Select Style".uppercase())
        Spacer(modifier = Modifier.height(12.dp))
        FlowRow(
            modifier = Modifier.horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            repeat(10) { SelectStyleItem() }
        }
    }
}