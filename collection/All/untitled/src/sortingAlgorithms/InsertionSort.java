package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    int[] input = new int[]{8,2,4,1,3};

    public InsertionSort() { performSorting(); }

    private void performSorting() {

        System.out.println("BEFORE SORTING:-> "+Arrays.toString(input));


        for(int i=1 ; i<input.length ; i++){
            // Store the element in temp variable
            int temp = input[i];
            // We start from previous item
            int j = i-1;

            // iterate to left
            while(j>=0  && input[j]>temp){
                input[j+1] = input[j];
                j--;
            }
            // By now all the elements are shifted to right
            input[j+1] = temp;
        }

        System.out.println("AFTER SORTING:-> "+ Arrays.toString(input));


    }


}
