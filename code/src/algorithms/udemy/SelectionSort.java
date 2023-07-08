package algorithms.udemy;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int[] items = {4,2,6,5,1,3};
        System.out.println("Initial Array:->"+ Arrays.toString(items));
        System.out.println("Final Array:->"+Arrays.toString(sortItems(items)));
    }

    private static int[] sortItems(int[] items) {

        int minItemIndex = 0;

        for(int i=items.length-1 ; i<0 ; i++ ){
            for(int j=0 ; i<j ; j++){
                if(items[i]>items[i+1]){
                    minItemIndex = i;
                }else{
                    minItemIndex = i+1;
                }
            }

            if(i!=minItemIndex){
                int temp = items[i];
                items[i] = items[minItemIndex];
                items[minItemIndex] = temp;
            }

        }

        return items;
    }


}
