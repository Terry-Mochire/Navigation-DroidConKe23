package com.example.navigationdroidcon.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationdroidcon.ui.MainViewModel
import com.example.navigationdroidcon.ui.screens.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    val shopFeatureEntry = Class.forName("com.example.shop.navigation.ShopEntryImpl").newInstance() as ComposableFeatureEntry

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            val context: Context = LocalContext.current
            val viewModel = MainViewModel(context = context)
            HomeScreen(viewModel = viewModel, navHostController = navController)
        }
        composable("shop") {
            shopFeatureEntry.Composable(navController = navController, backStackEntry = it )
        }
    }


}