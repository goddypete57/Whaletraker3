package com.example.whaletraker3.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.Divider_color
import com.example.whaletraker3.ui.theme.Sub_Text
import com.example.whaletraker3.ui.theme.White
import kotlinx.coroutines.launch

@Composable
fun WalletSheet(onClose: () -> Unit = {}, onAddNewWallet: () -> Unit = {},onEditWallet:()->Unit={}) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Divider(
            thickness = 4.dp, color = Sub_Text, modifier = Modifier
                .width(47.dp)
                .clip(
                    RoundedCornerShape(8.dp)
                )
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Wallets",
                fontSize = 20.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClose.invoke()
            }
            .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.wallet_icon),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp),
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column() {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "All Wallets",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(
                                Font(R.font.basisgrotesquearabicpro_medium),
                            ), color = White,
                            fontWeight = FontWeight.Medium
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.verified_icon),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.size(16.dp)
                        )

                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Text(
                            text = "1,482,300 WKC",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(
                                Font(R.font.basisgrotesquearabicpro_medium),
                            ), color = Sub_Text,
                            fontWeight = FontWeight.Medium
                        )

                    }

                }
            }


        }
        Divider(thickness = 1.dp, color = Divider_color, modifier = Modifier.fillMaxWidth())
        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable {


            }
            .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.wallet_icon),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp),
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column() {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "All Wallets",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(
                                Font(R.font.basisgrotesquearabicpro_medium),
                            ), color = White,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Text(
                            text = "1,482,300 WKC",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(
                                Font(R.font.basisgrotesquearabicpro_medium),
                            ), color = Sub_Text,
                            fontWeight = FontWeight.Medium
                        )

                    }

                }
            }

            Icon(
                painter = painterResource(id = R.drawable.more_icon),
                contentDescription = null,
                tint = White,
                modifier = Modifier.size(24.dp).clickable { onEditWallet.invoke() }
            )

        }
        Divider(thickness = 1.dp, color = Divider_color, modifier = Modifier.fillMaxWidth())

        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable { onAddNewWallet.invoke()}
            .padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.addtoken_icon),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Add new token",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            )

        }


    }
}