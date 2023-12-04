package com.example.inventoryapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun MainScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .padding(16.dp, 16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = stringResource(id = R.string.inventory_app),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
    }

    Column(
        modifier = Modifier
            .padding(16.dp, 16.dp),
        verticalArrangement = Arrangement.Center
    ) {


        Spacer(modifier = Modifier.padding(40.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .align(Alignment.CenterHorizontally),
            onClick = {
                navController.navigate("inventory_screen")
            }) {
            Text(
                text = stringResource(id = R.string.inventory),
                style = MaterialTheme.typography.bodyLarge
            )

        }

        Spacer(modifier = Modifier.padding(4.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .align(Alignment.CenterHorizontally),
            onClick = {
                navController.navigate("add_item")
            }) {
            Text(
                text = stringResource(id = R.string.add_item),
                style = MaterialTheme.typography.bodyLarge
            )

        }


    }
}