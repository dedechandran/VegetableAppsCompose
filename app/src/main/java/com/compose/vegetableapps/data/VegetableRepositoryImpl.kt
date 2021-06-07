package com.compose.vegetableapps.data

import javax.inject.Inject

class VegetableRepositoryImpl @Inject constructor() : VegetableRepository {
    override suspend fun getVegetables(): List<Vegetable> {
        return DataSource.getData()
    }
}