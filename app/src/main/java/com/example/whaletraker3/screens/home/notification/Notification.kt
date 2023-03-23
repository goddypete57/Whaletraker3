package com.example.whaletraker3.screens.home.notification


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.screens.home.DummyData
import com.example.whaletraker3.ui.theme.Divider_color
import com.example.whaletraker3.ui.theme.White

@Composable
fun NotificationScreen(onNavigateBack:()->Unit={},onClickNotificationSetting:()->Unit={}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)

    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            TopAppBar(
                backgroundColor = Color.Black,
                elevation = 20.dp,
                modifier = Modifier
                    .wrapContentHeight()
                    .height(80.dp)

            ) {
                Box(Modifier.fillMaxSize()) {

                    IconButton(
                        onClick = {onNavigateBack.invoke()},
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



                    Text(
                        text = "Notifications",

                        modifier = Modifier
                            .wrapContentSize()

                            .align(
                                Alignment.Center
                            ),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        color =
                        White
                    )





                    IconButton(
                        onClick = { onClickNotificationSetting.invoke()},
                        Modifier
                            .wrapContentSize()
                            .align(Alignment.CenterEnd)
                    ) {
                        Icon(
                            painter =
                            painterResource(
                                id = R.drawable.settings_icon2
                            ),
                            contentDescription = "back icon",
                            tint = White
                        )


                    }

                }
            }
            Divider(
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth(),
                color = Divider_color
            )

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(Divider_color)
                        .padding(vertical = 10.dp, horizontal = 14.dp)

                ) {
                    Text(
                        text = "Alerts",

                        modifier = Modifier
                            .wrapContentSize()
                            .align(
                                Alignment.Center
                            ),
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color =
                        White
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(Divider_color)
                        .padding(vertical = 10.dp, horizontal = 14.dp)
                ) {
                    Text(
                        text = "Transactions",

                        modifier = Modifier
                            .wrapContentSize()
                            .align(
                                Alignment.Center
                            ),
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color =
                        White
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Recent",

                    modifier = Modifier
                        .wrapContentSize(),
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    color =
                    White
                )
                Text(
                    text = "Clear All",

                    modifier = Modifier
                        .clickable { }
                        .wrapContentSize(),
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    color =
                    White
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            LazyColumn (modifier = Modifier.padding(end = 16.dp)){

                items(items = DummyData.AddWallet) { tran ->
                    if (tran != null) {
                       NotificationItem(){

                       }

                    }

                }

            }
        }

    }
}



