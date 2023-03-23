package com.example.whaletraker3.screens.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.Black_alpha
import com.example.whaletraker3.ui.theme.Divider_color
import com.example.whaletraker3.ui.theme.White

@Composable
fun SecurityScreen(onDropDown:()->Unit={}) {

    var switch by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(horizontal = 20.dp, vertical = 20.dp)
    ) {
        Text(
            text = "Customise your notification preferences based\n" +
                    "on your personal preferences",
            fontWeight = FontWeight.Normal,
            color = Color.White,
            textAlign = TextAlign.Start,
            fontSize = 15.sp,
            fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
            letterSpacing = -1.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .background(Black_alpha)
                .border(1.dp, Divider_color, RoundedCornerShape(6.dp))
                .padding(horizontal = 20.dp, vertical = 20.dp)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.biometric_icon),
                    contentDescription = null,
                    tint = White
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Enable Biometrics",
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),

                    )
            }
            Switch(
                checked = switch, onCheckedChange = { switch = it }, colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White,
                    uncheckedThumbColor = Color.White,
                    checkedTrackColor = Color.Transparent,
                    uncheckedTrackColor = Color.Transparent,

                    ), modifier = Modifier
                    .border(2.dp, White, RoundedCornerShape(12.dp))
                    .width(29.33.dp)
                    .height(18.67.dp)

            )

        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .clickable { onDropDown.invoke()}
                .fillMaxWidth()
                .background(Black_alpha)
                .border(1.dp, Divider_color, RoundedCornerShape(6.dp))
                .padding(horizontal = 20.dp, vertical = 20.dp)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.time_icon),
                    contentDescription = null,
                    tint = White
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Auto Lock",
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),

                    )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Always",
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    textAlign = TextAlign.Start,
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),

                    )
                Spacer(modifier = Modifier.width(8.7.dp))
                Icon(
                    painter = painterResource(id = R.drawable.dropdown_icon),
                    contentDescription = null,
                    tint = White
                )
            }

        }

    }
}

