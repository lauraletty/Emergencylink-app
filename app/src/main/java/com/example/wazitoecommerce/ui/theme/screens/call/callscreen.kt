package com.example.wazitoecommerce.ui.theme.screens.call

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen


@Composable
fun callscreen(navController: NavHostController) {
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun callscreenPreview() {
    callscreen(rememberNavController())
}