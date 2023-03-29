package com.mobile.whiz.learn_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobile.whiz.learn_jetpack_compose.ui.theme.Learn_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Learn_Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppUi()
                }
            }
        }
    }
}

@Composable
fun AppUi() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MiddleTexts()
            Spacer(modifier = Modifier.height(100.dp))
            RecorderImage()
        }
        Column(
            modifier = Modifier.align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .border(BorderStroke(2.dp, Black), shape = RoundedCornerShape(8.dp))
                    .padding(
                        start = 50.dp,
                        end = 50.dp,
                        top = 10.dp,
                        bottom = 10.dp
                    )
            ) {
                Text(
                    text = "Sign In",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}

@Composable
fun RecorderImage() {
    val image = painterResource(id = R.drawable.ic_recorder)
    Image(
        painter = image,
        contentDescription = "Record voice here",
        modifier = Modifier.size(100.dp)
    )
}

@Composable
fun MiddleTexts() {
    Text(
        text = "BONGABIMA",
        fontSize = 24.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = "Use your voice to purchase insurance",
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Learn_Jetpack_ComposeTheme {
        AppUi()
    }
}