package com.example.whaletraker3.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.White

@Composable
fun ButtonWIthIcon(modifier: Modifier=Modifier,text: String, onclick: (() -> Unit)?) {
    val progress = remember { mutableStateOf(false) }
    Button(
        onClick = {
            progress.value = true
            onclick?.invoke()
        },
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = White,
            contentColor = androidx.compose.ui.graphics.Color.Black
        ), modifier = modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.weight(0.25f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(painter = painterResource(id = R.drawable.add_icon), contentDescription = null, tint = androidx.compose.ui.graphics.Color.Black, modifier = Modifier
                .width(30.dp)
                .height(30.dp))

        }
        Text(text = text, modifier = Modifier.weight(1f), textAlign = TextAlign.Center, fontSize = 15.sp,fontFamily = FontFamily(
            Font(R.font.basisgrotesquearabicpro_medium)
        ))

    }
}

@Composable
fun OutLineFields(
    value: String,
    onValueChange: (String) -> Unit,
    placeholders: String,
    modifier: Modifier,
//    isError: Boolean = false,
//    trailingIcon: @Composable (() -> Unit)? = null,
) {

    OutlinedTextField(value = value, onValueChange = onValueChange, singleLine = true,
    placeholder = { Text(text = placeholders)},
        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.White,
            disabledTextColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            disabledIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            placeholderColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.8f),
          backgroundColor = androidx.compose.ui.graphics.Color.Black
        ),
        modifier = modifier,
    )

}



