package algorithms.udemy;

public class MergeSort {

    public static void main(String[] args){
        int[] inputArray = {5,4,7,1,3,2,8,6};
        int[] inputArray1 = {5,4,7,1};
        int[] inputArray2 = {3,2,8,6};

        performMerge(inputArray1,inputArray2);

    }

    private static int[] performMerge(
            int[] inputArray1, int[] inputArray2
    ) {

        int resultArraySize = inputArray1.length+inputArray2.length;
        int[] result = new int[resultArraySize];

        int mainCounter = 0;
        int array1Counter = 0;
        int array2Counter = 0;

        /**
         * Keep looping until either one the arrays are empty
         * Meaning when the counter reaches to length, means it has reached to end
         */
        while(
              array1Counter<inputArray1.length &&
              array2Counter<inputArray2.length
        ){
            if(inputArray1[array1Counter]<inputArray2[array2Counter]){
                result[mainCounter] = inputArray1[array1Counter];
                array1Counter++;
            }else{
                result[mainCounter] = inputArray1[array2Counter];
                array2Counter++;
            }
            mainCounter++;
        }

        // Now add the remaining array to the result
        while(array1Counter<inputArray1.length){
            result[mainCounter] = inputArray1[array1Counter];
            mainCounter++;
        }

        while(array2Counter<inputArray2.length){
            result[mainCounter] = inputArray2[array1Counter];
            mainCounter++;
        }
        
        return result;
    }

}
