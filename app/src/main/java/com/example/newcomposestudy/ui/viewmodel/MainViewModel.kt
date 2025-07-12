package com.example.newcomposestudy.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter by mutableStateOf(0)
        private set

    fun increase() {
        counter++
    }
}