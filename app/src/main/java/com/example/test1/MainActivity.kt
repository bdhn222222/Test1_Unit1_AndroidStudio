package com.example.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test1.ui.theme.Test1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinessCard("Nguyen Bui")
                }
            }
        }
    }
}

@Composable
fun BussinessCard(name: String, modifier: Modifier = Modifier) {
    val background = painterResource(R.drawable.background_card)
    Box{
        Image(
            painter = background,
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        )
        Column (
            modifier= Modifier
                .fillMaxSize()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painterResource(id = R.drawable.logo_2021_nho),
                contentDescription = "Logo UED",
                modifier
                    .width(150.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = name,
                color = Color.Yellow,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "21CNTTC",
                color = Color.Yellow,
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(45.dp))
            Column(
                modifier
                    .fillMaxWidth()
                    .padding(bottom = 50.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column {
                    Row {
                        Icon(
                            Icons.Rounded.Call,
                            contentDescription = "Phone",
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = stringResource(id = R.string.telephone),
                            fontSize = 18.sp,
                            color = Color.White,
                        )
                    }
                    Row {
                        Icon(
                            Icons.Rounded.Email,
                            contentDescription = "Mail",
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = stringResource(id = R.string.email),
                            fontSize = 18.sp,
                            color = Color.White,
                        )
                    }
                    Row {
                        Icon(
                            Icons.Rounded.LocationOn,
                            contentDescription = "Address",
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = stringResource(id = R.string.address),
                            fontSize = 18.sp,
                            color = Color.White,
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Test1Theme {
        BussinessCard("Android")
    }
}