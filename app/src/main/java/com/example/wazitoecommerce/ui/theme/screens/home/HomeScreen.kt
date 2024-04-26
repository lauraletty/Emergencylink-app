package com.example.wazitoecommerce.ui.theme.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.CALL_URL
import com.example.wazitoecommerce.navigation.DASHBOARD_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun HomeScreen(navController:NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        
        Text(text = "Choose what you want.", fontSize = 25.sp, fontWeight = FontWeight.ExtraBold, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier = Modifier
            .padding(25.dp)){
            //Column1
            Column {
                Card(modifier = Modifier
                    .height(250.dp)
                    .width(150.dp),
                    border = BorderStroke(width = 5.dp, color = Color.Black)
                    ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.call),
                            contentDescription = "help",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.FillBounds
                        )
                        Spacer(modifier = Modifier.height(20.dp))


                    }




                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Emergency Call",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 30.dp)
                    )

                    Button(
                        onClick = {
                                  navController.navigate(CALL_URL)
                        },
                        modifier = Modifier
                            .padding(start = 30.dp, top = 10.dp)
                    )
                    {
                        Text(
                            text = "CALL",
                            color = Color.White
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))


            }
            //End of Column1
            Spacer(modifier = Modifier.width(30.dp))
            //Column2
            Column {
                Card(modifier = Modifier
                    .height(250.dp)
                    .width(150.dp),
                    border = BorderStroke(width = 5.dp, color = Color.Black)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.aid),
                            contentDescription = "help",
                            modifier = Modifier
                                .size(100.dp),
                            contentScale = ContentScale.FillBounds
                        )
                        Spacer(modifier = Modifier.height(20.dp))


                    }




                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "First Aid",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 30.dp)
                    )

                    Button(
                        onClick = {
                                  navController.navigate(DASHBOARD_URL)
                        },
                        modifier = Modifier
                            .padding(start = 30.dp, top = 10.dp)
                    )
                    {
                        Text(
                            text = "CALL",
                            color = Color.White
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))


            }
            //end of column2
            Spacer(modifier = Modifier.width(30.dp))


            //column3
        }
        

    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}