package com.bcan.aitattoogenerator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.bcan.aitattoogenerator.presentation.utils.navigation.AiTattooGeneratorNavigation
import com.bcan.aitattoogenerator.ui.theme.AITattooGeneratorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AITattooGeneratorTheme {
                AiTattooGeneratorNavigation()
            }
        }
    }
}