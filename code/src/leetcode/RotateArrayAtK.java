package leetcode;

public class RotateArrayAtK {


    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverseElements(nums,0,nums.length-1);
        reverseElements(nums,0,k-1);
        reverseElements(nums,k,nums.length-1);
    }

    private void reverseElements(int[] nums, int left, int rght) {
        while(rght>left){
            int temp = nums[left];
            nums[left] = nums[rght];
            nums[rght] = temp;
            left++;
            rght--;
        }
    }


}
