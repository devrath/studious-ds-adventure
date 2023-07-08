package algorithms.mosh.searching;

public class TernarySearch {

    int[] dataset = {1,3,5,6,7};
    int itemToSearch = -1;

    public boolean initiate() {

        int left = 0;
        int right = dataset.length-1;

        return search(dataset,itemToSearch,left,right);
    }

    private boolean search(
            int[] dataset, int itemToSearch, int left, int right
    ) {

        if(left>right){
            return false;
        }

        if(itemToSearch == dataset[left] || itemToSearch == dataset[right]){
            return true;
        }

        // Calculate the two mid-points, So that we can divide the array into three parts.
        int partitionSize = (right - left)/3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        // If the item is one of the 2 mid-points
        if(itemToSearch == dataset[mid1] || itemToSearch == dataset[mid2]){
            return true;
        }

        // If the control reaches here, It's possible that item is one of three sub-arrays
        if(itemToSearch<dataset[mid1]){
            // Search in first part
            search(dataset,itemToSearch,left,mid1-1);
        }

        if(itemToSearch>dataset[mid2]){
            // Search in third part
            search(dataset,itemToSearch,mid2+1, right);
        }

        return search(dataset,itemToSearch,mid1+1,mid2-1);
    }


}
