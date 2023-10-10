package AlgoExpert.sorting;


import java.util.Arrays;

/**
 *
 * <*>
 * Approach: ---------> Here we can use 2 for loops and one nested in another
 * and in each iteration the largest item reaches to the end of the array. We
 * keep repeating until all the elements in array is sorted.
 * </*>
 * <*>
 * Input: [8, 5, 2, 9, 5, 6, 3]
 * Initial loop index: i=0, j=1 .... Also in the inner loop Input.length-i (Since on each loop one element is sorted at the end)
 * Comparison: Input[j-1] compared with Input[j]
 * </*>
 * <*>
 * TImeComplexity: ---> O(n2)
 * </*>
 */
public class BubbleSort {


    public static void main(String[] args){

        int[] elements = new int[]{8,5,2,9,5,6,3};
        int arrayLength = elements.length;

        System.out.println("Before Sorting-->"+Arrays.toString(elements));

        for(int i=0 ; i<arrayLength ; i++){
            // On every iteration one element is sorted at the end so (arrayLength-i)
            for(int j= 1 ; j<arrayLength-i;j++){
                if(elements[j-1]>elements[j]){
                    // Swap values
                    int temp = elements[j];
                    elements[j] =  elements[j-1];
                    elements[j-1] =  temp;
                }
            }
        }

        System.out.println("After Sorting-->"+Arrays.toString(elements));
    }

}
