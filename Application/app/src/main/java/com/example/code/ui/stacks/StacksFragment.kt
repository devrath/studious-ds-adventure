package com.example.code.ui.stacks

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.code.R
import com.example.code.databinding.FragmentStacksBinding
import com.example.code.ui.base.BaseFragment

class StacksFragment : BaseFragment<FragmentStacksBinding>(FragmentStacksBinding::inflate), View.OnClickListener {

    private lateinit var viewModel: StacksViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(StacksViewModel::class.java)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding.apply {
            revStrId.setOnClickListener(this@StacksFragment)
            balExpId.setOnClickListener(this@StacksFragment)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.revStrId -> {
                viewModel.reversingAString("mahesh")
            }
            R.id.balExpId -> {
                viewModel.balancedExpression("(<a+b> + {a-n})")
            }
        }
    }

}