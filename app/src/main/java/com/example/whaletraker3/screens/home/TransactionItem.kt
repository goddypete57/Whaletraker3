package com.example.whaletraker3.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.data.dataModels.WalletData
import com.example.whaletraker3.ui.theme.Green
import com.example.whaletraker3.ui.theme.Sub_Text
import com.example.whaletraker3.ui.theme.White


@Composable
fun TransactionItem(onclick: (() -> Unit)? = null, ){
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { onclick?.invoke() }
        .padding(vertical = 8.dp,), horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Row {
            Icon(
                painter = painterResource(id = R.drawable.deposit),
                contentDescription = null,
                modifier = Modifier
                    .height(44.dp)
                    .width(44.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column() {
                Text(text = "Received",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_medium),
                    ), color = White,
                    fontWeight = FontWeight.Medium
                )
                Text(text = "From: oxc8yh29w2ufyrb...",
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_regular),
                    ), color = Sub_Text,
                    fontWeight = FontWeight.Medium

                )
            }

        }


        Text(text = "+66.42WKC",
            fontSize = 14.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = Green,
            fontWeight = FontWeight.Medium

        )




    }
}