package com.example.lunchtray

import androidx.lifecycle.ViewModel
import com.example.lunchtray.data.Datasource
import com.example.lunchtray.data.Options
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LunchTrayViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(LunchUiState())
    val uiState: StateFlow<LunchUiState> = _uiState.asStateFlow()

    var userOrder= listOf<Options>()

    var entreeOptions = Datasource.Entree
    var sideDishOptions = Datasource.SideDish
    var accompanimentOptions = Datasource.Accompaniment

    fun selectOptions(options: Options){
        var choice = options.selected
        options.selected = !choice
    }
}