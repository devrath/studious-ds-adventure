package com.demo;


public class ConstantTime {

    // Here the size of the input doesn't matter
    // Because no matter what the size of the input is, we are just printing Just one item with the help of its indices
    public void program1(int[] numbers){
        System.out.println(numbers[0]); // O(1)
    }

    // Here the size of the input doesn't matter
    // Because no matter what the size of the input is, we are just printing Just one item with the help of its indices
    public void program2(int[] numbers){
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[1]); // O(1)
        // Runtime Complexity: O(1) + O(1) => O(2) => O(1)
        // We only consider the constant time
    }

}
