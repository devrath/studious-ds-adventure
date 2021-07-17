package com.example.code.concepts.arrays;

import com.orhanobut.logger.Logger;

public class Arrays {

    // Elements in the array
    private int[] items;
    // We need to keep track of the items inserted into the array
    private int count=0;

    // Declare the array with the size passed in the constructor
    public Arrays(int size) {
        this.items = new int[size];
    }

    public void print() {
        for(int i=0; i<count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int value){
        if( count < items.length ){
            /* If ----> The array is not full,
             * Then --> We just add the element at the end of the array
             * ********************************************************
             * Description --> To do this , we need the index to insert
             * Count is used to keep track of the index, Initially it will be 0 and then subsequent item once we add  */
            items[count++] = value;
        }else if( count == items.length) {
            /* If ----> The array is full,
             * Then --> We need to resize it and we need to add the element at the end of the array */
            int[] newItemSet = new int[items.length+1];
            for(int i=0; i<count; i++){
                newItemSet[i] = items[i];
            }

            items = newItemSet;
            items[count++] = value;
        }
    }

    public void delete(int index){
        if (items.length==0) {
            /*
            * Check if the elements in the array is empty, if it is empty print a custom message.
            */
            Logger.d("There are no elements present to delete");
        } else if (index<0 || index>=count) {
            /* Validate index for negative value and for the value higher than the number of elements that are present.
             * Ex: If the array has 10 elements, then the last index value is 9 -> So if the input here is 10 or more then the value is invalid */
            Logger.d("Index is not valid !");
        } else {
            /* If the index is valid, Then shift the elements to the left to fill the removed place
             * Strategy: This meaning from the elements next to the index to be deleted, shift all the elements to the left
             * We will use a for loop that starts at the index to be deleted and reach all the way to the end of the array
             */
            for (int i=index ; i<count-1 ; i++){
                items[i] = items[i+1];
            }
            count--;
        }


    }

}