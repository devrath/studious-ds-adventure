package algorithms.mosh.sorting;

public class BubbleSortM {

    int[] dataSet ={ 8 , 2 , 4 , 1 , 3 };

    public void sort(){
        for( int i=0 ; i<dataSet.length ; i++ ){
            for(int j = 1 ; j<dataSet.length-i; j++){
                if(dataSet[j-1]>dataSet[j]){
                    swap(j-1,j);
                }
            }
        }
    }

    private void swap(int index1, int index2) {
        int temp = dataSet[index1];
        dataSet[index1] = dataSet[index2];
        dataSet[index2] = temp;
    }

    public int[] output() {
        return  dataSet;
    }

}
