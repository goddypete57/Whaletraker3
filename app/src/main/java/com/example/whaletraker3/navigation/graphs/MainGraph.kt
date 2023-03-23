package com.example.whaletraker3.navigation.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.whaletraker3.navigation.routs.MainRouts
import com.example.whaletraker3.screens.activity.Activity
import com.example.whaletraker3.screens.home.*
import com.example.whaletraker3.screens.home.notification.NotificationScreen
import com.example.whaletraker3.screens.home.notification.NotificationSetting
import com.example.whaletraker3.screens.settings.Settings
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.bottomSheet

@OptIn(ExperimentalMaterialNavigationApi::class)
fun NavGraphBuilder.mainGraph(
    navController: NavController,
) {
    navigation(startDestination = MainRouts.Add_Whale, route = MainRouts.DEFAULT) {

        composable(MainRouts.Add_Whale) {
            AddNewWhale()
        }
        composable(MainRouts.Manage_Whale) {
            ManageWhale(
                navController,
                onShowWhaleSheet = { navController.navigate(MainRouts.ManageWhaleSheet) })

        }
        composable(MainRouts.View_Whale) {
            ViewWhaleDetails(
                onWalletSheet = { navController.navigate(MainRouts.WalletSheet) },
                navController = navController
            )
        }
        composable(MainRouts.Edit_Wallet) {
            Edit_Wallet_Details()
        }
        composable(MainRouts.Add_New_Wallet) {
            Add_New_Wallet()
        }
        composable(MainRouts.Edit_Whale_Details_Screen) {
            Edit_Whale_Detail_Screen()
        }
        composable(MainRouts.NotificationSetting) {
            NotificationSetting()
        }
        composable(MainRouts.Profile) {
            ProfileScreen()
        }

        composable(MainRouts.EditTokenDetails) {
            EditTokenDetails()
        }
        bottomSheet(MainRouts.NotificationScreen) {
            NotificationScreen(
                onClickNotificationSetting = { navController.navigate(MainRouts.NotificationSetting) },
                onNavigateBack = { navController.navigateUp() })
        }
        bottomSheet(MainRouts.EditTokenDetailsSheet) {
            EditTokenDetailSheet(onEditTokenSheet = {
                navController.navigate(
                    MainRouts.EditTokenDetails
                )
            })
        }
        bottomSheet(MainRouts.WalletSheet) {
            WalletSheet(onClose = {
                navController.popBackStack()

            },
                onAddNewWallet = { navController.navigate(MainRouts.Add_New_Wallet) },
                onEditWallet = { navController.navigate(MainRouts.Edit_Wallet) }
            )
        }
        bottomSheet(MainRouts.EditWhaleSheet) {
            EditWhaleDetailSheet(onEditWhaleSheet = {
                navController.popBackStack()
                navController.navigate(MainRouts.Edit_Whale_Details_Screen)


            })
        }

        bottomSheet(MainRouts.Delete_Wallet_Sheet) {
            DeleteWalletSheet(onCancel = {

            }, onDelete = {})
        }

        bottomSheet(MainRouts.Delete_Whale_Sheet) {
            DeleteWhaleSheet(onCancel = {

            }, onDelete = {})
        }
        bottomSheet(MainRouts.ManageWhaleSheet) {
            ManageWhaleSheet(onEditWhale = {
                navController.navigate(MainRouts.Edit_Whale_Details_Screen)
            }, onViewWhale = { navController.navigate(MainRouts.View_Whale) })
        }
    }
}

