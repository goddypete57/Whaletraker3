package com.example.whaletraker3.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.*


@Composable
fun AddNewWhale() {
    var userName by remember {
        mutableStateOf(TextFieldValue( ""))
    }
    var phoneNumber by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var wallet_address by remember {
        mutableStateOf(TextFieldValue(""))
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(start = 20.dp, end = 20.dp, top = 24.dp)
            .verticalScroll(rememberScrollState()),
    ) {

        Text(
            text = "Please add whale details here, use a comma \n" +
                    "to separate multiple wallet addresses.",
            fontWeight = FontWeight.Normal,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
            fontSize = 16.sp,
            textAlign = TextAlign.Start
        )


//        OutLineFields(value = userName.toString(), onValueChange ={userName=it}, placeholders = , modifier = )
//
        listOf(1, 2, 3,).forEach { view ->
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text =  when (view) {
                    1 -> "Username"
                    2 -> "Phone Number"
                    else ->"Wallet Address"
                },
                fontWeight = FontWeight.Medium,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),
                fontSize = 15.sp,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value  = when (view) {
                1 -> userName
                2 -> phoneNumber
                else -> wallet_address

            },  onValueChange = {
                when (view) {
                    1 -> userName = it
                    2 -> phoneNumber = it
                    3 -> wallet_address = it

                }
            },
                placeholder = {
                    Text(
                        text = when (view) {
                                1 -> "Username"
                                2 -> "Phone Number"

                                else -> "Paste Wallet Address(es)"
                            },
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
                        color = White.copy(0.8f),

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
                    focusedIndicatorColor = TextFiledIndicator,
                    unfocusedIndicatorColor = BorderColor,
                    disabledIndicatorColor = Color.Transparent,
                    placeholderColor = White.copy(alpha = 0.8f),
                    backgroundColor = Black_alpha,
                    cursorColor= White

                ),
                singleLine = true,
                maxLines = 1,

                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
                    .height(
                        when (view) {
                            3 -> 148.dp
                            else -> 55.dp
                        }
                    ),

                keyboardOptions = KeyboardOptions(
                    keyboardType = if (view == 1 || view == 3) KeyboardType.Text else KeyboardType.Number,
                    imeAction = if (view == 3) ImeAction.Done else ImeAction.Next
                ),
            )



        }
Spacer(modifier = Modifier.height(106.dp))
        OutlinedButton(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(
                    top = 30.dp
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
                    text ="Add Whale",
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

@Preview
@Composable
fun Add() {
    AddNewWhale()
}
