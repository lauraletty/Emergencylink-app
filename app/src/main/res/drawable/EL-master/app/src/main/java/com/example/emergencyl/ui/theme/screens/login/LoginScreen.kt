package com.example.emergencyl.ui.theme.screens.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.R
import com.example.emergencyl.data.AuthViewModel
import com.example.emergencyl.navigation.HOME_URL
import com.example.emergencyl.navigation.SIGNUP_URL
import com.example.emergencyl.ui.theme.EmergencyLTheme

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.health),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Login in to your account",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(20.dp))

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "email") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password"
                )
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )




        Spacer(modifier = Modifier.height(40.dp))
        val authViewModel = AuthViewModel(navController, context)

        Button(onClick = {
            navController.navigate(HOME_URL)



        }) {
            Text(text = "Login",
                modifier = Modifier
                    .size(width = 120.dp, height = 20.dp),
                textAlign = TextAlign.Center)
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Dont have an account yet",
            modifier = Modifier
                .clickable {
                    navController.navigate(SIGNUP_URL)
                },
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )
    }

}
@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    EmergencyLTheme {
        LoginScreen(navController = rememberNavController())
    }
}