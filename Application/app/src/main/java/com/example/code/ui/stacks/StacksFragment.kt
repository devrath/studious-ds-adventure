package com.example.code.ui.stacks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.code.R
import com.example.code.databinding.FragmentLinkedlistBinding
import com.example.code.databinding.FragmentStacksBinding
import com.example.code.ui.base.BaseFragment
import com.example.code.ui.linkedList.LinkedListViewModel

class StacksFragment : BaseFragment<FragmentStacksBinding>(FragmentStacksBinding::inflate), View.OnClickListener {

    private lateinit var viewModel: StacksViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(StacksViewModel::class.java)
        binding.buildingLinkedListId.setOnClickListener(this@StacksFragment)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buildingLinkedListId -> {
                //viewModel.buildingCustomLinkedList()
            }
        }
    }

}