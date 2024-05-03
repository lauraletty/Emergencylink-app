package com.example.emergencyl.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.ui.theme.screens.call.CallScreen
import com.example.emergencyl.ui.theme.screens.dashboard.DashboardScreen
import com.example.emergencyl.ui.theme.screens.faint.FaintScreen
import com.example.emergencyl.ui.theme.screens.heartattack.HeartattackScreen
import com.example.emergencyl.ui.theme.screens.home.HomeScreen
import com.example.emergencyl.ui.theme.screens.login.LoginScreen
import com.example.emergencyl.ui.theme.screens.nosebleed.NosebleedScreen
import com.example.emergencyl.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = HOMEP_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }

        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HEARTATTACK_URL){
            HeartattackScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(NOSEBLEED_URL){
            NosebleedScreen(navController = navController)
        }
        composable(DASHBOARD_URL){
            DashboardScreen(navController = navController)
        }
        composable(CALL_URL){
            CallScreen(navController = navController)
        }
        composable(FAINT_URL){
            FaintScreen(navController = navController)
        }

        composable(NOSEBLEED_URL){
            NosebleedScreen(navController = navController)
        }
    }
}
