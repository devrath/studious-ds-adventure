package com.demo;

public class Main {

    public static void main(String[] args) {
        ReversalOfArray obj = new ReversalOfArray(5);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.reverse();
        obj.display();
    }
}
