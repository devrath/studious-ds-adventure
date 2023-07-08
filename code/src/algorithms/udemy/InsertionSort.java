package algorithms.udemy;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] items = {4,2,6,5,1,3};
        System.out.println("Initial Array:->"+ Arrays.toString(items));
        System.out.println("Final Array:->"+Arrays.toString(sortItems(items)));
    }

    private static int[] sortItems(int[] items) {
        // We start with second item and till the end of the array

        for(int i=1 ; i<items.length ; i++ ){
            // Item to compare
            int temp = items[i];
            // Start position to compare
            int j = i-1;
            while(j>-1 && temp<items[j]){
                // Item that we compare is lesser than `sub-array` comparison
                items[j+1]=items[j];
                items[j]= temp;
                j--;
            }

        }

        return items;
    }


}
