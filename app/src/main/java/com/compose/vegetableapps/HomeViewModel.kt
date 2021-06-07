package com.compose.vegetableapps

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.compose.vegetableapps.data.HomeUiState
import com.compose.vegetableapps.data.VegetableRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val vegetableRepository: VegetableRepository
) : ViewModel() {

    val uiState: StateFlow<HomeUiState> = flow {
        emit(HomeUiState(vegetableCollections = vegetableRepository.getVegetables()))
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = HomeUiState(loading = true)
    )

}