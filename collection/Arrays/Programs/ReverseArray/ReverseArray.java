package arrays.programs;

import java.util.Arrays;

public class ReverseArray {

    int[] inputArray = new int[]{1,2,3,4,5};

    public ReverseArray(){
        System.out.println(Arrays.toString(Arrays.stream(inputArray).toArray()));
        reverse();
        System.out.println(Arrays.toString(Arrays.stream(inputArray).toArray()));
    }

    private void reverse() {
        int initialPointer = 0;
        int finalPointer = inputArray.length-1;
        while (initialPointer<finalPointer){
            // Swap elements
            int temp = inputArray[initialPointer];
            inputArray[initialPointer] = inputArray[finalPointer];
            inputArray[finalPointer] = temp;
            // Update pointers
            initialPointer++;
            finalPointer--;
        }
    }


}
