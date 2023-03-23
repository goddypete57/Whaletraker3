package com.example.whaletraker3.screens.home

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
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

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ManageWhale(navController: NavController,onShowWhaleSheet:()->Unit={}) {
    var search by remember {
        mutableStateOf(TextFieldValue( ""))
    }
    val contextForToast = LocalContext.current.applicationContext



        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(start = 20.dp, end = 20.dp, top = 24.dp)

        ) {

            OutlinedTextField(
                value = search, onValueChange = { search = it },
                placeholder = {
                    Text(
                        text = "Search",
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
                        color = White.copy(0.8f),

                        )
                },
                textStyle = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_regular)),
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Start,
                ),
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.search), contentDescription = null,tint= White, modifier = Modifier.size(22.dp))
                },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = White,
                    disabledTextColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = BorderColor,
                    disabledIndicatorColor = Color.Transparent,
                    placeholderColor = White.copy(alpha = 0.8f),
                    backgroundColor = Black_alpha,
                    cursorColor = White

                ),
                singleLine = true,
                maxLines = 1,

                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp)),

                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {

                items(items = DummyData.AddWallet) { tran ->
                    if (tran != null) {
                        ManageWhaleItem(walletData = tran, onclick2 = {onShowWhaleSheet.invoke()}, onclick = {navController.navigate(MainRouts.View_Whale)})
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