package algorithms.mosh.sorting;

public class MergeSortM {


    public MergeSortM(){
        int[] dataSet = new int[]{8, 2, 3, 4, 1};
        sort(dataSet);
        System.out.println("Done");
    }

    public void sort(int[] dataSet){

        int mid = midIndex(dataSet);
        boolean oneElePresent = isArrayContainsOneElement(dataSet);

        if(oneElePresent) return;

        // We need to divide the array

        int[] leftArray = new int[mid];
        int[] rightArray = new int[dataSet.length-mid];

        int leftEnd = mid;
        int rightEnd = (dataSet.length)-mid;

        for(int i=0; i<leftEnd ; i++){
            leftArray[i] = dataSet[i];
        }

        for(int i=0; i<rightEnd ; i++){
            int addingPos = mid+i;
            rightArray[i] = dataSet[addingPos];
        }

        sort(leftArray);
        sort(rightArray);

        merge(leftArray,rightArray,dataSet);

    }

    private void merge(
            int[] leftArray, int[] rightArray, int[] dataSet
    ) {
        int i=0 , j=0 , k=0;

        while (i < leftArray.length && j < rightArray.length) {
            if(leftArray[i] <= rightArray[j]){
                dataSet[k] = leftArray[i];
                k++;
                i++;
            }else{
                dataSet[k] = rightArray[j];
                k++;
                j++;
            }
        }

        // Now it's possible that above one of the arrays have different length so items might be left after above comparisons
        while (i< leftArray.length){
            dataSet[k] = leftArray[i];
            k++;
            i++;
        }

        while (j< rightArray.length){
            dataSet[k] = rightArray[j];
            k++;
            j++;
        }

    }

    private boolean isArrayContainsOneElement(int[] dataSet) {
        if(dataSet.length==1){
            return true;
        }else{
            return false;
        }
    }

    private int midIndex(int[] dataSet) {
        return dataSet.length / 2;
    }


    /*public int[] output() {
        return  dataSet;
    }*/

}
