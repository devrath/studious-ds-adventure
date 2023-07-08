package algorithms.udemy;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args){
        int[] items = {4,2,6,5,1,3};
        System.out.println("Initial Array:->"+Arrays.toString(items));
        System.out.println("Final Array:->"+Arrays.toString(sortItems(items)));
    }

    private static int[] sortItems(int[] items) {
        // For N elements in array there will be (N-1) comparisons

        for (int i=items.length-1 ; i>0 ; i--){
            for(int j=0 ; j<i ; j++){
                if(items[j]>items[j+1]){
                    // Exchange the items
                    int temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }

        return items;
    }


}
