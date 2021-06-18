package com.demo;

import java.util.Stack;

public class ReversingString {

    public String reverse(String input){

        if(input==null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) { stack.push(ch); }

        var strBuffer = new StringBuilder();

        while (!stack.isEmpty()){
            strBuffer.append(stack.pop());
        }

        return strBuffer.toString();
    }

}
