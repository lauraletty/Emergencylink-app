package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.ui.theme.screens.call.callscreen
import com.example.wazitoecommerce.ui.theme.screens.First.firstscreen
import com.example.wazitoecommerce.ui.theme.screens.Upload.uploadscreen
import com.example.wazitoecommerce.ui.theme.screens.anklesprain.AddAnkleScreen
import com.example.wazitoecommerce.ui.theme.screens.anklesprain.ViewAnkleScreen
import com.example.wazitoecommerce.ui.theme.screens.emergency.emergencyscreen
import com.example.wazitoecommerce.ui.theme.screens.chestpain.chestscreen
import com.example.wazitoecommerce.ui.theme.screens.faint.faintscreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.dashboard.dashboardscreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.anklesprain.anklescreen
import com.example.wazitoecommerce.ui.theme.screens.brokenlimbs.AddBrokenlimbsScreen
import com.example.wazitoecommerce.ui.theme.screens.brokenlimbs.ViewBrokenlimbsScreen
import com.example.wazitoecommerce.ui.theme.screens.brokenlimbs.brokenscreen
import com.example.wazitoecommerce.ui.theme.screens.burn.AddBurnScreen
import com.example.wazitoecommerce.ui.theme.screens.burn.ViewBurnScreen
import com.example.wazitoecommerce.ui.theme.screens.burn.burnscreen
import com.example.wazitoecommerce.ui.theme.screens.chestpain.AddChestpainScreen
import com.example.wazitoecommerce.ui.theme.screens.chestpain.ViewChestpainScreen
import com.example.wazitoecommerce.ui.theme.screens.faint.AddFaintScreen
import com.example.wazitoecommerce.ui.theme.screens.faint.ViewFaintScreen
import com.example.wazitoecommerce.ui.theme.screens.heartattack.AddHeartattackScreen
import com.example.wazitoecommerce.ui.theme.screens.heartattack.ViewHeartattackScreen
import com.example.wazitoecommerce.ui.theme.screens.heartattack.heartattackscreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.AddNosebleedScreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.ViewNosebleedScreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.nosebleedscreen
import com.example.wazitoecommerce.ui.theme.screens.spinalinjury.spinalscreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.spinalinjury.AddSpinalScreen
import com.example.wazitoecommerce.ui.theme.screens.spinalinjury.ViewSpinalScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.splashscreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = FIRST_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(FIRST_URL){
            firstscreen(navController = navController)
        }
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }

        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }

        composable(UPLOAD_URL){
            uploadscreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
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
        composable(SPLASH_URL){
            splashscreen(navController = navController)
        }

        composable(EMERGENCY_URL){
            emergencyscreen(navController = navController)
        }
        composable(ADDANKLESCREEN_URL){
            AddAnkleScreen(navController = navController)
        }
        composable(VIEWANKLESCREEN_URL){
            ViewAnkleScreen(navController = navController)
        }
        composable(ADDBROKENLIMBSSCREEN_URL){
            AddBrokenlimbsScreen(navController = navController)
        }
        composable(VIEWBROKENLIMBSSCREEN_URL){
            ViewBrokenlimbsScreen(navController = navController)
        }
        composable(ADDBURNSCREEN_URL){
            AddBurnScreen(navController = navController)
        }
        composable(VIEWBURNSCREEN_URL){
            ViewBurnScreen(navController = navController)
        }
        composable(ADDCHESTPAINSCREEN_URL){
            AddChestpainScreen(navController = navController)
        }
        composable(VIEWCHESTPAINSCREEN_URL){
            ViewChestpainScreen(navController = navController)
        }
        composable(ADDFAINTSCREEN_URL){
            AddFaintScreen(navController = navController)
        }
        composable(VIEWFAINTSCREEN_URL){
            ViewFaintScreen(navController = navController)
        }
        composable(ADDHEARTATTACKSCREEN_URL){
            AddHeartattackScreen(navController = navController)
        }
        composable(VIEWHEARTATTACKSCREEN_URL){
            ViewHeartattackScreen(navController = navController)
        }
        composable(ADDNOSEBLEEDSCREEN_URL){
            AddNosebleedScreen(navController = navController)
        }
        composable(VIEWNOSEBLEEDSCREEN_URL){
            ViewNosebleedScreen(navController = navController)
        }
        composable(ADDSPINALSCREEN_URL){
            AddSpinalScreen(navController = navController)
        }
        composable(VIEWSPINALSCREEN_URL){
            ViewSpinalScreen(navController = navController)
        }
    }
}