package com.demo;

import java.util.Arrays;

public class StackUsingArray {

    private int[] items;
    private int count = 0 ;

    public StackUsingArray(int size) {
        this.items = new int[size];
    }

    // Push operation of the stack
    public void push(int item){

        // Check if the array is full
        if(!isStackFull()){
            // Value can be inserted
            items[count] = item;
        }else{
            System.out.println("Stack is full, Can't add items!");
        }

        // Increment the counter
        count++;
    }

    // Pop operation of the stack
    public void pop(){

        // Check if the array is full
        if(!isStackEmpty()){
            // Re-initialize the value to zero
            if(count!=0){
                items[count-1] = 0;
                // Decrement the counter
                count--;
            }else{
                System.out.println("Stack is empty, Can't delete items!");
            }
        }else{
            System.out.println("Stack is empty, Can't delete items!");
        }
    }

    // Is the stack full
    private boolean isStackFull() {
        return items.length==count;
    }

    // Is the stack empty
    private boolean isStackEmpty() {
        return items.length==0;
    }

    // Display the elements in the array
    public void display() {
        //System.out.println(Arrays.toString(items));
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
