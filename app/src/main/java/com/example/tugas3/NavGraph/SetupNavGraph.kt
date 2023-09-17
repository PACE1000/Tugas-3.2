package com.example.tugas3.NavGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tugas3.Screen.CalculatorScreen
import com.example.tugas3.Screen.HomeScreen
import com.example.tugas3.Screen.VolumeScreen

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "Home_Screen"){
        composable(route="Home_Screen"){
            HomeScreen(navController = navController)
        }
        composable(route="Calculator_Screen"){
            CalculatorScreen()
        }
        composable(route="Volume_Screen"){
            VolumeScreen()
        }
    }
}