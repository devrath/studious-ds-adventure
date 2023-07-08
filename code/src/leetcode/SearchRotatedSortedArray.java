package leetcode;

public class SearchRotatedSortedArray {

    /*public int search(int[] nums, int target) {

        if(nums.length==0){
            return -1;
        }else if(nums.length==1){
            return nums[0];
        }else{
            int leftPosition = 0;
            int rightPosition = nums.length-1;
            return recursiveBst(nums,target,leftPosition,rightPosition);
        }

    }

    private int recursiveBst(
            int[] nums, int target, int leftPosition, int rightPosition
    ) {

        if(leftPosition>rightPosition){
            return -1;
        }

        // Find the mid element
        int mid = (leftPosition+rightPosition)/2;

        if(nums[mid]==target){
            // Mid-item is the target
            return mid;
        }else if(nums[leftPosition]== target){
            // Left position is the target
            return leftPosition;
        }else if(nums[rightPosition]== target){
            // Right position is the target
            return rightPosition;
        }else{
            int leftArrPointerLeft = leftPosition;
            int leftArrPointerRight = mid-1;

            int rightArrPointerLeft = mid+1;
            int rightArrPointerRight = rightPosition;

         
            if(nums[leftArrPointerRight]>nums[leftArrPointerLeft]){
                // It is left sorted

                if()

            }else{
                // It is right sorted

            }

        }

        return -1;
    }*/

}
