package com.example.educasea.ui.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educasea.ui.api.BiotaService
import com.example.educasea.ui.api.Biota
import kotlinx.coroutines.launch

class BiotaViewModel : ViewModel() {
    private val _biotaList = mutableStateListOf<Biota>()
    var errorMessage: String by mutableStateOf("")
    val biotaList: List<Biota>
        get() = _biotaList

    fun getBiotaList() {
        viewModelScope.launch {
            val biotaService = BiotaService.getInstance()
            try {
                _biotaList.clear()
                _biotaList.addAll(biotaService.getBiotas())

            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}