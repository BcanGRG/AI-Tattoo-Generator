package com.bcan.aitattoogenerator.presentation.utils.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.bcan.aitattoogenerator.presentation.ui.sheets.BottomSheetHost
import com.bcan.aitattoogenerator.ui.theme.Black11
import com.bcan.aitattoogenerator.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AiTattooGeneratorNavigation() {
    val navController = rememberNavController()
    val entry by navController.currentBackStackEntryAsState()
    val currentDestination = entry?.destination

    val snackbarHostState = remember { SnackbarHostState() }
    val sheetState = rememberModalBottomSheetState()

    BottomSheetHost(sheetState = sheetState)

    Scaffold(
        bottomBar = { AiTattooGeneratorBottomBar(currentDestination, navController) },
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        contentColor = White
    ) {
        NavHost(
            modifier = Modifier
                .background(Black11)
                .padding(it)
                .fillMaxSize(),
            navController = navController,
            startDestination = Graphs.GenerateGraph,
        ) {
            generateGraph()
            myTattoosGraph()
        }
    }
}