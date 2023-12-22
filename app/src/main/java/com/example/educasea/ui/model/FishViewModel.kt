package com.example.educasea.ui.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educasea.ui.api.Fish
import com.example.educasea.ui.api.FishService
import kotlinx.coroutines.launch

class FishViewModel: ViewModel() {
    private val _fishList = mutableStateListOf<Fish>()
    private var errorMessage: String by mutableStateOf("")
    val fishList: List<Fish>
        get() = _fishList

    fun getFishList() {
        viewModelScope.launch {
            val fishService = FishService.getInstance()
            try {
                _fishList.clear()
                _fishList.addAll(fishService.getFishes())

            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}