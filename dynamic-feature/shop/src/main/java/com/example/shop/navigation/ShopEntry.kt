package com.example.shop.navigation

import androidx.navigation.NamedNavArgument
import com.example.navigationdroidcon.navigation.ComposableFeatureEntry

abstract class ShopEntry : ComposableFeatureEntry{
    override val name: String = "Shop"
    override val route: String = "shop"
    override val arguments: List<NamedNavArgument> = emptyList()

    companion object{
        fun create(): ShopEntry = ShopEntryImpl()
    }
}