package algorithms.mosh.sorting;

public class SelectionSortM {

    int[] dataSet ={ 8 , 2 , 4 , 1 , 3 };

    public void sort(){

        for(int i=0 ; i< dataSet.length ; i++) {

            int minPos = i;

            for(int j=i ; j< dataSet.length ; j++) {
                // Item at min-Index(possibly in beginning) is more
                // Then, Set the position of compare to minPos
                if(dataSet[j]<dataSet[minPos]){
                    minPos = j;
                }
            }
            swap(i,minPos);

        }
    }

    public int[] output() {
        return  dataSet;
    }

    private void swap(int index1, int index2) {
        int temp = dataSet[index1];
        dataSet[index1] = dataSet[index2];
        dataSet[index2] = temp;
    }

}
