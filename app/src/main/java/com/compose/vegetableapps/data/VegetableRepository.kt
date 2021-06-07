package com.compose.vegetableapps.data

interface VegetableRepository {
    suspend fun getVegetables(): List<Vegetable>
}