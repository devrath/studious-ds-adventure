package arrays.programs.easy;

import java.util.Arrays;

public class MergeSortedArray {



    public MergeSortedArray(){
        int[]  nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;

        merge(nums1,m,nums2,n);

        System.out.println(Arrays.toString(Arrays.stream(nums1).toArray()));
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int resultEndPointer = nums1.length-1;
        int leftDataSetPointer = m-1;
        int rightDataSetPointer = n-1;

        // Since we need to put all elements from right array to left array --> We take the right pointer
        while(rightDataSetPointer>=0){
            // If data at left pointer is greater than right pointer
            // We mention left pointer condition because it can be -1 at a point
            if(leftDataSetPointer>=0 && nums1[leftDataSetPointer] > nums2[rightDataSetPointer]){
                // Copy the left pointer position to result pointer at left
                nums1[resultEndPointer]=nums1[leftDataSetPointer];
                leftDataSetPointer--;
                resultEndPointer--;
            }else{
                // Copy the right pointer position to result pointer at left
                nums1[resultEndPointer]=nums2[rightDataSetPointer];
                rightDataSetPointer--;
                resultEndPointer--;
            }
        }
    }

}
