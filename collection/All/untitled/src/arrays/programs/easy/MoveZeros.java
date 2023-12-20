package arrays.programs.easy;

import java.util.Arrays;

public class MoveZeros {

    int[] input = new int[]{0,1,0,3,12};

    public MoveZeros(){

        // <---- We shall use two pointers ---->
        // Tracking pointer:-> To navigate the entire array in one traversal
        int trackingPointer = 0 ;
        // Counter pointer:-> To keep track of hte position till which contains elements with no zeros
        int counterPointer = 0;

        // Traverse the entire array and copy the elements one one one to the left on counter pointer
        while (trackingPointer<input.length){

            if(input[trackingPointer]!=0){
                input[counterPointer] = input[trackingPointer];
                counterPointer++;
            }
            trackingPointer++;
        }

        // Now at this position all the elements are moved to left maintaining the relative ordering

        // Fill the remaining positions with zero since we had track of the counter pointer
        while (counterPointer<input.length){
            input[counterPointer] = 0;
            counterPointer++;
        }

        System.out.println(Arrays.toString(Arrays.stream(input).toArray()));
    }

}
