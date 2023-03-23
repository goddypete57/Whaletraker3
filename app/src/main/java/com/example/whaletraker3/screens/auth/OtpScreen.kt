package com.example.whaletraker3.screens.auth

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whaletraker3.R

import com.example.whaletraker3.ui.theme.*

@Composable
fun Otp(
onVerify:()->Unit={},
onBackPress:()->Unit={}
) {

    var codeState by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = TextColor
            )
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.back1),
                contentDescription = "Back",
                modifier = Modifier
                    .size(24.dp)
                    .align(alignment = Start)
                    .clickable {onBackPress.invoke()})
            Spacer(modifier = Modifier.size(20.dp))
            Text(textAlign = TextAlign.Start,
                text = "Verify your account",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            Text(textAlign = TextAlign.Start,
                text = "We have sent a 6-Digit Code to whale@.gmail.com enter code to verify your account",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = SubText)
            Spacer(modifier = Modifier.size(32.dp))
            Text(textAlign = TextAlign.Start,
                text = "6 - Digit Code",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = codeState,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = InputColor,
                    placeholderColor = HeaderText,
                    textColor = HeaderText
                ),
                onValueChange = { newText ->
                    codeState = newText
                },
                shape = RoundedCornerShape(4.dp),
                singleLine = true,
                placeholder = { Text("6-Digit Code") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            )
            Spacer(modifier = Modifier.size(28.dp))
            Button(onClick = {
                onVerify.invoke()
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(contentColor = TextColor,
                    backgroundColor = Color.White)) {
                Text(text = "Verify", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Text(modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal, color = SubText)) {
                        append("Resend code in")
                    }

                    withStyle(style = SpanStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold, color = HeaderText)) {
                        append(" 00:59")
                    }
                }
            )
        }
    }
}

