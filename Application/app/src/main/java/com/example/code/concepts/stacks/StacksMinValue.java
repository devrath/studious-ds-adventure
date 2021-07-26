package com.example.code.concepts.stacks;

import com.orhanobut.logger.Logger;

import java.util.Stack;

public class StacksMinValue {

    // main stack to store elements
    private Stack<Integer> ourStack = new Stack<>();

    // variable to store the minimum element
    private int min = 0;

    public void push(int itemToAdd){

        if(ourStack.isEmpty()){
            min = itemToAdd;
            ourStack.push(itemToAdd);
        }else if(itemToAdd<min){
            ourStack.push(2*itemToAdd - min);
            min = itemToAdd;
        }else{
            ourStack.push(itemToAdd);
        }

    }

    public void pop(){

        if (ourStack.empty()) {
            Logger.d("Stack underflow!!");
            return;
        }

        int top =  ourStack.pop();

        if (top < min) {
            min = 2*min - top;
        }
    }

    public void minimumItem() {
        Logger.d("Minimum value:->"+min);
    }


}
