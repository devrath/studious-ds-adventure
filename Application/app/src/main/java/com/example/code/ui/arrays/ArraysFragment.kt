package com.example.code.ui.arrays

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.code.R
import com.example.code.databinding.FragmentArraysBinding
import com.example.code.ui.base.BaseFragment
import com.orhanobut.logger.Logger

class ArraysFragment : BaseFragment<FragmentArraysBinding>(FragmentArraysBinding::inflate) , View.OnClickListener{

    private lateinit var viewModel : ArraysViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ArraysViewModel::class.java)
        binding.declareArraysId.setOnClickListener(this@ArraysFragment)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.declareArraysId -> {
               viewModel.declareArray()
            }
        }
    }


}