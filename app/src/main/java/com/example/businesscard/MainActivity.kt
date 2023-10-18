package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardText("Andi Ichwan Farmawan", "Android Developer Extraordinaire")
                }
            }
        }
    }
}

@Composable
fun CardText(name: String, job: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxHeight().fillMaxWidth().background(
        Color(0xFFd2e8d4))){
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .background(Color.Black)
                .padding(4.dp)
        )
        Text(
            text = name,
            fontSize = 32.sp,
            lineHeight = 116.sp,
            color = Color.Black,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = job,
            fontSize = 16.sp,
            color = Color(0xFF006833), modifier = Modifier.padding(top = 4.dp)
        )
    }
    ContactText()
}

@Composable
fun ContactText(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(bottom = 20.dp, start = 50.dp)){
        Row(modifier = Modifier.padding(8.dp)) {
            Icon(
                Icons.Filled.Call,
                contentDescription = "Localized description",
                tint = Color.Black,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "+62-812-3456-789",
                fontSize = 16.sp,
                color = Color.Black
            )
        }
        Row(modifier = Modifier.padding(8.dp)){
            Icon(
                Icons.Filled.Share,
                contentDescription = "Localized description",
                tint = Color.Black,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "@andiichwann",
                fontSize = 16.sp,
                color = Color.Black
            )
        }

        Row(modifier = Modifier.padding(8.dp)){
            Icon(
                Icons.Filled.Email,
                contentDescription = "Localized description",
                tint = Color.Black,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "andiichwann@gmail.com",
                fontSize = 16.sp,
                color = Color.Black
            )
        }

    }
}



@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        CardText("Andi Ichwan Farmawan", "Android Developer Extraordinaire")

    }
}