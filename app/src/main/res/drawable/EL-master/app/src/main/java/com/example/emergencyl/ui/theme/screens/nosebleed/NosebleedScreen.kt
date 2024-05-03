package com.example.emergencyl.ui.theme.screens.nosebleed

import androidx.compose.foundation.Image
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
import com.example.emergencyl.R
import com.example.emergencyl.ui.theme.EmergencyLTheme

@Composable
fun NosebleedScreen(navController: NavHostController){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.fnosebleedd),
            contentDescription ="first aid nose",
            modifier = Modifier
                .size(width = 100.dp, height = 1000.dp)
        )

    }

}
@Composable
@Preview(showBackground = true)
fun NosebleedScreenPreview(){
    EmergencyLTheme {
        NosebleedScreen(navController = rememberNavController())
    }
}