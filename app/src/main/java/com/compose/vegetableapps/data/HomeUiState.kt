package com.compose.vegetableapps.data

data class HomeUiState(
    val vegetableCollections: List<Vegetable> = emptyList(),
    val loading: Boolean = false,
    val error: Boolean = false
)