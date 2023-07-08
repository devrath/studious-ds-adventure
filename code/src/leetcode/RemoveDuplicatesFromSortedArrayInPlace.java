package leetcode;

public class RemoveDuplicatesFromSortedArrayInPlace {


    public int initiate(int[] nums) {

        if(nums.length==0){
            return 0;
        }else{
            int tempArrPt = 0;
            for(int i=1 ; i<nums.length ; i++){
                if(nums[i]!=nums[tempArrPt]){
                    tempArrPt++;
                    nums[tempArrPt] = nums[i];
                }
            }
            return tempArrPt;
        }
    }

    /*public int initiate(int[] nums) {

        // Create a new temp array
        int[] tempArr = new int[nums.length];
        int ipArrPt = 0;
        int tempArrPt = 0;

        if(nums.length==0){
            return 0;
        }else{
            // Copy the first element of ``INPUT`` array to temp array
            tempArr[tempArrPt] = nums[ipArrPt];

            for(int i=ipArrPt ; i<nums.length-1 ; i++){
                // Move the pointer that that is tracking the ``INPUT`` array
                ipArrPt++;
                // Now check if the element at ``INPUT`` array is same as existing element in temp array
                if(nums[ipArrPt]!=tempArr[tempArrPt]){
                    // Move the position to the place to be inserted(next place)
                    // Currently there is no element here
                    tempArrPt++;
                    tempArr[tempArrPt] = nums[ipArrPt];
                }
            }


        }

        nums = tempArr;

        return tempArrPt;
    }*/


}
