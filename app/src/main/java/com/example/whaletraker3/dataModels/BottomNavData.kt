package com.example.whaletraker3.dataModels

import com.example.whaletraker3.R
import com.example.whaletraker3.navigation.routs.BottomRouts

data class BottomNavItem(var rout: String, var title: String, var icon: Int)


object BottomNavData {
    var home = BottomNavItem(BottomRouts.HOME, "Home", R.drawable.home_icon)
    var activity = BottomNavItem(BottomRouts.Activity, "Activity", R.drawable.activity_icon)
    var settings = BottomNavItem(BottomRouts.Settings, "Settings", R.drawable.settings_icon)

}