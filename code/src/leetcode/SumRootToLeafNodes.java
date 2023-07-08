package leetcode;

public class SumRootToLeafNodes {


     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    int total;

    public int sumNumbers(TreeNode root) {

        total = 0;
        recursiveCalFunction(root,0);
        return total;
        //int sum = calculateSum(prevNum,currNum);

    }

    private void recursiveCalFunction(TreeNode root, int sum) {

        if(root==null) { return; }

        // Calculate the sum
        sum = calculateSum(sum,root.val);

        if(root.left==null && root.right==null){
            // Leaf node -> So recalculate the sum
            total = total + sum;
            return;
        }

        recursiveCalFunction(root.left,sum);
        recursiveCalFunction(root.right,sum);

    }


    private int calculateSum(int prevNum, int currNum) {
        return ((prevNum * 10) + currNum);
    }


}
