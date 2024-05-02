package com.example.wazitoecommerce.ui.theme.screens.faint

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@Composable
fun nosebleedscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.faintaid),
            contentDescription = "faint aid",
            modifier = Modifier
                .fillMaxSize())

    }

}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    nosebleedscreen(navController = rememberNavController())

}