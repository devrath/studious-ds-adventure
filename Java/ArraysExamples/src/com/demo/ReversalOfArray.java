package com.demo;

import java.util.Arrays;

public class ReversalOfArray {

    private int[] items;
    private int count;

    public ReversalOfArray(int count) {
        items = new int[count];
    }

    // OPERATION: Insert
    public void insert(int item) {
        // If the array is full, resize it
        if(items.length==count){
            System.out.println("All the items are inserted:"+"--"+"can't insert: "+item);
        }else{
            // Add the item to the end of the array
            items[count++] = item;
        }
    }

    // OPERATION: Display
    public void display() {
        System.out.println(Arrays.toString(items));
    }

    // OPERATION: reversal
    public void reverse() {
        int frontPointer = 0;
        int endPointer = items.length-1;
        while (frontPointer<endPointer){
            int temp;
            temp = items[endPointer];
            items[endPointer] = items[frontPointer];
            items[frontPointer] = temp;
            frontPointer++;
            endPointer--;
        }
    }
}
