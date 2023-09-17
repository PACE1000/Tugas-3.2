package com.example.tugas3.NavGraph

sealed class Screen(
    val route:String
){
    object HomeScreen:Screen(route="Home_Screen")
    object CalculatorScreen:Screen(route="Calculator_Screen")
    object VolumeScreen:Screen(route = "Volume_Screen")
}
