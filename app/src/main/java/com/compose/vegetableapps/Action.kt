package com.compose.vegetableapps

import androidx.navigation.NavController

object Destinations {
    const val Home = "home"
    const val Details = "details"
}

class Action(navController: NavController){
    val navigateToDetails = {
        navController.navigate(Destinations.Details)
    }
    val details = {
        navController.navigateUp()
    }
    val navigateBack = {
        navController.popBackStack()
    }
}