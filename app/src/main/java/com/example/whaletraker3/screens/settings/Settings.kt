package com.example.whaletraker3.screens.settings

import android.provider.Settings
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.ui.theme.Black_alpha
import com.example.whaletraker3.ui.theme.Divider_color
import com.example.whaletraker3.ui.theme.White

@Composable
fun Settings(onChangePassword:()->Unit={},onSecurity:()->Unit={},onPriceClick:()->Unit={}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(vertical = 20.dp, horizontal = 20.dp)

    ) {
        listOf(1, 2, 3, 4, 5).forEach { view ->
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .clickable { when(view){
                        1->{onChangePassword.invoke()}
                        2->{onSecurity.invoke()}
                        3->{onPriceClick.invoke()}
                        4->{}
                        else->{}
                    } }
                    .fillMaxWidth()
                    .background(Black_alpha)
                    .border(1.dp, Divider_color, RoundedCornerShape(6.dp))
                    .padding(horizontal = 20.dp, vertical = 20.dp)


            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(
                            id = when (view) {
                                1 -> {
                                    com.example.whaletraker3.R.drawable.lock_icon
                                }
                                2 -> {
                                    com.example.whaletraker3.R.drawable.security_icon
                                }
                                3 -> {
                                    com.example.whaletraker3.R.drawable.alert_icon
                                }
                                4 -> {
                                    com.example.whaletraker3.R.drawable.support_icon
                                }
                                else -> {
                                    com.example.whaletraker3.R.drawable.logout_icon
                                }
                            }
                        ), contentDescription = null, tint = White
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = when (view) {
                            1 -> "Change Password"
                            2 -> "Security"
                            3 -> "Whale Alert"
                            4 -> "Support"
                            else -> "Log out"
                        },
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp
                    )
                }
                when (view) {
                    1,2,3,4 -> {
                        Icon(
                            painter = painterResource(
                                id = com.example.whaletraker3.R.drawable.arrowright_icon
                            ), contentDescription = null, tint = White
                        )
                    }
                    else->{

                    }
                }

            }
        }

    }
}