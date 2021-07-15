package com.example.code.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.code.R

class NotationFragment : Fragment() {

    private lateinit var notationViewModel: NotationViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notationViewModel = ViewModelProvider(this).get(NotationViewModel::class.java)
        return inflater.inflate(R.layout.fragment_notation, container, false)
    }
}