package com.bcan.aitattoogenerator.presentation.generate.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bcan.aitattoogenerator.ui.theme.RoyalBlue

@Composable
fun SelectStyleItem() {
    Column {
        Card(
            modifier = Modifier.size(70.dp),
            shape = RoundedCornerShape(14.dp),
            colors = CardDefaults.cardColors().copy(containerColor = RoyalBlue)
        ) {

        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Watercolor",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            fontSize = 11.sp
        )
    }
}