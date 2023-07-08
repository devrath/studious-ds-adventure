package algorithms.mosh.searching;

public class BinarySearchR {

    int[] dataset = {3,5,6,9,11,18,20,21,24,30};

    public boolean initiate(){
        int itemToSearch =5;
        boolean isItemFound = false;
        int left = 0;
        int right = dataset.length-1;
        return searchItem(dataset,itemToSearch,left,right);
    }

    private boolean searchItem(
            int[] dataset, int itemToSearch, int left, int right
    ) {

        if(right<left){
            // BASE - CONDITION
            // If the right value is less than left value, there are no elements in dataset
            return false;
        }


        // Calculate mid item
        int mid = (left + right)/2;
        int midValue = dataset[mid];

        if(midValue==itemToSearch){
            return true;
        }

        if(itemToSearch<midValue){
            // Search the left part of array
            return searchItem(dataset,itemToSearch,left,mid-1);
        }else if (itemToSearch>midValue){
            // Search the right part of the array
            return searchItem(dataset,itemToSearch,mid+1,right);
        }

        return false;
    }


}
