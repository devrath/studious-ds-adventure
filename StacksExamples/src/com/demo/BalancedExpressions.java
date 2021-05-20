package com.demo;

import java.util.Stack;

public class BalancedExpressions {

    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if(isLeftExpression(ch)){
                stack.push(ch);
            }
            if(isRightExpression(ch)){
                if(stack.isEmpty()) { return false; }
                var top = stack.pop();
                if(isProperBracketSystem(ch, top)) { return false;}
            }
        }

        return stack.empty();
    }

    private boolean isProperBracketSystem(char ch, Character top) {
        return (ch == ')' && top != '(') ||
                (ch == ']' && top != '[') ||
                (ch == '}' && top != '{') ||
                (ch == '>' && top != '<');
    }

    private boolean isRightExpression(char ch) {
        return ch == ')' || ch == ']' || ch == '>' || ch == '}';
    }

    private boolean isLeftExpression(char ch) {
        return ch == '(' || ch == '[' || ch == '<' || ch == '{';
    }

}
