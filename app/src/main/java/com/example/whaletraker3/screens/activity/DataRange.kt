package com.example.whaletraker3.screens.activity

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whaletraker3.R
import com.example.whaletraker3.ui.theme.*
import com.vanpra.composematerialdialogs.MaterialDialog
import com.vanpra.composematerialdialogs.datetime.date.DatePickerDefaults
import com.vanpra.composematerialdialogs.datetime.date.datepicker
import com.vanpra.composematerialdialogs.rememberMaterialDialogState
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun DateRange() {

    var pickedDate by remember {
        mutableStateOf(LocalDate.now())
    }
    var pickedDate1 by remember {
        mutableStateOf(LocalDate.now())
    }
    val formattedDate by remember {
        derivedStateOf {
            DateTimeFormatter
                .ofPattern("MMM dd yyyy")
                .format(pickedDate)
        }
    }
    val formattedDate1 by remember {
        derivedStateOf {
            DateTimeFormatter
                .ofPattern("MMM dd yyyy")
                .format(pickedDate1)
        }
    }


    val dateDialogState = rememberMaterialDialogState()
    val dateDialogState1 = rememberMaterialDialogState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = TextColor
            )
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {

                Image(painter = painterResource(id = R.drawable.back1),
                    contentDescription = "Back",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {})
                Spacer(modifier = Modifier.width(70.dp))
                Text(textAlign = TextAlign.Center,
                    text = "Pick date range",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = HeaderText)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Divider(modifier = Modifier,
                color = Divider, thickness = 1.dp)
            Spacer(modifier = Modifier.size(20.dp))
            Text(textAlign = TextAlign.Start,
                text = "Start Date",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            Box(
                modifier = Modifier
                    .border(border = BorderStroke(width = 1.dp, color = Border))
                    .fillMaxWidth(),
            ) {
                Text(modifier = Modifier
                    .padding(20.dp)
                    .clickable {
                        dateDialogState.show()
                    },
                    textAlign = TextAlign.Start,
                    text = formattedDate,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = SubText)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Text(textAlign = TextAlign.Start,
                text = "End Date",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            Box(
                modifier = Modifier
                    .border(border = BorderStroke(width = 1.dp, color = Border))
                    .fillMaxWidth(),
            ) {
                Text(modifier = Modifier
                    .padding(20.dp)
                    .clickable {
                        dateDialogState1.show()
                    },
                    textAlign = TextAlign.Start,
                    text = formattedDate1,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium,
                    color = SubText)
            }
            Spacer(modifier = Modifier.size(300.dp))
            Button(onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(contentColor = TextColor,
                    backgroundColor = Color.White)) {
                Text(text = "Done", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
        }
        MaterialDialog(
            dialogState = dateDialogState,
            backgroundColor = TextColor,
            buttons = {
                positiveButton(text = "Pick Date", textStyle = TextStyle(
                    color = HeaderText, fontSize = 14.sp, FontWeight.Medium
                ))
                negativeButton(text = "Cancel", textStyle = TextStyle(
                    color = HeaderText, fontSize = 14.sp, FontWeight.Medium
                ))
            }
        ) {
            datepicker(
                LocalDate.now(),
                colors = DatePickerDefaults.colors(
                    dateActiveBackgroundColor = SubText,
                    calendarHeaderTextColor = HeaderText,
                    dateActiveTextColor = HeaderText,
                    headerBackgroundColor = HeaderText,
                    headerTextColor = TextColor,
                    dateInactiveTextColor = HeaderText
                ),
            ) {
                pickedDate = it
            }
        }

        MaterialDialog(
            dialogState = dateDialogState1,
            backgroundColor = TextColor,
            buttons = {
                positiveButton(text = "Pick Date", textStyle = TextStyle(
                    color = HeaderText, fontSize = 14.sp, FontWeight.Medium
                ))
                negativeButton(text = "Cancel", textStyle = TextStyle(
                    color = HeaderText, fontSize = 14.sp, FontWeight.Medium
                ))
            }
        ) {
            datepicker(
                LocalDate.now(),
                colors = DatePickerDefaults.colors(
                    dateActiveBackgroundColor = SubText,
                    calendarHeaderTextColor = HeaderText,
                    dateActiveTextColor = HeaderText,
                    headerBackgroundColor = HeaderText,
                    headerTextColor = TextColor,
                    dateInactiveTextColor = HeaderText
                ),
            ) {
                pickedDate1 = it
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Date() {
    DateRange()
}


