package com.example.whaletraker3.screens.home

import androidx.compose.runtime.Composable
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whaletraker3.R
import com.example.whaletraker3.navigation.routs.MainRouts
import com.example.whaletraker3.ui.theme.*
import kotlinx.coroutines.launch

@Composable
fun ManageWhaleSheet(onEditWhale:()->Unit={},onViewWhale:()->Unit={}) {
    Column( modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {

        Divider(thickness = 4.dp, color = Sub_Text, modifier = Modifier.width(47.dp).clip(
            RoundedCornerShape(8.dp)
        ))
        Spacer(modifier = Modifier.height(24.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onViewWhale.invoke()
            }
            .padding(vertical = 16.dp,),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = R.drawable.detail_icon), contentDescription = null, tint = White, modifier = Modifier.size(22.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "View Whale",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            )

        }
        Divider(thickness = 1.dp, color = Divider_color, modifier = Modifier.fillMaxWidth())
        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable { onEditWhale.invoke()}
            .padding(vertical = 20.dp,),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = R.drawable.edit_icon), contentDescription = null, tint = White, modifier = Modifier.size(22.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Edit Whale Details",
                fontSize = 18.sp,
                fontFamily = FontFamily(
                    Font(R.font.basisgrotesquearabicpro_medium),
                ), color = White,
                fontWeight = FontWeight.Medium
            )

        }




    }
}