package com.example.shop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

class ShopEntryImpl : ShopEntry() {
    @Composable
    override fun Composable(navController: NavHostController, backStackEntry: NavBackStackEntry) {
        ShopNavigation()
    }


}
