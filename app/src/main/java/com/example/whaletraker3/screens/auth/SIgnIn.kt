package com.example.whaletraker3.screens.auth

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whaletraker3.R

import com.example.whaletraker3.ui.theme.*

@Composable
fun SignIn(
    onGetStarted: () -> Unit = {},
    onLogin: () -> Unit = {},
    onForgotPassword: () -> Unit = {},
    onBackPress:()->Unit={}
) {

    var emailState by remember {
        mutableStateOf("")
    }

    var passwordState by remember {
        mutableStateOf("")
    }
    var passwordVisibility by remember { mutableStateOf(false) }


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
            Text(
                textAlign = TextAlign.Start,
                text = "Log in",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                textAlign = TextAlign.Start,
                text = "Log in to your account to continue",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = SubText
            )
            Spacer(modifier = Modifier.size(32.dp))
            Text(
                textAlign = TextAlign.Start,
                text = "Email Address",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText
            )
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
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                textAlign = TextAlign.Start,
                text = "Password",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText
            )
            Spacer(modifier = Modifier.size(8.dp))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(border = BorderStroke(width = 1.dp, color = Border)),
                value = passwordState,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = InputColor,
                    placeholderColor = HeaderText,
                    textColor = HeaderText
                ),
                onValueChange = { newText ->
                    passwordState = newText
                },
                shape = RoundedCornerShape(4.dp),
                singleLine = true,
                visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    Text(text = if (passwordVisibility) "Hide" else "Show",
                        color = HeaderText,
                        modifier = Modifier.clickable { passwordVisibility = !passwordVisibility })
                },
                placeholder = { Text("Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            )
            Spacer(modifier = Modifier.size(28.dp))
            Button(
                onClick = { onLogin.invoke() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = TextColor,
                    backgroundColor = Color.White
                )
            ) {
                Text(text = "Login", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onForgotPassword.invoke()
                    },
                textAlign = TextAlign.Center,
                text = "Forgot Password?",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = HeaderText
            )
            Spacer(modifier = Modifier.size(212.dp))
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = "Don't have an account?",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = SubText
                )
                ClickableText(
                    text = AnnotatedString("Get Started"),
                    onClick = {
                        onGetStarted.invoke()
                    },
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = HeaderText
                    )
                )
            }
        }
    }
}


