package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    int[] input = new int[]{8,2,4,1,3};

    public SelectionSort() { performSorting(); }

    private void performSorting() {

        int size = input.length;

        System.out.println("BEFORE SORTING:-> "+Arrays.toString(input));

        for(int i=0; i<size ; i++){
            // SmallestPosition points to first position of unsorted part in the array
            int smallestPosition = i;

            for(int j=i ; j<size ; j++){
                if(input[smallestPosition]>input[j]) {
                    smallestPosition = j;
                }
            }

            // Here the `i` will still hold the start of `unsorted array` and
            // SmallestPosition points to `first` position of unsorted part in the array
            int temp = input[i];
            input[i] = input[smallestPosition];
            input[smallestPosition] = temp;
        }

        System.out.println("AFTER SORTING:-> "+Arrays.toString(input));

    }


}
