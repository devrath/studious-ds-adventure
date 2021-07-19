package com.example.code.ui.linkedList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.code.concepts.linkedlist.LinkedList

class LinkedListViewModel : ViewModel() {

    fun buildingCustomLinkedList() {

        val lst = LinkedList()

        lst.addFirst(10)
        lst.addFirst(20)
        lst.addFirst(30)
        lst.addFirst(40)


        lst.deleteLast()
        lst.deleteLast()
        lst.deleteLast()
        lst.deleteLast()

        //lst.deleteLast()

    }

}