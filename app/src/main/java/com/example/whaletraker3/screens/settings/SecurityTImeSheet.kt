package com.example.whaletraker3.screens.settings

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
fun SecurityTimeSheet(onClose: () -> Unit = {}, onAddNewWallet: () -> Unit = {},onEditWallet:()->Unit={}) {
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
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable {  }.fillMaxWidth().padding(vertical = 20.dp)){
            Text(
                text = "Always",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            )
        }
        Divider(thickness = 1.dp, color = Divider_color, modifier = Modifier.fillMaxWidth())
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable {  }.fillMaxWidth().padding(vertical = 20.dp)){
            Text(
                text = "5 mins",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            )
        }
        Divider(thickness = 1.dp, color = Divider_color, modifier = Modifier.fillMaxWidth())
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable {  }.fillMaxWidth().padding(vertical = 20.dp)){
            Text(
                text = "30 mins",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            )
        }


    }





    }
