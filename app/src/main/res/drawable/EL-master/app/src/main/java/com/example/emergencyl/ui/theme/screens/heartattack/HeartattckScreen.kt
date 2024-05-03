package com.example.emergencyl.ui.theme.screens.heartattack

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.ui.theme.EmergencyLTheme
import com.example.emergencyl.ui.theme.screens.home.HomeScreen

@Composable
fun HeartattackScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }

}
@Composable
@Preview(showBackground = true)
fun HeartattackScreenPreview(){
    EmergencyLTheme {
        HeartattackScreen(navController = rememberNavController())
    }
}