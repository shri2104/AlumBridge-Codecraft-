package com.example.readerapp.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.readerapp.RHomeScreen

import com.example.readerapp.Screen.Login.RLoginScreen
import com.example.readerapp.Screen.RSplashScreen

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun RNavigation(){
    val navController= rememberNavController()
    NavHost(navController=navController,startDestination = ReaderScreens.SplashScreen.name){
        composable(ReaderScreens.SplashScreen.name){
            RSplashScreen(navController=navController)
        }
        composable(ReaderScreens.LoginScreen.name){
            RLoginScreen(navController=navController)
        }
        composable(ReaderScreens.ReaderHomeScreen.name){
            RHomeScreen()
        }
    }
}