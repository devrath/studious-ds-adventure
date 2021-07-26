package com.example.code.ui.stacks

import androidx.lifecycle.ViewModel
import com.example.code.concepts.stacks.BalancedExpression
import com.example.code.concepts.stacks.StacksUsingArray
import com.example.code.concepts.stacks.StringReversal
import com.orhanobut.logger.Logger
import java.util.*

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
        data.printArray()
        data.pushItem(20)
        data.printArray()
        data.pushItem(30)
        data.printArray()
        data.pushItem(40)
        data.printArray()
        data.pushItem(50)
        data.printArray()

        data.popItem()

        data.printArray()
    }


}