package com.example.whaletraker3.screens.home

import android.widget.Space
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whaletraker3.R
import com.example.whaletraker3.navigation.routs.MainRouts
import com.example.whaletraker3.ui.theme.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ViewWhaleDetails(navController: NavController,onWalletSheet:()->Unit={}) {
    val range = 6..31
    val text ="0x6Ec90334d89dBdc89E08A133271be3d104128Edb"
    val contextForToast = LocalContext.current.applicationContext

    val bottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden,
            animationSpec = tween(
                durationMillis = 300,
                delayMillis = 0,
                easing = FastOutLinearInEasing
            )
        )
    val bottomSheetState2 =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden,
            animationSpec = tween(
                durationMillis = 300,
                delayMillis = 0,
                easing = FastOutLinearInEasing
            )
        )

    val coroutineScope = rememberCoroutineScope()

   Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(vertical = 30.dp, horizontal = 20.dp)
            .verticalScroll(rememberScrollState())
        ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable { }
            , horizontalArrangement = Arrangement.SpaceBetween,
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
                    Text(text = "@whalejay",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            Font(R.font.basisgrotesquearabicpro_medium),
                        ), color = White,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "jayatada@gmail.com",
                        fontSize = 14.sp,
                        fontFamily = FontFamily(
                            Font(R.font.basisgrotesquearabicpro_medium),
                        ), color = Sub_Text,
                        fontWeight = FontWeight.Medium

                    )
                }

            }


            Text(text = "Rank: #7",
                fontSize = 17.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium

            )
        }
        Spacer(modifier = Modifier.height(28.dp))
Column {
    Row(verticalAlignment = Alignment.CenterVertically) {

        Text(text = "Total Wallet Balance",
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = Color.White,
            fontWeight = FontWeight.Medium

        )
        IconButton(onClick = {
            onWalletSheet.invoke()
             }) {
            Icon(painter = painterResource(id = R.drawable.dropdown_icon), contentDescription =null , tint = Sub_Text)
        }
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "1,000,564 WKC",
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = Color.White.copy(alpha = 0.8f),
            fontWeight = FontWeight.Medium

        )
        Icon(painter = painterResource(id = R.drawable.aproxi), contentDescription = null, tint = Sub_Text)
        Text(text = "$23,009",
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = Color.White.copy(alpha = 0.8f),
            fontWeight = FontWeight.Medium

        )
    }

}
Spacer(modifier = Modifier.height(28.dp))
      Text(text = "Wallets(3)",
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = Color.White,
            fontWeight = FontWeight.Medium

        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier
                .background(Black_alpha)
                .wrapContentSize()
                .border(
                    1.dp, Divider_color,
                    RoundedCornerShape(8.dp)

                )
                .padding(vertical = 8.dp, horizontal = 6.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically,) {
                    Text(text = text.replaceRange(range,"...") ,
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            Font(R.font.basisgrotesquearabicpro_medium),
                        ), color = Sub_Text,
                        fontWeight = FontWeight.Medium

                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Icon(painter = painterResource(id = R.drawable.copy_icon), contentDescription = null, tint = White, modifier = Modifier
                        .size(20.dp)
                        .clickable { })

                }

            }
        }
        Spacer(modifier = Modifier.height(28.dp))
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Transaction History",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = Color.White,
                fontWeight = FontWeight.Medium

            )
            Text(text = "See all",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = Color.White,
                fontWeight = FontWeight.Medium

            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Today",
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = Color.White,
            fontWeight = FontWeight.Medium

        )
        Spacer(modifier = Modifier.height(20.dp))
        TransactionItem(){

        }
        Spacer(modifier = Modifier.height(24.dp))
        Divider(thickness = 1.dp, color = Divider_color, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "20 Feb 2023",
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = Color.White,
            fontWeight = FontWeight.Medium

        )
        Spacer(modifier = Modifier.height(20.dp))
        TransactionItem(){

        }
}

        }




