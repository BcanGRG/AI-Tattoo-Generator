package com.bcan.aitattoogenerator.presentation.utils.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.bcan.aitattoogenerator.presentation.generate.GenerateScreen
import com.bcan.aitattoogenerator.presentation.mytattoos.MyTattoosScreen
import kotlinx.serialization.Serializable

@Serializable
sealed class Graphs {
    @Serializable
    data object GenerateGraph : Graphs()

    @Serializable
    data object MyTattoosGraph : Graphs()
}


fun NavGraphBuilder.generateGraph() {
    navigation<Graphs.GenerateGraph>(startDestination = GenerateRoute) {
        composable<GenerateRoute> { GenerateScreen() }
    }
}


fun NavGraphBuilder.myTattoosGraph() {
    navigation<Graphs.MyTattoosGraph>(startDestination = MyTattoosRoute) {
        composable<MyTattoosRoute> { MyTattoosScreen() }
    }
}

