package com.example.whaletraker3.screens.home


import android.app.Activity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
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
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.*

@Composable
fun ProfileScreen() {

    var email by remember {
        mutableStateOf(TextFieldValue( ""))
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(vertical = 26.dp, horizontal = 20.dp)
            .verticalScroll(rememberScrollState()),

    ) {
Column(
    modifier = Modifier
        .fillMaxWidth()
        .background(Black_alpha)
        .border(1.dp, Divider_color, RoundedCornerShape(12.dp))
        .padding(top = 23.dp, start = 18.dp, end = 18.dp, bottom = 20.dp),
    horizontalAlignment = Alignment.CenterHorizontally
) {

    Image(
        painter = painterResource(id = R.drawable.avater),
        contentDescription = null,
        modifier = Modifier
            .clickable {  }
            .clip(CircleShape)
            .height(80.dp)
            .width(80.dp),
        contentScale = ContentScale.FillBounds,
    )
    Spacer(modifier = Modifier.height(12.dp))
    Text(text = "Change Avatar", fontWeight = FontWeight.Medium,
        color = Color.White,
        textAlign = TextAlign.Center,
        fontSize = 15.sp,
        fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium),))
    Spacer(modifier = Modifier.height(24.dp))
    OutlinedTextField(value  =email ,  onValueChange = {
        email=it
    },
        readOnly = true,
        placeholder = {
            Text(
                text = "Jayatada@gmail.com",
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

        trailingIcon = {

                Text(
                    text = "Edit",
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),
                    fontSize = 15.sp,
                    textAlign = TextAlign.Start, modifier = Modifier
                        .padding(15.dp)
                        .clickable { },

                )

        },
        keyboardOptions = KeyboardOptions.Default.copy(
            autoCorrect = true,
            keyboardType = KeyboardType.Email,
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
        

    }
}
