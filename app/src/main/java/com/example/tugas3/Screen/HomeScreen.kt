package com.example.tugas3.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CandlestickChart
import androidx.compose.material.icons.filled.Casino
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas3.Asset.BoxPilihan
import com.example.tugas3.ui.theme.Tugas3Theme

@Composable
fun HomeScreen(
    navController: NavController
){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        contentAlignment = Alignment.Center){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Arya Bramaputra\n21060120120033\nPAPB Tugas 3",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(10.dp))

            BoxPilihan(
                title = "Calculator",
                Icon = Icons.Default.Casino,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .clickable { navController.navigate(route="Calculator_Screen")})


            Spacer(modifier = Modifier.height(10.dp))

            BoxPilihan(
                title = "Volume",
                Icon = Icons.Default.CandlestickChart,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .clickable { navController.navigate(route = "Volume_Screen")})
            }
        }
    }


@Preview
@Composable
fun PreviewHomeScreen(){
    Tugas3Theme {
        HomeScreen(navController = rememberNavController())
    }
}