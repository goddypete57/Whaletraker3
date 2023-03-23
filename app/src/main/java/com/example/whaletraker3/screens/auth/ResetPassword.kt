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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.*

@Composable
fun ResetPassword(onBackPress:()->Unit={}) {

    var passwordState by remember {
        mutableStateOf("")
    }

    var confirmPasswordState by remember {
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
            Text(textAlign = TextAlign.Start,
                text = "Reset Password",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            Text(textAlign = TextAlign.Start,
                text = "Enter your new password and confirm it",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = SubText)
            Spacer(modifier = Modifier.size(32.dp))
            Text(textAlign = TextAlign.Start,
                text = "Password",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
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
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )
            Spacer(modifier = Modifier.size(20.dp))
            Text(textAlign = TextAlign.Start,
                text = "Confirm Password",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(border = BorderStroke(width = 1.dp, color = Border)),
                value = confirmPasswordState,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = InputColor,
                    placeholderColor = HeaderText,
                    textColor = HeaderText
                ),
                onValueChange = { newText ->
                    confirmPasswordState = newText
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
            Button(onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(contentColor = TextColor,
                    backgroundColor = Color.White)) {
                Text(text = "Reset Password", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
        }
    }
}
