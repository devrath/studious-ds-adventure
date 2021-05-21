package com.demo;

public class Main {

    public static void main(String[] args) {

        var stackUsingArray = new StackUsingArray(5);
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.push(40);
        stackUsingArray.push(50);
        stackUsingArray.display();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.display();
        stackUsingArray.pop();

    }
}
