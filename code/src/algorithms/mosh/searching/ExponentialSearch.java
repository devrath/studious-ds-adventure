package algorithms.mosh.searching;

public class ExponentialSearch {

    int[] dataset = {3,5,6,9,11,18,20,21,24,30};
    int itemToSearch = 31;

    public boolean initiate(){

        if(itemToSearch>dataset[dataset.length-1]){
            return false;
        }

        int bound = 1;

        while(bound<dataset.length && dataset[bound]<itemToSearch){
            // Until the item we search is less than last item in the bound
            // We shall double the bound
            bound = bound*2;
        }

        int range1 = bound/2;
        int range2 = bound;

        return searchItem(dataset,itemToSearch,range1,range2);
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
