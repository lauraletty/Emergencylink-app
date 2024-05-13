package com.example.wazitoecommerce.ui.theme.screens.login


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.data.AuthViewModel
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.navigation.UPLOAD_URL


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.login3), contentScale = ContentScale.FillBounds),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Enter your Account details.",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive)
        Spacer(modifier = Modifier.height(30.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Text(text = "Email Address.",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .padding(end = 190.dp))

        Spacer(modifier = Modifier.height(5.dp))

        TextField(value = email,
            onValueChange ={email=it},
            placeholder = { Text(text = "Enter your email.", color = Color.White, fontSize = 15.sp)},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Password.",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .padding(end = 210.dp))

        Spacer(modifier = Modifier.height(5.dp))

        TextField(value = password,
            onValueChange ={password=it},
            placeholder = { Text(text = "Password.", color = Color.White, fontSize = 15.sp)},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()


        )

        Spacer(modifier = Modifier.height(30.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(onClick = {
            authViewModel.login(email, password)
        },
            colors =ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(5.dp)) {
            Text(text = "LOGIN")
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row {
            //column
            Column {
                Text(text = "Dont have an account yet.",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .padding(top = 20.dp)

                )
            }
            //column end
            Spacer(modifier = Modifier.width(20.dp))
            //column
            Button(onClick = {
                navController.navigate(SIGNUP_URL)
            },
                colors = ButtonDefaults.buttonColors(Color.Blue)) {
                Text(text = "SIGN UP", color = Color.White, textAlign = TextAlign.Center)

            }
            //column end
        }


        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Continue as Guest.",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.Black,
            modifier = Modifier
                .padding(top = 20.dp)
                .clickable {
                    navController.navigate(HOME_URL)
                })

        Spacer(modifier = Modifier.height(20.dp))



    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){

    LoginScreen(navController = rememberNavController())

}