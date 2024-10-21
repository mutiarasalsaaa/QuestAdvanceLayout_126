package com.example.prakpam3.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meet4.R

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection()
        DataMhs()
    }
}

@Composable
fun HeaderSection() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.LightGray)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.umy1.png),
                contentDescription = null,
                modifier = Modifier.size(50.dp).clip(CircleShape)
            )
            Icon(
                Icons.Filled.Check,
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
            Column(
                modifier = Modifier.padding(14.dp)
            ) {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DataMhs() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Name",
                modifier = Modifier.weight(0.8f)
            )
            Text(text = ":")
            Text(
                text = "Prof. Joko Indro Satrio Wijaya, S. Kom.",
                modifier = Modifier.weight(2f)
            )
        }
    }
}
