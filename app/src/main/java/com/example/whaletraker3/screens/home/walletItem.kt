package com.example.whaletraker3.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.dataModels.WalletData
import com.example.whaletraker3.ui.theme.Black_alpha
import com.example.whaletraker3.ui.theme.Green
import com.example.whaletraker3.ui.theme.White

@Composable
fun WalletItem(walletData: WalletData,onclick: (() -> Unit)? = null){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Black_alpha)
        .clickable { onclick?.invoke() }
        .padding(vertical = 16.dp, horizontal = 12.dp), horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.avater),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .height(50.dp)
                    .width(50.dp),
                contentScale = ContentScale.FillBounds,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column() {
                Text(text = "${walletData.name}",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_medium),
                    ), color = White,
                    fontWeight = FontWeight.Medium
                )
                Text(text = "${walletData.amount} WKC",
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_medium),
                    ), color = White,
                    fontWeight = FontWeight.Medium

                )
            }

        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = R.drawable.uptrend_icon), contentDescription = null, tint = Green, modifier = Modifier
                .size(15.dp)
                .clickable { })
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "+2.44%",
                fontSize = 15.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = Green,
                fontWeight = FontWeight.Medium

            )
        }
    }
}

@Composable
fun ManageWhaleItem(walletData: WalletData,onclick: (() -> Unit)? = null,onclick2: (() -> Unit)? = null){
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { onclick?.invoke() }
        .padding(vertical = 16.dp,), horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.avater),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .height(50.dp)
                    .width(50.dp),
                contentScale = ContentScale.FillBounds,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column() {
                Text(text = "${walletData.name}",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_medium),
                    ), color = White,
                    fontWeight = FontWeight.Medium
                )
                Text(text = "${walletData.amount} WKC",
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_medium),
                    ), color = White,
                    fontWeight = FontWeight.Medium

                )
            }

        }


           Icon(painter = painterResource(id = R.drawable.more_icon), contentDescription = null, tint = White, modifier = Modifier
               .size(24.dp)
               .clickable { onclick2?.invoke() }
              )




    }
}