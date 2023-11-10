package com.example.shop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shop.ui.ShopScreen

@Composable
fun ShopNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "shop") {

        composable("shop") {
            ShopScreen(navController)
        }
    }

}