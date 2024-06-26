package com.example.wazitoecommerce.ui.theme.screens.faint

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.ui.theme.PurpleGrey40

@Composable
fun faintscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40)
    ) {
        Image(painter = painterResource(id = R.drawable.faintaid),
            contentDescription = "faint aid",
            modifier = Modifier
                .fillMaxSize())

    }

}

@Composable
@Preview(showBackground = true)
fun faintscreenPreview(){
    faintscreen(navController = rememberNavController())

}