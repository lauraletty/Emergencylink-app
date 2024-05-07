package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.HEARTATTACK_URL

import com.example.wazitoecommerce.ui.theme.screens.HOME.Homescreen
import com.example.wazitoecommerce.ui.theme.screens.call.callscreen
import com.example.wazitoecommerce.ui.theme.screens.faint.chestscreen
import com.example.wazitoecommerce.ui.theme.screens.faint.faintscreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.home.dashboardscreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.anklescreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.brokenscreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.burnscreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.heartattackscreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.nosebleedscreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.spinalscreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = HOMEP_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(HOMEP_URL){
            Homescreen(navController = navController)
        }
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }

        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
        composable(DASHBOARD_URL){
            dashboardscreen(navController = navController)
        }
        composable(CALL_URL){
            callscreen(navController = navController)
        }

        composable(NOSEBLEED_URL){
            nosebleedscreen(navController = navController)
        }

        composable(CHEST_URL){
            chestscreen(navController = navController)
        }

        composable(BROKENLIMB_URL){
            brokenscreen(navController = navController)
        }

        composable(BURN_URL){
            burnscreen(navController = navController)
        }

        composable(FAINT_URL){
            faintscreen(navController = navController)
        }

        composable(SPINAL_URL){
            spinalscreen(navController = navController)
        }

        composable(ANKLE_URL){
            anklescreen(navController = navController)
        }

        composable(HEARTATTACK_URL){
            heartattackscreen(navController = navController)
        }
    }
}