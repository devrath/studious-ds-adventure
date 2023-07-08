package algorithms.mosh.sorting;

public class InsertionSortM {

    int[] dataSet = { 8 , 2 , 3 , 4 , 1 };

    public void sort(){

        int arraySize = dataSet.length;

        for (int i=1; i<arraySize ; i++){

            // More logic to check the comparisons
            int temp = dataSet[i];
            int j = i-1;

            while(j>-1 && dataSet[j]>temp
            ){
                // Copy from (currentPos-1) to currentPos
                dataSet[j+1] = dataSet[j];
                dataSet[j] = temp;
                j--;
            }

        }


    }

    public int[] output() {
        return  dataSet;
    }

}
