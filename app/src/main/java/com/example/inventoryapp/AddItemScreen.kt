package com.example.inventoryapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddItemScreen(navController: NavHostController) {
    var itemName by rememberSaveable { mutableStateOf("")}
    var barCode by rememberSaveable {mutableStateOf("")}
    var itemDescription by rememberSaveable { mutableStateOf("")}
    var quantity by rememberSaveable { mutableStateOf("")}

    Column(
        modifier = Modifier
            .padding(16.dp, 16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = stringResource(id = R.string.add_item),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.displaySmall
        )

        Text(
            text = stringResource(id = R.string.item_name),
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = itemName,
            onValueChange = { itemName = it},
            placeholder = { Text(text = "Ej. Carlos V 30g")}
        )

        Spacer(modifier = Modifier.padding(4.dp))

        Text(
            text = stringResource(id = R.string.bar_code),
            style = MaterialTheme.typography.bodyLarge
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            TextField(
                value = barCode,
                onValueChange = { barCode = it},
                placeholder = { Text(text = "Ej. 10005879 ")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            IconButton( onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.baseline_camera_alt_24),
                    contentDescription = "Camera Scanner"
                )

            }

        }

        Spacer(modifier = Modifier.padding(4.dp))

        Text(
            text = stringResource(id = R.string.description),
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = itemDescription,
            onValueChange = { itemDescription = it},
            placeholder = { Text(text = "Ej. Barra de chocolate individual")},
        )

        Spacer(modifier = Modifier.padding(4.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TextField(
                value = quantity,
                onValueChange = { quantity = it},
                placeholder = { Text(text = "0")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            IconButton( onClick = {
                if(quantity.isNotEmpty()){
                    quantity = (quantity.toInt() + 1).toString()
                }
            }) {
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowUp,
                    contentDescription = "Plus one"
                )
            }

            IconButton( onClick = {
                if(quantity.isNotEmpty()){
                    quantity = (quantity.toInt() - 1).toString()
                }
            }) {
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowDown,
                    contentDescription = "Minus one"
                )
            }

        }


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .align(Alignment.CenterHorizontally),
                    onClick = {
                        navController.navigate("main")
                    }) {
            Text(
                text = stringResource(id = R.string.save),
                style = MaterialTheme.typography.bodyLarge
            )

        }

    }

}
