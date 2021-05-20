package com.demo;

public class Main {

    public static void main(String[] args) {
        var input = ")1 + 2(";
        var balancedExpressions = new BalancedExpressions();
        System.out.println(balancedExpressions.isBalanced(input));
    }
}
