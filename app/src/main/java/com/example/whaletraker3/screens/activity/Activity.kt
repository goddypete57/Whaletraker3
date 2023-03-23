package com.example.whaletraker3.screens.activity

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whaletraker3.R

import com.example.whaletraker3.ui.theme.*

@Composable
fun Activity(

) {

    var searchState by remember {
        mutableStateOf("")
    }

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
        ) {
            Text(modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text = "Activity",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText
            )
            Spacer(modifier = Modifier.size(20.dp))
            Divider(modifier = Modifier,
                color = Divider, thickness = 1.dp)
            Spacer(modifier = Modifier.size(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .width(274.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Border)),
                    value = searchState,
                    leadingIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Search,
                                contentDescription = "Search",
                                tint = Color.White)
                        }
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = InputColor,
                        placeholderColor = HeaderText,
                        textColor = HeaderText
                    ),
                    onValueChange = { newText ->
                        searchState = newText
                    },
                    shape = RoundedCornerShape(4.dp),
                    singleLine = true,
                    placeholder = { Text("Search") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                )
                Spacer(modifier = Modifier.width(10.dp))
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Border)),
                ) {
                    Image(painter = painterResource(id = R.drawable.calendar),
                        contentDescription = "Search",
                        modifier = Modifier
                            .size(24.dp)
                            .align(alignment = Alignment.Center)
                            .clickable {
//                                navController.navigate(route = Screen.DateRange.route)

                            })
                }
            }
            Spacer(modifier = Modifier.size(24.dp))
            Text(modifier = Modifier
                .fillMaxWidth(),
                textAlign = TextAlign.Start,
                text = "Today",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText
            )
            Spacer(modifier = Modifier.height(20.dp))
            LazyColumnList(this)
        }
    }
}

@Composable
fun LazyColumnList(context: ColumnScope) {

    LazyColumn {
        items((1..3).toList()) {
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
    }
}
