package algorithms.mosh.searching;

public class BinarySearchI {

    int[] dataset = {3,5,6,9,11,18,20,21,24,30};
    int itemToSearch =25;

    public boolean initiate() {

        int left = 0;
        int right = dataset.length-1;
        boolean isElementFound = false;

        while(right>=left){

            // Calculate the middle element
            int mid = (left + right)/2;
            if(dataset[mid]==itemToSearch){
                isElementFound = true;
                break;
            }

            // Check in which part of the array the element we are searching for is present.
            if(itemToSearch < dataset[mid]){
                // Item is in left part of array
                right = mid-1;
            }else{
                // Item is in right part of array
                left = mid+1;
            }

        }

        return isElementFound;
    }


}
