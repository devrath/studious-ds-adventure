package arrays.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {

    int[] inputArray = new int[]{0,0,1,1,1,2,2,3,3,4};

    public RemoveDuplicatesFromSortedArray(){

        if(inputArray==null){
            // Data set is null
            System.out.println("Invalid data set since the input is null");
        }else if(inputArray.length==0){
            // Number of elements are zero
            System.out.println("Empty array so we cannot remove the duplicates");
        }else if(inputArray.length==1){
            // Number of elements are just one
            System.out.println(Arrays.toString(Arrays.stream(inputArray).toArray()));
        }else{
            // More than one number of elements
            // We shall use two pointers
            int leftPointer = 0;
            int rightPointer = 1;

            while(rightPointer<inputArray.length){
                int leftPointerElement = inputArray[leftPointer];
                int rightPointerElement = inputArray[rightPointer];

                if(leftPointerElement==rightPointerElement){
                    // Keep Incrementing right pointer
                    rightPointer++;
                }else if(rightPointerElement>leftPointerElement){
                    // Increment left pointer
                    leftPointer++;
                    // Copy right pointer element to left pointer element
                    inputArray[leftPointer] = inputArray[rightPointer];
                }
            }

            // Because initial array position starts from zero position
            int result = leftPointer+1;
            System.out.println("Result Index ->"+result);
        }
    }

}
