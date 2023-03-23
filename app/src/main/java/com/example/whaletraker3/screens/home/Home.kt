package com.example.whaletraker3.screens.home

import android.graphics.Paint.Align
import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.model.content.CircleShape
import com.example.whaletraker3.R
import com.example.whaletraker3.navigation.routs.MainRouts
import com.example.whaletraker3.screens.ButtonWIthIcon
import com.example.whaletraker3.ui.theme.*

@Composable
fun Home (navController: NavController,onTokenClick: (() -> Unit)? = null,onOpenNotification: () -> Unit = {  },onProfileClick:()->Unit={}) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(start = 20.dp, end = 20.dp, bottom = 20.dp, top = 15.dp)

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(10.dp)
                )
                .height(247.dp)
                .background(Black_alpha)
                .border(1.dp, BorderColor, RoundedCornerShape(10.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.mesh2),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .height(247.dp),
                contentScale = ContentScale.FillBounds,
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .padding(horizontal = 12.dp,)
                    .fillMaxWidth()
                    .padding(top = 12.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier

                            .width(95.dp)
                            .clickable { onTokenClick?.invoke() }
                            .border(width = 1.dp, color = Border2, RoundedCornerShape(100.dp))
                            .clip(RoundedCornerShape(100.dp))
                            .background(Black_alpha2)
                            .padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 15.dp)


                        ) {
                            Image(painter = painterResource(id =  R.drawable.coin_icons), contentDescription =null , modifier = Modifier
                                .clip(
                                    CircleShape
                                )
                                .size(30.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "WKC",
                                fontSize = 14.sp,
                                fontFamily = FontFamily(
                                    Font(R.font.basisgrotesquearabicpro_medium),
                                ), color = White
                            )

                        }
                        Spacer(modifier = Modifier.width(6.dp))
                        Icon(painter = painterResource(id = R.drawable.internet), contentDescription =null, modifier = Modifier.size(24.dp), tint = Sub_Text )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(painter = painterResource(id = R.drawable.notification_icon), contentDescription =null, modifier = Modifier
                            .clickable { onOpenNotification.invoke()}
                            .size(44.dp), tint = Color.Unspecified )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(painter = painterResource(id = R.drawable.profile_icon), contentDescription =null, modifier = Modifier
                            .clickable {onProfileClick.invoke() }
                            .size(44.dp), tint = Color.Unspecified )

                    }


                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.aproxi), contentDescription = null, tint = White)
                    Spacer(modifier = Modifier.width(3.dp))
                    Text(
                        text = "$0.00",
                        fontSize = 15.sp,
                        fontFamily = FontFamily(
                            Font(R.font.basisgrotesquearabicpro_medium),
                        ), color = White.copy(alpha = 0.80f)
                    )
                }
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = "$0.00",
                    fontSize = 40.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_medium),
                    ), color = White
                )

  Text(text = "+\$0.00 (0.00%) Today",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.basisgrotesquearabicpro_regular),
                    ), color = Sub_Text
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(bottom = 30.dp)) {
                    Icon(painter = painterResource(id = R.drawable.holder_icon), contentDescription = null, tint = Sub_Text)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "0 Holders",
                        fontSize = 15.sp,
                        fontFamily = FontFamily(
                            Font(R.font.basisgrotesquearabicpro_medium),
                        ), color = Sub_Text
                    )
                }


            }
        }
        Spacer(modifier = Modifier.height(29.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Top Holders",
                fontSize = 18.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White
            )

            Row {
                Icon(painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = null,
                    tint = White,
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { navController.navigate(MainRouts.Add_Whale) })
                Spacer(modifier = Modifier.width(16.dp))
                Icon(painter = painterResource(id = R.drawable.settings_icon2),
                    contentDescription = null,
                    tint = White,
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { })
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .border(
                    width = 1.dp, Divider_color,
                    RoundedCornerShape(12.dp)
                )
        ) {
            LazyColumn {

                items(items = DummyData.AddWallet) { tran ->
                    if (tran != null) {
                        WalletItem(walletData = tran){
                            navController.navigate(MainRouts.Manage_Whale)
                        }
                        when (tran.id) {
                            0,1, 2 -> Divider(
                                thickness = 1.dp,
                                color = Divider_color,
                                modifier = Modifier.fillMaxWidth()
                            )
                            else -> {}
                        }
                    }

                }

            }

        }
    }
}


//@Preview
//@Composable
//fun home() {
//    val navController= rememberNavController()
//    Home(navController = navController)
//}
