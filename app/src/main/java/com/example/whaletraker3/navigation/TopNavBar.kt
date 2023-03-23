package com.example.whaletraker3.navigation


import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.whaletraker3.R
import com.example.whaletraker3.navigation.routs.BottomRouts
import com.example.whaletraker3.navigation.routs.MainRouts
import com.example.whaletraker3.navigation.routs.SettingsRouts
import com.example.whaletraker3.ui.theme.White

import java.util.*

@Composable
fun TopNavBar(
    navController: NavController,
    onEditWhaleSheet: () -> Unit = {},
    onDeleteWalletSheet: () -> Unit = {},
    onDeleteWhaleSheet: () -> Unit = {},
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    var state by remember { mutableStateOf("") }
    LaunchedEffect(key1 = currentRoute) {
        when (currentRoute) {
            MainRouts.EditWhaleSheet, MainRouts.WalletSheet, MainRouts.ManageWhaleSheet,
            MainRouts.Delete_Wallet_Sheet, MainRouts.Delete_Whale_Sheet,
            SettingsRouts.SecurityTimeSheet,BottomRouts.TokenSheet-> {}
            else -> {
                state = currentRoute.toString()
            }
        }
    }
    TopAppBar(
        backgroundColor = Color.Black,
        elevation = 20.dp,
        modifier = Modifier
            .wrapContentHeight()
            .height(80.dp)

    ) {
        Box(Modifier.fillMaxSize()) {
            when (state) {
                BottomRouts.Settings -> {


                }
                SettingsRouts.ChangePassword, SettingsRouts.SecurityScreen, SettingsRouts.PriceLimit, MainRouts.NotificationSetting,MainRouts.Profile,MainRouts.View_Whale -> {
                    IconButton(
                        onClick = { navController.navigateUp() },
                        Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterStart)
                    ) {
                        Icon(
                            painter =
                            painterResource(
                                id = R.drawable.back_icon
                            ),
                            contentDescription = "back icon",
                            tint = White
                        )

                    }
                }
                MainRouts.Add_New_Wallet,MainRouts.Edit_Wallet,MainRouts.Edit_Whale_Details_Screen ,MainRouts.Manage_Whale,MainRouts.Add_Whale,MainRouts.EditTokenDetails-> {
                    IconButton(
                        onClick = { navController.navigateUp() },
                        Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterStart)
                    ) {
                        Icon(
                            painter =
                            painterResource(
                                id = R.drawable.exist_icon
                            ),
                            contentDescription = "back icon",
                            tint = White
                        )

                    }
                }
            }


            Text(
                text = when (state) {
                    SettingsRouts.ChangePassword -> "Change Password"
                    SettingsRouts.PriceLimit -> "Price Limit"
                    SettingsRouts.SecurityScreen -> "Security"
                    BottomRouts.Settings -> "Settings"
                    MainRouts.Add_Whale -> "Add New Whale"
                    MainRouts.Manage_Whale -> "Manage Whale"
                    MainRouts.View_Whale -> "UserName"
                    MainRouts.Edit_Wallet -> "Edit Wallet Details"
                    MainRouts.Add_New_Wallet -> "Add New Wallet"
                    MainRouts.Edit_Whale_Details_Screen -> "Edit Whale Details"
                    MainRouts.NotificationSetting -> "Notification Settings"
                    MainRouts.Profile -> "Profile"
                    MainRouts.EditTokenDetails -> "Edit Token Details"
                    else -> ""
                },
                modifier = Modifier
                    .wrapContentSize()
                    .padding(
                        horizontal = 20.dp,
                        vertical = 8.dp
                    )
                    .align(
                        Alignment.Center
                    ),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color =
                White
            )
            when (state) {
                MainRouts.Manage_Whale -> {

                    IconButton(
                        onClick = { },
                        Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterEnd)
                    ) {
                        Icon(
                            painter =
                            painterResource(
                                id = R.drawable.add_icon
                            ),
                            contentDescription = "back icon",
                            tint = White
                        )
                    }
                }
                MainRouts.View_Whale -> {

                    IconButton(
                        onClick = { onEditWhaleSheet.invoke() },
                        Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterEnd)
                    ) {
                        Icon(
                            painter =
                            painterResource(
                                id = R.drawable.more_icon
                            ),
                            contentDescription = "back icon",
                            tint = White
                        )
                    }
                }
                MainRouts.Edit_Wallet,MainRouts.EditTokenDetails -> {

                    IconButton(
                        onClick = { onDeleteWalletSheet.invoke() },
                        Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterEnd)
                    ) {
                        Icon(
                            painter =
                            painterResource(
                                id = R.drawable.delete_icon
                            ),
                            contentDescription = "back icon",
                            tint = White
                        )
                    }
                }
                MainRouts.Edit_Whale_Details_Screen -> {

                    IconButton(
                        onClick = { onDeleteWhaleSheet.invoke() },
                        Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterEnd)
                    ) {
                        Icon(
                            painter =
                            painterResource(
                                id = R.drawable.delete_icon
                            ),
                            contentDescription = "back icon",
                            tint = White
                        )
                    }
                }

            }

        }
    }

}