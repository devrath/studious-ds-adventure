package com.example.code.ui.arrays

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArraysViewModel : ViewModel() {
    private val _output = MutableLiveData<String>()
    val output: LiveData<String> = _output

    fun declareArray() {
        _output.value = "Answer"
    }
}