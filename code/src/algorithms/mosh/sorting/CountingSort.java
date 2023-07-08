package algorithms.mosh.sorting;

public class CountingSort {


    public void sort(int[] array, int max){

        int[] countArr = new int[max];

        for(int i=0 ; i<array.length ; i++){
            int valueFromDataArray = array[i];
            int getCounterAtCountArray = countArr[valueFromDataArray-1];
            int newCounterAtCountArray = getCounterAtCountArray + 1;
            countArr[valueFromDataArray-1] = newCounterAtCountArray;
        }


        int trackingCnt = 0;
        for(int i=0 ; i<countArr.length ; i++){

            int currentIndex = i;
            int currentValue = countArr[currentIndex];

            if(currentValue!=0){
                for(int j=0 ; j<currentValue; j++){
                    int valueToCopy = currentIndex;
                    array[trackingCnt] = valueToCopy+1;
                    trackingCnt++;
                }
            }
        }

    }

}
