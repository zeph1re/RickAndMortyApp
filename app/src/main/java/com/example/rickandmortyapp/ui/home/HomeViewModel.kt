package com.example.rickandmortyapp.ui.home

import android.util.Log
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortyapp.api.RetrofitInstance
import com.example.rickandmortyapp.models.Character
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel(){
    private val apiService = RetrofitInstance.api
    private val _characterData = MutableLiveData<List<Character>>()
    val characterData: LiveData<List<Character>> = _characterData

    fun getCharacter() {
        viewModelScope.launch {
            try {
                val response = apiService.getCharacter().results
                Log.d("response", response.toString())

                if (response.isNotEmpty()) {
                    Log.d("response", response.toString())

                    _characterData.value = response
                }
            } catch (e: Exception) {
                // Handle errors here
            }
        }
    }

}