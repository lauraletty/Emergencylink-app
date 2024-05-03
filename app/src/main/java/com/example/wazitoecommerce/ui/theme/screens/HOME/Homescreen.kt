package com.example.wazitoecommerce.ui.theme.screens.HOME


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.ui.theme.PurpleGrey40

@Composable
fun Homescreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Emergency",
            modifier = Modifier
                .size(width = 120.dp, height = 140.dp)
                .padding(top = 60.dp)
                .clip(RoundedCornerShape(size = 100.dp))
        )
        Spacer(modifier = Modifier.height(100.dp))

        Text(text = "Welcome.Easy, fast and reliable assistance.",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp))
        Spacer(modifier = Modifier.height(100.dp))

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
fun HomeScreenPreview(){
    Homescreen(navController = rememberNavController())

}