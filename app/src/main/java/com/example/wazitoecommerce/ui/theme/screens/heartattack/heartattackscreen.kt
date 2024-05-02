package com.example.wazitoecommerce.ui.theme.screens.faint

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun heartattackscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }

}

@Composable
@Preview(showBackground = true)
fun heartattackscreenPreview(){
    heartattackscreen(navController = rememberNavController())

}