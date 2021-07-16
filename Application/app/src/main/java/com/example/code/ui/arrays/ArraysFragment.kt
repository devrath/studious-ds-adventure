package com.example.code.ui.arrays

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.code.R

class ArraysFragment : Fragment() {

    private lateinit var arraysViewModel: ArraysViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        arraysViewModel = ViewModelProvider(this).get(ArraysViewModel::class.java)
        return  inflater.inflate(R.layout.fragment_arrays, container, false)
    }
}