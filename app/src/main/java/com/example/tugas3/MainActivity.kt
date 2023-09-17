package com.example.tugas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tugas3.NavGraph.SetupNavGraph
import com.example.tugas3.ui.theme.Tugas3Theme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas3Theme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}

