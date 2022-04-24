package Utils;

public class SwapItems {
    /**
     * This function is used to swap the two elements in an array
     * The two elements are picked up by the indices
     */
    public SwapItems(int[] array, int leftEleIndex, int rightEleIndex){

        // If the array size is zero then just return because there are no elements to swap
        if(array.length==0){
            return;
        }

        // If (leftEleIndex == rightEleIndex) => Do nothing since we cannot swap same element with itself
        if(leftEleIndex == rightEleIndex){
            return;
        }

        // Perform the swap
        int temp = array[leftEleIndex];
        array[leftEleIndex] = array[rightEleIndex];
        array[rightEleIndex] = temp;
    }
}
