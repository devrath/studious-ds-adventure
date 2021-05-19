package com.demo;

import java.util.Arrays;

public class DeclaringArray {


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

}
