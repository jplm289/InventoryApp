package com.example.inventoryapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.inventoryapp.ui.theme.InventoryAppTheme


@Composable
fun InventoryApp() {
    InventoryAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            //MainScreen()
            //AddItemScreen()
            //InventoryScreen()
        }

    }

}
