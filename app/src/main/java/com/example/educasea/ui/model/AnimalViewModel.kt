package com.example.educasea.ui.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educasea.ui.api.Animal
import com.example.educasea.ui.api.AnimalService
import kotlinx.coroutines.launch

class AnimalViewModel : ViewModel() {
    private val _animalList = mutableListOf<Animal>()
    var errorMessage: String by mutableStateOf("")

    val animalList: List<Animal>
        get() = _animalList

    fun getAnimalList() {
        viewModelScope.launch {
            val animalService = AnimalService.getInstance()
            try {
                _animalList.clear()
                _animalList.addAll(animalService.getAnimals())

            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}