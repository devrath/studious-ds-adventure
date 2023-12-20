package arrays.programs.easy;

import java.util.Arrays;

public class RemoveElement {

    int[] inputArray = new int[]{0,1,2,2,3,0,4,2};
    int elementToRemove = 2;

    public RemoveElement(){

        int leftPointer = 0;
        int rightPointer = inputArray.length-1;

        while((leftPointer<rightPointer)){
            if(inputArray[leftPointer]!=elementToRemove){
                // Keep incrementing left pointer
                leftPointer++;
            }else{
                // Exchange left with right pointer
                int temp = inputArray[leftPointer];
                // Swap elements
                inputArray[leftPointer] = inputArray[rightPointer];
                inputArray[rightPointer] = temp;
                // Decrement the right pointer
                rightPointer--;
            }
        }

        int result = leftPointer+1;

        System.out.println("Result position: -->"+result);

    }




}
