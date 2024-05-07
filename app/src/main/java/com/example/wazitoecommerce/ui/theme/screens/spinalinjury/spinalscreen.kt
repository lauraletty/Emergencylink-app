package com.example.wazitoecommerce.ui.theme.screens.nosebleed

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.ui.theme.PurpleGrey40

@Composable
fun spinalscreen(navController: NavHostController){
    Column (
        modifier = Modifier
            .size(width = 80.dp, height = 100.dp)
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.heartattackaid),
            contentDescription ="first aid nose",
            modifier = Modifier
                .size(width = 80.dp, height = 100.dp)
        )

    }

}

@Composable
@Preview(showBackground = true)
fun spinalscreenPreview(){
    spinalscreen(navController = rememberNavController())

}