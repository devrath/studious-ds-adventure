package com.example.code.ui.linkedList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.code.concepts.linkedlist.LinkedList

class LinkedListViewModel : ViewModel() {

    fun buildingCustomLinkedList() {

        val lst = LinkedList()
        lst.addLast(10)
        lst.addLast(20)
        lst.addLast(30)
        lst.addLast(40)

        println(lst)

    }

}