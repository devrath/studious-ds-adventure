package com.example.code.ui.arrays

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.code.concepts.arrays.Arrays
import com.orhanobut.logger.Logger
import java.util.*

class ArraysViewModel : ViewModel() {

    fun buildingCustomArray() {
        val arrays = Arrays(3)
        arrays.print()

        arrays.insert(11)
        arrays.insert(22)
        arrays.insert(33)
        arrays.insert(44)
        arrays.insert(55)
        arrays.insert(66)

        arrays.print()

        arrays.indexOf(55)
    }

}