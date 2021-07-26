package com.example.code.concepts.stacks;

import com.orhanobut.logger.Logger;

import java.util.Arrays;

/**
 * ALGORITHM:
 * * CREATING:--> We need to create a array of a specific size
 * * INSERTING:-> We have a count variable of type integer kept initialized to zero
 *  whenever we want to add a element to the array, we use the index and add the element to that index
 *  once the element is added we increment the count value by one, thus in such a way we track the position to be added
 *  * DELETING:-> The deleting process is simple, we just decrement the pointer giving the illusion that we removed the item but it is actually there
 *
**/

public class StacksUsingArray {

    private final int[] ourArray;

    private int position = 0;

    public StacksUsingArray(int sizeOfArray) {
        ourArray = new int[sizeOfArray];
    }

    /**
     * Pushing the item to the array
     */
    public void pushItem(int value) {
        if(position<=ourArray.length-1){
            ourArray[position++] = value;
        }else{
            Logger.d("Array is full cannot insert item into the array");
        }
    }

    /**
     * Removing the item from the array
     * @return the element removed
     */
    public void popItem() {
        if(position==0) { throw new IllegalStateException(); }
        int elementRemoved = ourArray[--position];
        Logger.d("Element deleted is: "+elementRemoved);
    }

    /**
     * Getting the top of the element from the stack
     */
    public void peek() {
        if(position==0) { throw new IllegalStateException(); }
        Logger.d("Element: "+ourArray[position-1]);
    }

    /**
     * Printing the elements of the array
     */
    public void print() {
        String result="";

        for(int i=0; i<position; i++){
            if(i==position-1){
                result = result+ourArray[i];
            }else{
                result = result+ourArray[i]+",";
            }
        }
        Logger.d("Result: "+result);
    }


}
