package com.example.inventoryapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun InventoryScreen(navController: NavHostController) {

    LazyColumn {
        stickyHeader {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(8.dp),
                onClick = {
                    navController.navigate("main")
                }) {
                Text(
                    text = stringResource(id = R.string.return_main),
                    style = MaterialTheme.typography.bodyLarge
                )

            }
        }
        items(150) {

            Text(
                text = "Item $it",
                fontSize = 24.sp,
                fontWeight =  FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )
        }
    }
    
}