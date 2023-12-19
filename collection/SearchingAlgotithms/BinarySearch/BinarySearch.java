package searchingAlgorithms;

public class BinarySearch {

    int[] input = new int[]{1,2,3,4,8};
    int searchValue = 8;

    public BinarySearch() {
        recursiveSearch();
    }

    /**
     * USING-ITERATION
     */
    private void iterativeSearch() {

        int position = -1;

        // Left pointer position is 0
        int left = 0;
        // Right pointer position is (arraySize-1) because array starts from position-0
        int right = input.length-1;


        while(left<=right){
            // Here tileset there is a partition to be searched

            int mid = (left+right)/2;

            // Element is found in the middle
            if(input[mid]==searchValue){
                position = mid;
                break;
            }

            if(searchValue<input[mid]){
                // search to left part of the array
                right = mid-1;
            }else{
                // search to right part of the array
                left = mid+1;
            }
        }

        if (position == -1) {
            System.out.println("Element not found during searching");
        } else {
            System.out.println("Element found at position:->" + position);
        }

    }

    /**
     * USING-RECURSION
     */
    private void recursiveSearch() {
        int left = 0;
        int right = input.length-1;
        int position = -1;
        // Apply recursion
        int result = search(left,right,position);

        if(result==-1){
            System.out.println("Item not found");
        }else{
            System.out.println("Item found at position:-> "+result);
        }
    }

    private int search(int left, int right, int position) {

        // Breaking condition
        if(left>right){
            return position;
        }

        int mid = (left + right)/2;

        if(searchValue == input[mid]){
            // Item is found at the middle of the partition
            return mid;
        }

        if(searchValue <= input[mid]){
            // Search to left partition
            return search(left,mid-1,position);
        }else{
            // Search to right partition
            return search(mid+1,right,position);
        }
    }


}
