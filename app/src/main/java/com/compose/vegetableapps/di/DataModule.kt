package com.compose.vegetableapps.di

import com.compose.vegetableapps.data.VegetableRepository
import com.compose.vegetableapps.data.VegetableRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideVegetableRepository(vegetableRepositoryImpl: VegetableRepositoryImpl): VegetableRepository {
        return vegetableRepositoryImpl
    }
}