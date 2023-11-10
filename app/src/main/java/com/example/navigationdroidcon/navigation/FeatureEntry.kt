package com.example.navigationdroidcon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

interface FeatureEntry {
    val name: String
    val route: String
    val arguments: List<NamedNavArgument>
}

interface ComposableFeatureEntry : FeatureEntry {
    fun NavGraphBuilder.addComposable(navController: NavHostController){
        route?.let {
            composable(route = it, arguments = arguments) { backStackEntry ->
                Composable(navController = navController, backStackEntry = backStackEntry)
            }
        }
    }

    @Composable
    fun Composable(
        navController: NavHostController,
        backStackEntry: NavBackStackEntry
    )
}

interface DestinationFeatureEntry : FeatureEntry {
    fun NavGraphBuilder.navigation(navController: NavHostController)
}