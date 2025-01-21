package com.bcan.aitattoogenerator.presentation.utils.navigation

import androidx.compose.foundation.layout.height
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import com.bcan.aitattoogenerator.R
import kotlinx.serialization.Serializable

val bottomNavDestinations =
    listOf(
        BottomNavItem(Graphs.GenerateGraph, R.drawable.ic_generate, "Generate"),
        BottomNavItem(Graphs.MyTattoosGraph, R.drawable.ic_heart, "My Tattoos"),
    )


@Serializable
data class BottomNavItem(
    val route: Graphs,
    val icon: Int,
    val text: String,
)

@Composable
fun AiTattooGeneratorBottomBar(
    currentDestination: NavDestination?,
    navController: NavController
) {
    BottomAppBar(
        containerColor = Color.White,
        modifier = Modifier.height(80.dp)
    ) {
        bottomNavDestinations.forEach { destination ->
            NavigationBarItem(
                selected = currentDestination?.hierarchy?.any {
                    it.hasRoute(destination.route::class)
                } ?: false,
                onClick = { navController.navigate(destination.route) },
                icon = {
                    Icon(
                        painter = painterResource(destination.icon),
                        contentDescription = "Icon"
                    )
                },
                label = { Text(text = destination.text) }
            )
        }
    }
}