package com.example.whaletraker3.screens.auth

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.*
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.*

@Composable
fun VerificationSuccess(
onContinue:()->Unit={}
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = TextColor
            )
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.size(150.dp))
            lottieLoaderAnimation()
            Spacer(modifier = Modifier.size(20.dp))
            Text(textAlign = TextAlign.Start,
                text = "Verification Successful",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            Text(textAlign = TextAlign.Center,
                text = "You've successfully created your pennytracker account",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = SubText)
            Spacer(modifier = Modifier.size(169.dp))
            Button(onClick = {onContinue.invoke()},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(contentColor = TextColor,
                    backgroundColor = Color.White)) {
                Text(text = "Continue", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
        }
    }
}

@Composable
fun lottieLoaderAnimation() {
    val compositeResult : LottieCompositionResult = rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.success))
    val progressAnimation by animateLottieCompositionAsState(
        compositeResult.value,
        isPlaying = true,
        iterations = LottieConstants.IterateForever,
        speed = 1.0f)
    LottieAnimation(composition = compositeResult.value, progress = progressAnimation,
        modifier = Modifier.size(232.dp))
}




