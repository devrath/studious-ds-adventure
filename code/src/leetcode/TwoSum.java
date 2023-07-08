package leetcode;

import java.util.HashMap;

public class TwoSum {

    public int[] nums;
    public TwoSum(int[] nums) {
        this.nums = nums;
    }

    /**
     * Time Complexity = O(n2)
     *
     * @param target
     * @return
     */
    public int[] initSolTypeOne(int target){

        boolean isMatchFound = false;
        int[] resultArray = new int[2];

        for (int i = 0; i< nums.length ; i++) {
            int firstNum = nums[i];
            for (int j = i+1; j< nums.length ; j++){
                int secondNum = nums[j];
                int result = firstNum + secondNum;
                if(result==target){
                    isMatchFound = true;
                    resultArray = new int[]{i, j};
                    break;
                }
            }
        }

        if(isMatchFound){
            // Print the array
            return resultArray;
        }else{
            return new int[]{0,0};
        }
    }

    /**
     * Time Complexity = O(n)
     *
     * @param target
     * @return
     */
    public int[] initSolTypeTwo(int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i< nums.length ; i++) {
            map.put(nums[i],i);
        }

        for (int j = 0; j< nums.length ; j++){
            int currentValue = nums[j];
            int difference = target - currentValue;
            if(map.containsKey(difference)){
                // Match is found - value exists in hashmap
                int index = map.get(difference);
                int resultRight = nums[index];
                if(j != index){
                    // Handle duplicates scenario
                    return new int[]{j,index};
                }
            }
        }
        return new int[]{0,0};

    }

}
