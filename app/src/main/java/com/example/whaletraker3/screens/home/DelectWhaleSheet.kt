package com.example.whaletraker3.screens.home



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.*


@Composable
fun DeleteWhaleSheet(onCancel: () -> Unit = {}, onDelete: () -> Unit = {}) {
    val contextForToast = LocalContext.current.applicationContext

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp)
            .background(Black_alpha),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Divider(
            thickness = 4.dp, color = Sub_Text, modifier = Modifier
                .width(47.dp)
                .clip(
                    RoundedCornerShape(8.dp)
                )
        )
        Spacer(modifier = Modifier.height(24.dp))

        Image(
            painter = painterResource(id = R.drawable.delete_whale_wallet),
            contentDescription = null,
            modifier = Modifier.size(80.dp)
        )

        Spacer(modifier = Modifier.height(28.dp))
        Text(
            text = "Delete Whale",
            fontSize = 20.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_medium),
            ), color = White,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Are you sure you want to delete this wallet \n" +
                    "from pennytracker?",
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.basisgrotesquearabicpro_regular),
            ), color = Sub_Text,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedButton(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(
                        bottom = 20.dp
                    )
                    .height(55.dp)
                    .width(156.dp)
                    .clip(RoundedCornerShape(30.dp)),
                enabled = true,
                onClick = {
                    onCancel.invoke()
                },
                colors = ButtonDefaults.outlinedButtonColors(
                    backgroundColor = BorderColor,
                    contentColor = Color.White
                ),
                border = BorderStroke(0.dp, Color.Transparent)
            ) {
                Box(Modifier.fillMaxWidth()) {
                    Text(
                        text = "No, Cancel",
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),
                        fontSize = 16.sp,
                        letterSpacing = 0.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.align(Alignment.Center),
                        color = Color.White
                    )

//                if (processing) {
//                    CircularProgressIndicator(
//                        modifier = Modifier
//                            .size(25.dp)
//                            .align(Alignment.CenterEnd),
//                        color = Color.White,
//                        strokeWidth = 2.dp
//                    )
//                }
                }
            }

            OutlinedButton(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(
                        bottom = 20.dp
                    )


                    .height(55.dp)
                    .width(156.dp)
                    .clip(RoundedCornerShape(30.dp)),
                enabled = true,
                onClick = {
                    onDelete.invoke()
                },
                colors = ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Red,
                    contentColor = Color.White
                ),
                border = BorderStroke(0.dp, Color.Transparent)
            ) {
                Box(Modifier.fillMaxWidth()) {
                    Text(
                        text = "Yes, Delete",
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily(Font(R.font.basisgrotesquearabicpro_medium)),
                        fontSize = 16.sp,
                        letterSpacing = 0.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.align(Alignment.Center),
                        color = Color.White
                    )

//                if (processing) {
//                    CircularProgressIndicator(
//                        modifier = Modifier
//                            .size(25.dp)
//                            .align(Alignment.CenterEnd),
//                        color = Color.White,
//                        strokeWidth = 2.dp
//                    )
//                }
                }
            }

        }

    }
}

