package programs;

import Utils.SwapItems;

public class ProgramBubbleSort {

    public void initiate() {

        int[] arrayToSort = {20,35,-15,7,55,1,-22};
        startBubbleSort(arrayToSort);

    }

    private void startBubbleSort(int[] arrayToSort) {
        // Initially lets assume all elements are unsorted

        int positionOfUnsortedIndex = arrayToSort.length-1;
        int positionToTraverse = 0;

        for(int i=positionOfUnsortedIndex ; i>0 ; i--){
            /** ******* Here we control the last pointer *************
             * * -> Initially the position is at the end
             * * -> Continue loop until position is > 0
             * * -> On each iteration decrement the index
             ** ****************************************************** **/
            positionToTraverse = 0;
            for(int j=positionToTraverse ; j<i ; j++){
                /** ******* Here we control the first pointer ********
                 * * -> On each iteration position is at the beginning
                 * * -> continue until the pointer is less than sorted position pointer
                 * * -> On each iteration increment the index
                 ** ************************************************** **/
                if(arrayToSort[j]>arrayToSort[j+1]){
                    new SwapItems(arrayToSort,j,j+1);
                }
            }

        }

        System.out.println("***********************************************");
        printArray(arrayToSort);
        System.out.println("***********************************************");
    }

    /**
     * This method is used to print the array !
     * @param arrayToSort
     */
    private void printArray(int[] arrayToSort) {
        for (int i=0 ; i< arrayToSort.length ; i++) {
            System.out.println(arrayToSort[i]);
        }
    }

}
