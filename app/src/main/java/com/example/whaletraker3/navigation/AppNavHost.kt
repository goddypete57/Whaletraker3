package com.example.whaletraker3.navigation

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.whaletraker3.navigation.graphs.authGraph
import com.example.whaletraker3.navigation.graphs.bottomGraph
import com.example.whaletraker3.navigation.graphs.mainGraph
import com.example.whaletraker3.navigation.graphs.settingGraph
import com.example.whaletraker3.navigation.routs.AuthRouts
import com.example.whaletraker3.navigation.routs.BottomRouts
import com.example.whaletraker3.navigation.routs.MainRouts
import com.example.whaletraker3.navigation.routs.SettingsRouts
import com.example.whaletraker3.ui.theme.Black_alpha
import com.example.whaletraker3.ui.theme.Divider_color
import com.google.accompanist.navigation.material.BottomSheetNavigator
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterialNavigationApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun AppNavHost(

) {
    val bottomSheetState =
        rememberModalBottomSheetState(
            initialValue = ModalBottomSheetValue.Hidden,
            skipHalfExpanded = true,
//            animationSpec = tween(
//                durationMillis = 10,
//                delayMillis = 0,
//                easing = FastOutLinearInEasing
//            )

        )
    val bottomSheetNavigator = BottomSheetNavigator(bottomSheetState)
    val navController = rememberNavController(bottomSheetNavigator)
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    var startDestination = AuthRouts.DEFAULT
    val contextForToast = LocalContext.current.applicationContext
    val coroutineScope = rememberCoroutineScope()


    ModalBottomSheetLayout(
        sheetElevation = 20.dp,
        scrimColor = Color.Black.copy(0.30f),
        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        sheetBackgroundColor = Black_alpha,
        bottomSheetNavigator = bottomSheetNavigator,
    ) {
//      Scaffold(
//          modifier = Modifier.fillMaxSize().background(Color.Black),
//
//            bottomBar = {
//                if (navBackStackEntry?.destination?.parent?.route == BottomRouts.DEFAULT) {
//                    BottomNav(navController = navController)
//                }
//
//            },

//            topBar = {
////                if (navBackStackEntry?.destination?.parent?.route == MainRouts.DEFAULT) {
//                when(navBackStackEntry?.destination?.parent?.route){
//                    MainRouts.DEFAULT,BottomRouts.DEFAULT,SettingsRouts.DEFAULT->{
//                        when(navBackStackEntry?.destination?.route){
//                            BottomRouts.HOME,BottomRouts.Activity,MainRouts.NotificationScreen,BottomRouts.TokenSheet->{
//                            }
//                            else->{
//                          Column {
//                              TopNavBar(
//                                  navController = navController,
//                                  onDeleteWalletSheet = { navController.navigate(MainRouts.Delete_Wallet_Sheet) },
//                                  onEditWhaleSheet = { navController.navigate(MainRouts.EditWhaleSheet) },
//                                  onDeleteWhaleSheet = {navController.navigate(MainRouts.Delete_Whale_Sheet)}
//                              )
//                              Divider(
//                                  thickness = 1.dp,
//                                  modifier = Modifier.fillMaxWidth(),
//                                  color = Divider_color
//                              )
//                          }
//                            }
//                        }
//
//
//                    }
//                }
//
////                }
//            }
//      ) {
    Column(modifier = Modifier.fillMaxSize()) {


                when(navBackStackEntry?.destination?.parent?.route){
                    MainRouts.DEFAULT,BottomRouts.DEFAULT,SettingsRouts.DEFAULT->{
                        when(navBackStackEntry?.destination?.route){
                            BottomRouts.HOME,BottomRouts.Activity,MainRouts.NotificationScreen,BottomRouts.TokenSheet->{
                            }
                            else->{
                          Column {
                              TopNavBar(
                                  navController = navController,
                                  onDeleteWalletSheet = { navController.navigate(MainRouts.Delete_Wallet_Sheet) },
                                  onEditWhaleSheet = { navController.navigate(MainRouts.EditWhaleSheet) },
                                  onDeleteWhaleSheet = {navController.navigate(MainRouts.Delete_Whale_Sheet)}
                              )
                              Divider(
                                  thickness = 1.dp,
                                  modifier = Modifier.fillMaxWidth(),
                                  color = Divider_color
                              )
                          }
                            }
                        }


                    }
                }


        NavHost(
            navController = navController,
            startDestination = startDestination,
        modifier = Modifier.weight(1f)
        ) {
            mainGraph(
                navController = navController,
            )
            settingGraph(navController = navController)
            bottomGraph(navController)
            authGraph(navController)

        }

        AnimatedVisibility (navBackStackEntry?.destination?.parent?.route == BottomRouts.DEFAULT) {
            BottomNav(navController = navController)
        }

    }

}

  }
//}