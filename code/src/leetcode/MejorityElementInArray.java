package leetcode;

public class MejorityElementInArray {

    public int initiate(int[] nums) {

       int candidate=0;
       int score=0;

       for(int i=0 ; i< nums.length ; i++){
           if(score==0){
               // Assign new candidate
               candidate = nums[i];
               score++;
           }else{
               // check if earlier candidate is different from existing candidate
               if(nums[i]!=candidate){
                   score--;
               }else if(nums[i]==candidate){
                   score++;
               }
           }
       }

       return candidate;

    }

}
