package com.demo;

import java.util.Arrays;

public class CustomArray {

    private int[] items;
    private int count=0;

    public CustomArray(int size) {
        items = new int[size];
    }

    public void insert(int item){
       // If the array is full, resize it
        if(items.length==count){
            // Create a new array (Size is twice of existing array)
            int[] newItems = new int[count*2];
            // Copy the items to the new array
            for(int i=0 ; i<count ; i++){
                newItems[i] = items[i];
            }
            // Set items to this new array | - > Without this step we might get array index out of bound
            items = newItems;
        }
       // Add the item to the end of the array
        items[count++] = item;
    }


    private int getArrayLength() {
        return items.length;
    }

    public void display(){
        // System.out.println(Arrays.toString(items));
        System.out.print("[");
        int itemsPrinted = 0;
        for(int i=0 ; i<count ; i++){
            System.out.print(items[i]);
            if(itemsPrinted<count-1){
                System.out.print(",");
            }
            itemsPrinted++;
        }
        System.out.print("]");
    }

}
