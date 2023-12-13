package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    int[] input = new int[]{8,2,4,1,3};

    public BubbleSort() { performSorting(); }

    private void performSorting() {

        int size = input.length;

        System.out.println("BEFORE SORTING:-> "+Arrays.toString(input));

        for(int i=0; i<size ; i++){
            for(int j=1 ; j<size-i ; j++){
                if(input[j-1]>input[j]){
                    int temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                }
            }
        }

        System.out.println("AFTER SORTING:-> "+Arrays.toString(input));

    }


}
