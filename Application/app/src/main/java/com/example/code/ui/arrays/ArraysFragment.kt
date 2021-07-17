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
import com.example.code.databinding.FragmentArraysBinding
import com.example.code.ui.base.BaseFragment

class ArraysFragment : BaseFragment<FragmentArraysBinding>(FragmentArraysBinding::inflate) {

    private lateinit var arraysViewModel: ArraysViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}