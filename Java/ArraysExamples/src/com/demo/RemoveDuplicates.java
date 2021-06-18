package com.demo;

import java.util.Arrays;

public class RemoveDuplicates {
    private int[] items;
    private int count;

    public RemoveDuplicates(int count) {
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

    // OPERATION: remove duplicates
    public void removeDuplicates() {
        // Step-1: Remove duplicates
       int[] tempItems = new int[count];

       for(int i=0, j=0 ; i<items.length-1 ; i++) {
           if(items[i]!=items[i+1]){
               tempItems[j++]=items[i];
           }
       }
       items = tempItems;

        // Step-2: Remove the zeros

        int newArraySize = 0;
        for(int i=0 ; i<items.length-1 ; i++) {
            if(items[i]!=0){
                newArraySize++;
            }
        }

        int[] newArrayItems = new int[newArraySize];
        for(int i=0 , j=0; i<items.length-1 ; i++) {
            if(items[i]!=0){
                newArrayItems[j++] = items[i];
            }
        }

        items = newArrayItems;
    }
}
