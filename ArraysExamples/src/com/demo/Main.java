package com.demo;

public class Main {

    public static void main(String[] args) {
        CustomArray obj = new CustomArray(2);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        //obj.removeAt(2);
        obj.display();
    }
}
