package com.bcan.aitattoogenerator.presentation.generate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bcan.aitattoogenerator.presentation.generate.components.DescribeTattooTextField
import com.bcan.aitattoogenerator.presentation.generate.components.GenerateButton
import com.bcan.aitattoogenerator.presentation.generate.sections.AdvancedDesignSection
import com.bcan.aitattoogenerator.presentation.generate.sections.SelectStyleSection
import com.bcan.aitattoogenerator.presentation.generate.sections.TitleAndGetProSection

@Composable
fun GenerateScreen() {

    var describeTattooText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        TitleAndGetProSection(onGetProClick = {})

        DescribeTattooTextField(
            text = describeTattooText,
            onValueChange = { describeTattooText = it }
        )

        SelectStyleSection()
        AdvancedDesignSection()

        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.BottomCenter
        ) {
            GenerateButton(onClick = {})
        }
    }
}