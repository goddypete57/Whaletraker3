package com.example.whaletraker3.screens.auth

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whaletraker3.R

import com.example.whaletraker3.ui.theme.*

@Composable
fun GettingStartedScreen(
    onGetStarted: () -> Unit = {},
    alreadyHaveAccount: () -> Unit = {},
) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.onboarding),
                contentScale = ContentScale.FillBounds
            )
            .scrollable(state = scrollState, orientation = Orientation.Vertical)

    ) {
        Column(
            modifier = Modifier.padding(20.dp).verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.size(500.dp))
            Text(
                textAlign = TextAlign.Center,
                text = "Welcome to Whale Tracker",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                textAlign = TextAlign.Center,
                text = "Starting today you can monitor tokens and holders on top projects here",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = SubText
            )
            Spacer(modifier = Modifier.size(28.dp))
            Button(
                onClick = {
                    onGetStarted.invoke()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = TextColor,
                    backgroundColor = Color.White
                )
            ) {
                Text(text = "Get Started", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(modifier = Modifier.size(14.dp))
            Button(
                onClick = {
                    alreadyHaveAccount.invoke()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    backgroundColor = Divider
                )
            ) {
                Text(
                    text = "I already have an account",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}