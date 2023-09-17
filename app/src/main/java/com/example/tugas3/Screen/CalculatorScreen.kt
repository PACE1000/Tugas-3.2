package com.example.tugas3.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas3.ui.theme.Tugas3Theme
import java.math.BigDecimal

@Composable
fun CalculatorScreen(){

    var number1 by remember {
        mutableStateOf("")
    }

    var number2 by remember {
        mutableStateOf("")
    }

    var hasil by remember {
        mutableStateOf(BigDecimal.ZERO)
    }
    var Hasil = hasil.toString()

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red), contentAlignment = Alignment.Center){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Masukkan Angka 1",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
            TextField(
                value = number1,
                onValueChange = {number1 = it},
                placeholder = { Text(text = "Masukkan Angka 1")},
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White))

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Masukkan Angka 2",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
            TextField(
                value = number2,
                onValueChange = {number2 = it},
                placeholder = { Text(text = "Masukkan Angka 2")},
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White))

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    val num1 = number1.toBigDecimalOrNull()?: BigDecimal.ZERO
                    val num2 = number2.toBigDecimalOrNull()?: BigDecimal.ZERO
                    hasil = num1 * num2
                }) {
                    Text(text = "*")
                }
                Button(onClick = {
                    val num1 = number1.toBigDecimalOrNull()?: BigDecimal.ZERO
                    val num2 = number2.toBigDecimalOrNull()?: BigDecimal.ZERO
                    hasil = num1 / num2
                }) {
                    Text(text = "/")
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Hasil",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
            TextField(
                value = Hasil,
                onValueChange = {Hasil = it},
                placeholder = { Text(text = "Hasil")},
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White))

        }
    }
}

@Preview
@Composable
fun PreviewCalculatorScreen(){
    Tugas3Theme {
        CalculatorScreen()
    }
}