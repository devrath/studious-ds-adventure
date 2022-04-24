package programs;

import Utils.PrintArray;

public class ProgramInsertionSort {

    public void initiate() {
        int[] arrayToSort = {20,35,-15,7,55,1,-22};
        startInsertionSort(arrayToSort);
    }

    private void startInsertionSort(int[] arrayToSort) {
        // Print the initial array
        new PrintArray(arrayToSort);
        // Initially we assume that the element at the first position is sorted, so we start from first position
        for(int firstUnsortedIndex = 1; firstUnsortedIndex<arrayToSort.length; firstUnsortedIndex++){
            /**
             * We are growing the sorted partition from left to right
             * Also the firstUnsortedIndex will increase by 1 after each iteration
             * Save the element at index firstUnsortedIndex on every iteration
            **/
            int newElement = arrayToSort[firstUnsortedIndex];
            int i;
            /**
             *  Below is the loop that does the sorted part looping
             *  It finds the place at which we need to perform the insertion
             *  **
             *  Here we traverse from right to left
             *  ** Start from firstUnsortedIndex ---> Until the first item of array && element we are trying to insert is less than or equal
            **/
            for(i=firstUnsortedIndex; i > 0 && arrayToSort[i-1]>newElement; i--){
                // Shift from left to right
                arrayToSort[i] = arrayToSort[i-1];
            }

            arrayToSort[i] = newElement;
        }

        // Print the Final array
        new PrintArray(arrayToSort);
    }


}
