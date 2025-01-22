package com.bcan.aitattoogenerator.presentation.generate.sections

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bcan.aitattoogenerator.R
import com.bcan.aitattoogenerator.ui.theme.AbbeyGray
import com.bcan.aitattoogenerator.ui.theme.EerieBlack
import com.bcan.aitattoogenerator.ui.theme.Manatee
import com.bcan.aitattoogenerator.ui.theme.Tundora
import com.bcan.aitattoogenerator.ui.theme.White

@Composable
fun AdvancedDesignSection(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 100.dp)
            .clickable { onClick() },
        colors = CardDefaults.cardColors().copy(containerColor = Tundora)
    ) {
        Row(
            modifier = Modifier.padding(start = 16.dp, top = 18.dp, bottom = 18.dp)
        ) {
            AdvancedDesignItem()
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                modifier = Modifier.height(85.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Advanced Design",
                    fontSize = 16.sp,
                    color = White
                )
                Text(
                    text = "(Optional)",
                    fontSize = 13.sp,
                    color = Manatee
                )
            }
        }
    }
}

@Composable
fun AdvancedDesignItem() {
    Card(
        modifier = Modifier.size(85.dp),
        colors = CardDefaults.cardColors().copy(containerColor = EerieBlack),
        border = BorderStroke(1.dp, AbbeyGray)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Icon(
                painter = painterResource(R.drawable.ic_advanced),
                contentDescription = null,
                modifier = Modifier.align(Alignment.Center),
                tint = White
            )
        }
    }
}