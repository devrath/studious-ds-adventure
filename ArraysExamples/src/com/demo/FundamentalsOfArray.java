package com.demo;

import java.util.Arrays;

public class FundamentalsOfArray {

    public void printArrayAddress() {
        int[] numbers = new int[10];
        System.out.println(numbers);
        // ----------------------------------------- >
        // [I@4617c264
        // [I -> Type of array
        // @  -> Followed by @
        // 4617c264 -> Address of the array
        // ----------------------------------------- >
    }

    public void printEmptyArrayContents() {
        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
        // ----------------------------------------- >
        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // ----------------------------------------- >
    }

    public void addContentsToArray() {
        int[] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        System.out.println(Arrays.toString(numbers));
        // ----------------------------------------- >
        // [10, 20, 30, 40, 0, 0, 0, 0, 0, 0]
        // ----------------------------------------- >
    }

    public void declareAddAtOnce() {
        int[] numbers = {10,20,30,40};
        System.out.println(Arrays.toString(numbers));
        // ----------------------------------------- >
        // [10, 20, 30, 40]
        // ----------------------------------------- >
    }

    public void printArrayLength() {
        int[] numbers = {10,20,30,40};
        System.out.println(numbers.length);
        // ----------------------------------------- >
        // 4
        // ----------------------------------------- >
    }

}
