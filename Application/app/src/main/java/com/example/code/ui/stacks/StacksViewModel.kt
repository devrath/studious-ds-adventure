package com.example.code.ui.stacks

import androidx.lifecycle.ViewModel
import com.example.code.concepts.stacks.BalancedExpression
import com.example.code.concepts.stacks.StringReversal
import com.orhanobut.logger.Logger

class StacksViewModel : ViewModel() {

    fun reversingAString(input : String) {
        val result = StringReversal().initiate(input)
        Logger.d(result)
    }

    fun balancedExpression(input : String) {
        val result = BalancedExpression().isBalanced(input)
        Logger.d("Is expression balanced:-> $result")
    }

    fun stackUsingArray() {

    }


}