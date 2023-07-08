package leetcode;

public class MinDepthOfBinaryTree {

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


    public int minDepth(TreeNode root) {

      if(root==null){
          return 0;
      }

       return Math.max(
               minDepth(root.left),minDepth(root.right)
        ) + 1;
    }


}
