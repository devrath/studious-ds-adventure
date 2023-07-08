package leetcode;

public class SingleNonRepeatingNum {


    public int initiate(int[] nums) {

        int result = nums[0];

        for (int i = 1 ; i<nums.length ; i++) {
            result = result ^ nums[i];
        }

        return result;
    }

    /*public int initiate(int[] nums) {

        HashSet<Integer> dataSet = new HashSet<>();

        for (int num : nums) {
            if(dataSet.isEmpty()){
                // Just add it
                dataSet.add(num);
            }else{
                if(!dataSet.contains(num)){
                    dataSet.add(num);
                }else{
                    dataSet.remove(num);
                }
            }
        }

        return dataSet.iterator().next();
    }*/

}
