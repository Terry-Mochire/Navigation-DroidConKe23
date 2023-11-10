package com.example.shop.ui

import android.util.Log
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable

fun ShopScreen(
    navHostController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Shop Screen",
            color = Color.White,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = {
                // Navigate back
                navHostController.popBackStack()
                Log.d("ShopScreen", "ShopScreen: ${navHostController.currentBackStackEntry?.destination?.route}")
        }) {
            Text(text = "Back")
        }
    }

}


//@Preview(showBackground = true)
//@Composable
//fun ShopScreenPreview() {
//    ShopScreen()
//}