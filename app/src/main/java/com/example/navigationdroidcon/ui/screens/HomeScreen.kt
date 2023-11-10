package com.example.navigationdroidcon.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.navigationdroidcon.ui.MainViewModel
import com.example.navigationdroidcon.ui.SHOP_MODULE

@Composable
fun HomeScreen(
    navHostController: NavHostController,
    viewModel: MainViewModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Home Screen",
            color = Color.White,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )
        Button(onClick = {
            // Downloads the dynamic feature module shop and navigates to the shop screen
            viewModel.installShopModule()
        }) {
            Text(text = "Download shop module")
        }
        if (viewModel.splitInstallManager.installedModules.contains(SHOP_MODULE)) {
            Button(onClick = {
                // Navigates to the shop screen
                navHostController.navigate("shop")
            }) {
                Text(text = "Navigate to shop")
            }

        }
    }
}


