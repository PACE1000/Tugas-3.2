package com.example.tugas3.Asset

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AllInclusive
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas3.ui.theme.Tugas3Theme

@Composable
fun BoxPilihan(
    title:String,
    Icon: ImageVector,
    modifier: Modifier
){
    Box(
        modifier = modifier
            .width(250.dp)
            .background(Color.White)
            .clip(RoundedCornerShape(10.dp)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            androidx.compose.material3.Icon(
                imageVector = Icon, contentDescription = null)

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = title,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)

            Spacer(modifier = Modifier.width(10.dp))

            androidx.compose.material3.Icon(
                imageVector = Icon, contentDescription = null)
        }
    }
}

@Preview
@Composable
fun PreviewBoxPilihan(){
    Tugas3Theme {
        BoxPilihan(title = "Calculator", Icon = Icons.Default.AllInclusive, modifier = Modifier)
    }
}
