package com.example.code.concepts.stacks;

import java.util.Stack;

public class BalancedExpression {


    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            // Opening Brackets
            if(ch == '('){ stack.push(ch); }

            // Closing Brackets
            if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
