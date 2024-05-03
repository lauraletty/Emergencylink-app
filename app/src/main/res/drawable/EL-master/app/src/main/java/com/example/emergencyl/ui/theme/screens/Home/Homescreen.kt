package com.example.emergencyl.ui.theme.screens.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.R
import com.example.emergencyl.navigation.LOGIN_URL
import com.example.emergencyl.ui.theme.EmergencyLTheme
import com.example.emergencyl.ui.theme.screens.heartattack.HeartattackScreen

@Composable
fun Homescreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Emergency",
            modifier = Modifier
                .size(width = 120.dp, height = 140.dp)
                .padding(top = 20.dp)
                .clip(RoundedCornerShape(size = 100.dp))
        )
        Spacer(modifier = Modifier.height(60.dp))

        Text(text = "Welcome.Easy, fast and reliable assistance.",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = androidx.compose.ui.graphics.Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp))
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {
            navController.navigate(LOGIN_URL)
        }) {

            Text(text = "LOGIN",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .size(120.dp, height = 20.dp)
                    .padding(start = 30.dp, end = 30.dp),
                textAlign = TextAlign.Center,
            )


        }


    }

}
@Composable
@Preview(showBackground = true)
fun HomescreenPreview(){
   Homescreen(navController = rememberNavController())
    }
