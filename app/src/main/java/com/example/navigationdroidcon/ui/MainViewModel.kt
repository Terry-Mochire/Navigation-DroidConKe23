package com.example.navigationdroidcon.ui

import android.content.Context
import android.util.Log
import androidx.navigation.compose.rememberNavController
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest


const val SHOP_MODULE = "shop"
const val TAG = "MainViewModel"

class MainViewModel(
    val context: Context
) {
    val splitInstallManager = SplitInstallManagerFactory.create(context)


//    init {
//        if (splitInstallManager.installedModules.contains(SHOP_MODULE)) {
//            installShopModule()
//        } else {
//            navigateToShop()
//        }
//    }

    fun installShopModule() {
        val request = SplitInstallRequest.newBuilder()
            .addModule(SHOP_MODULE)
            .build()

        splitInstallManager.startInstall(request)
            .addOnFailureListener {
                Log.d(TAG, "Module install failed with ${it.message}")
            }
            .addOnSuccessListener {
                Log.d(TAG, "Module install success")
            }
    }

    fun navigateToShop() {

    }

}