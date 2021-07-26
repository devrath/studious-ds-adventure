package com.example.code.ui.stacks

import androidx.lifecycle.ViewModel
import com.example.code.concepts.stacks.BalancedExpression
import com.example.code.concepts.stacks.StacksMinValue
import com.example.code.concepts.stacks.StacksUsingArray
import com.example.code.concepts.stacks.StringReversal
import com.orhanobut.logger.Logger

class StacksViewModel : ViewModel() {

    fun reversingAString(input: String) {
        val result = StringReversal().initiate(input)
        Logger.d(result)
    }

    fun balancedExpression(input: String) {
        val result = BalancedExpression().isBalanced(input)
        Logger.d("Is expression balanced:-> $result")
    }

    fun stackUsingArray() {
        val data = StacksUsingArray(5)
        data.pushItem(10)
        data.print()
        data.pushItem(50)
        data.print()
        data.popItem()
        data.print()
        data.peek()
    }

    fun stackMinimumValue() {
        val data = StacksMinValue()
        data.push(10)
        data.push(5)
        data.push(50)
        data.push(2)
        data.pop()
        data.pop()
        data.pop()
        data.minimumItem()
    }


}