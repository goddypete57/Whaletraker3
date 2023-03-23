package com.example.whaletraker3.screens.auth

import android.graphics.Paint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.*
import com.example.whaletraker3.ui.theme.HeaderText

@Composable
fun ForgotPassword(
    onResetPassword:()->Unit={},onBackPress:()->Unit={}
) {

    var emailState by remember {
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
                text = "Forgot Password",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            Text(textAlign = TextAlign.Start,
                text = "Enter your email address to reset password",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = SubText)
            Spacer(modifier = Modifier.size(32.dp))
            Text(textAlign = TextAlign.Start,
                text = "Email Address",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(border = BorderStroke(width = 1.dp, color = Border)),
                value = emailState,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = InputColor,
                    placeholderColor = HeaderText,
                    textColor = HeaderText
                ),
                onValueChange = { newText ->
                    emailState = newText
                },
                shape = RoundedCornerShape(4.dp),
                singleLine = true,
                placeholder = { Text("Email Address") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )
            Spacer(modifier = Modifier.size(28.dp))
            Button(onClick = {onResetPassword.invoke()},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(contentColor = TextColor,
                    backgroundColor = Color.White)) {
                Text(text = "Reset Password", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(modifier = Modifier.size(354.dp))
            Text(modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal, color = SubText)) {
                        append("Don't have an account?")
                    }

                    withStyle(style = SpanStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = HeaderText)) {
                        append(" Get Started")
                    }
                }
            )


        }
    }
}


