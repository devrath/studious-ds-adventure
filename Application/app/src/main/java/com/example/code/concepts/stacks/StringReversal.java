package com.example.code.concepts.stacks;

import java.util.Stack;

public class StringReversal {

    StringBuilder strBuilder = new StringBuilder();

    public String initiate(String userEnteredInput) {

        char[] input = userEnteredInput.toCharArray();
        Stack<Character> inputChar = new Stack<>();

        for (Character ch:input) {
            inputChar.push(ch);
        }
        
        while (!inputChar.isEmpty()) {
            strBuilder.append(inputChar.pop());
        }
        
        return strBuilder.toString();
    }

}
