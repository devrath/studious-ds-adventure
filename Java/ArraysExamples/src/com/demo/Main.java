package com.demo;

public class Main {

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates(5);
        obj.insert(10);
        obj.insert(10);
        obj.insert(20);
        obj.insert(20);
        obj.insert(30);
        obj.removeDuplicates();
        obj.display();
    }
}
