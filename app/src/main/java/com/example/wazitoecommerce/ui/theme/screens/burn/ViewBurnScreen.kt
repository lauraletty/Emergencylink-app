package com.example.wazitoecommerce.ui.theme.screens.burn


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.data.BurnViewModel
import com.example.wazitoecommerce.models.burns
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.ui.theme.Purple80
import com.example.wazitoecommerce.ui.theme.PurpleGrey40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewBurnScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally) {
        //TopAppBar
        TopAppBar(title = { Text(text = "BURN FIRST AID",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = Color.White)
        },
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            colors = TopAppBarDefaults.mediumTopAppBarColors(Purple80),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(HOME_URL)
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.White,
                        modifier = Modifier
                            .size(30.dp))
                }
            },

            )
        //end of TopAppBar

        var context = LocalContext.current
        var InstructionRepository = BurnViewModel(navController, context)


        val emptyInstructionState = remember { mutableStateOf(burns("","","","","")) }
        var emptyInstructionsListState = remember { mutableStateListOf<burns>() }

        var instructions = InstructionRepository.allInstructions(emptyInstructionState, emptyInstructionsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Burn first aid Instructions",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(instructions){
                    ProductItem(
                        instruction = it.instruction,
                        instruction1 = it.instruction1,
                        instruction2 = it.instruction2,
                        imageUrl = it.imageUrl,
                        id = it.id,
                        navController = navController,
                        InstructionRepository = InstructionRepository
                    )
                }
            }
        }
    }
}


@Composable
fun ProductItem(instruction:String,
                instruction1:String,
                instruction2:String,
                imageUrl:String,
                id: String,
                navController: NavHostController,
                InstructionRepository: BurnViewModel,
) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = instruction)
        Text(text = instruction1)
        Text(text = instruction2)
        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Button(onClick = {
            InstructionRepository.deleteInstruction(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            //navController.navigate(ROUTE_UPDATE_PRODUCTS+"/$id")
        }) {
            Text(text = "Update")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ViewBrokenlimbsScreenPreview(){

    ViewBurnScreen(navController = rememberNavController())
}