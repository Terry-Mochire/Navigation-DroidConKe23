package com.example.navigationdroidcon

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationdroidcon.navigation.Navigation
import com.example.navigationdroidcon.ui.MainViewModel
import com.example.navigationdroidcon.ui.screens.HomeScreen
import com.example.navigationdroidcon.ui.theme.NavigationDroidconTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationDroidconTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Log.i("", "onCreate: ${MainViewModel(context = this).splitInstallManager.installedModules}")
                    Navigation()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationDroidconTheme {
//        HomeScreen(viewModel = MainViewModel(context = null))
    }
}