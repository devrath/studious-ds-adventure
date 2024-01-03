package arrays.programs.medium;

public class SearchInRotatedSortedArray {

    int[] input = new int[]{4,5,6,7,0,1,2};
    int target = 0;

    /**
     *  Step:1 --> *  If that is an empty array, Then return -1
     *  Step:2 --> *  If there is only one element check if target is found else return -1
     *  Step:2 --> *  If the item is at the first or last position of the array return the position
     *
     *
     *
     */
    public SearchInRotatedSortedArray(){

        if(input.length == 0){
            // If the array is empty
            System.out.println("Position:-> "+ -1);
        }else{
            // Array is not empty
            // Possibility that element can be present in the array we are searching for
            if(input.length==1){
                // Only one element is present in the array
                if(target==input[0]){
                    System.out.println("Position:-> "+ 0);
                }
            }else{
                // More than one element is present in the array
                if(target==input[0]){
                    // Item is found at first position
                    System.out.println("Position:-> "+ 0);
                }else if(target==input[input.length-1]){
                    // Item is found at last position
                    System.out.println("Position:-> "+ (input.length-1));
                }else{
                    // It can be anywhere in between first and last element of the array

                    int leftPosition = 0;
                    int rightPosition = input.length-1;

                    int resultPosition = recursiveSearch(input,leftPosition,rightPosition);
                }
            }
        }

    }

    private int recursiveSearch(
            int[] input, int leftPosition, int rightPosition
    ) {

        // Breaking Condition
        if(leftPosition>rightPosition){
            return -1;
        }

        // Find the mid-element
        int midPosition = leftPosition + ((rightPosition - leftPosition)/2);

        // If the element is at the mid-position return that position
        if(target == input[midPosition]){
            return midPosition;
        }


        // Find out which array is sorted and which is not sorted
        // Next check if the element is present in between first and last element of the sorted array
        // if so ... Apply binary search for the sorted array and return it
        // else so ... then perform the modified recursive search as above again

        if(input[midPosition]>input[leftPosition]){
            // Left part is sorted
            if(target>input[leftPosition] && target>input[midPosition]){
                // Element is not presented in the sorted array ---> Search in unsorted part
                return recursiveSearch(input,midPosition+1,rightPosition);
            }else{
                return recursiveSearch(input,leftPosition,midPosition-1);
            }
        }else{
            // Right part is sorted
            if(target>input[midPosition] && target>input[rightPosition]){
                return recursiveSearch(input,leftPosition,midPosition-1);
            }else{
                return recursiveSearch(input,midPosition+1,rightPosition);
            }
        }
    }


}
