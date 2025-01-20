public class BinarySearch {

    int[] arrayToSearch;
    int numberToSearch;

    public BinarySearch(int[] arrayToSearch, int numToSearch) {
        this.arrayToSearch = arrayToSearch;
        this.numberToSearch = numToSearch;
    }

    public void search() {

        if(arrayToSearch==null){
            System.out.println("Input array is invalid to perform the search operation");
        }else{
            if(getSize(arrayToSearch)==0){
                System.out.println("No elements present to perform search operation");
            }

            int start = 0;
            int end = arrayToSearch.length-1;
            int position = -1;

            int result = findMiddleIndex(start,end,position);

            if(result==-1){
                System.out.println("No elements present to perform search operation");
            }else{
                System.out.println("Element "+arrayToSearch[result]+" found at position "+result);
            }
        }
    }

    private int findMiddleIndex(int start, int end, int position) {

        if(start>end){
            return position;
        }

        int mid = (start+end)/2;

        if(arrayToSearch[mid]==numberToSearch){
            // Element found at the mid-position
            return mid;
        }

        // Now check if the element to be searched is at left /right part of the array
        if(numberToSearch<=arrayToSearch[mid]){
            // Element could be at left part of the array
            return findMiddleIndex(start, mid-1, position);
        }else{
            // Element could be at right part of the array
            return findMiddleIndex(mid+1, end, position);
        }
    }

    private int getSize(int[] data) {
        return data.length;
    }
}
