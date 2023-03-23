package com.example.whaletraker3.screens.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.HeaderText
import com.example.whaletraker3.ui.theme.SubText
import com.example.whaletraker3.ui.theme.TextColor

@Composable
fun ActivityItem() {
    Box(
        modifier = Modifier
            .background(color = TextColor)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable {}) {
            Image(painter = painterResource(id = R.drawable.sent),
                contentDescription = "Receive",
                modifier = Modifier
                    .size(44.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column() {
                Text(modifier = Modifier
                    .fillMaxWidth(),
                    textAlign = TextAlign.Start,
                    text = "@whalejay received 2,157 WKC",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = HeaderText
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(modifier = Modifier
                    .fillMaxWidth(),
                    textAlign = TextAlign.Start,
                    text = "Today, 12:54pm",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = SubText
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun item() {
    ActivityItem()
}