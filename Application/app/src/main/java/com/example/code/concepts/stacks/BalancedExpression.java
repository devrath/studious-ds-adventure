package com.example.code.concepts.stacks;

import java.util.Stack;

public class BalancedExpression {


    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            // Opening Brackets
            if(isLeftExpression(ch)){
                stack.push(ch);
            }

            // Closing Brackets
            if(isRightExpression(ch)){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if(isProperBracketPair(ch,top)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isProperBracketPair(char ch , char top){
        return (ch==')' && top!='(') ||
                (ch==']' && top!='[') ||
                (ch=='>' && top!='<') ||
                (ch=='}' && top!='{');
    }

    private boolean isLeftExpression(char ch){
        return ch == '(' || ch == '[' || ch == '{' || ch == '<';
    }

    private boolean isRightExpression(char ch){
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }

}
