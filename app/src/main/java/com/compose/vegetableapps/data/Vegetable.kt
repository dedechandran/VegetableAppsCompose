package com.compose.vegetableapps.data

data class Vegetable(
    val id: String,
    val imageResId: Int,
    val name: String,
    val latinName: String,
    val description: String,
    val isFavourite: Boolean
)
