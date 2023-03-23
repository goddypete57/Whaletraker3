package com.example.whaletraker3.screens.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.Black_alpha
import com.example.whaletraker3.ui.theme.BorderColor
import com.example.whaletraker3.ui.theme.TextFiledIndicator
import com.example.whaletraker3.ui.theme.White

@Composable
fun PriceLimit() {

    var priceLimit by remember {
        mutableStateOf(TextFieldValue( ""))
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(vertical = 20.dp, horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {


        Column() {
            Text(
                text =  "Add a price limit to be notified when a whale falls \n" +
                        "below this limit.",
                fontWeight = FontWeight.Normal,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
                fontSize = 15.sp,
                textAlign = TextAlign.Start
            )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text =  "Price Limit",
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),
                    fontSize = 15.sp,
                    textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(value  = priceLimit,  onValueChange = {
                    priceLimit=it
                },
                    placeholder = {
                        Text(
                            text = "Set price",
                            fontSize = 15.sp,
                            fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
                            color = White,

                            )
                    },
                    textStyle = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Start,
                    ),
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = White,
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = BorderColor,
                        unfocusedIndicatorColor = BorderColor,
                        disabledIndicatorColor = Color.Transparent,
                        placeholderColor = White.copy(alpha = 0.8f),
                        backgroundColor = Black_alpha,
                        cursorColor= White
                    ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        autoCorrect = true,
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),

                    singleLine = true,
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(4.dp))
                        .height(
                            56.dp
                        ),

                    )





        }

        OutlinedButton(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(
                    bottom = 20.dp
                )
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(55.dp)
                .clip(RoundedCornerShape(30.dp)),
            enabled = true,
            onClick = {

            },
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = White,
                contentColor = Color.White
            ),
            border = BorderStroke(0.dp, Color.Transparent)
        ) {
            Box(Modifier.fillMaxWidth()) {
                Text(
                    text ="Set Limit",
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),
                    fontSize = 16.sp,
                    letterSpacing = 0.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.align(Alignment.Center),
                    color = Color.Black
                )

//                if (processing) {
//                    CircularProgressIndicator(
//                        modifier = Modifier
//                            .size(25.dp)
//                            .align(Alignment.CenterEnd),
//                        color = Color.White,
//                        strokeWidth = 2.dp
//                    )
//                }
            }
        }


    }
}