package leetcode;


public class SymmetricBinaryTree {


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


    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode rootOne, TreeNode rootTwo) {

      if(rootOne == null && rootTwo == null){
          // SCENARIO: This appears after the leaf node
          return true;
      }else if(rootOne == null || rootTwo == null){
          // SCENARIO: This appears where one root has value and the other doesn't
          return false;
      }

      if(
              // Both the values of root are equal
              (rootOne.val == rootTwo.val) &&
              // If left-leaf of rootOne and right-leaf of rootTwo are equal
              isMirror(rootOne.left,rootTwo.right) &&
              // If right-leaf of rootOne and left-leaf of rootTwo are equal
              isMirror(rootOne.right,rootTwo.left)
      ){
            return true;
      }else{
            return false;
      }
  }


}
