package com.example.whaletraker3.screens.home
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.Black_alpha
import com.example.whaletraker3.ui.theme.BorderColor
import com.example.whaletraker3.ui.theme.TextFiledIndicator
import com.example.whaletraker3.ui.theme.White

@Composable
fun Edit_Whale_Detail_Screen() {

    var username by remember {
        mutableStateOf(TextFieldValue( ""))
    }
    var phoneNumber by remember {
        mutableStateOf(TextFieldValue( ""))
    }
    var wallet_address by remember {
        mutableStateOf(TextFieldValue(""))
    }
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(vertical = 20.dp, horizontal = 20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Image(
                painter = painterResource(id = R.drawable.avater),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .height(80.dp)
                    .width(80.dp)
                    .clickable { },
                contentScale = ContentScale.FillBounds,
            )
            Spacer(modifier = Modifier.height(12.dp))

            Text(text = "Change Avatar",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            ) 
        }
       

        Column() {
            listOf(1, 2,3 ).forEach { view ->
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text =  when (view) {
                        1 -> "UserName"
                        2->"Phone Number"
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
                    1 -> username
                    2->phoneNumber
                    else -> wallet_address

                },  onValueChange = {
                    when (view) {
                        1 -> username = it
                        2 -> phoneNumber = it
                        3->wallet_address=it


                    }
                },
                    placeholder = {
                        Text(
                            text = when (view) {
                                1 -> "username"
                                2->"Phone Number"
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

        }
        Spacer(modifier = Modifier.height(30.dp))

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
                    text ="Save Changes",
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