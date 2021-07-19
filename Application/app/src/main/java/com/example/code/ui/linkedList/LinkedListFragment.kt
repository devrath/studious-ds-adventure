package com.example.code.ui.linkedList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.code.R
import com.example.code.databinding.FragmentArraysBinding
import com.example.code.databinding.FragmentLinkedlistBinding
import com.example.code.ui.arrays.ArraysViewModel
import com.example.code.ui.base.BaseFragment

class LinkedListFragment : BaseFragment<FragmentLinkedlistBinding>(FragmentLinkedlistBinding::inflate), View.OnClickListener {

    private lateinit var viewModel: LinkedListViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(LinkedListViewModel::class.java)
        binding.buildingLinkedListId.setOnClickListener(this@LinkedListFragment)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buildingLinkedListId -> {
                viewModel.buildingCustomLinkedList()
            }
        }
    }


}