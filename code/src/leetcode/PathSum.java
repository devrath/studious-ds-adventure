package leetcode;


import java.util.Stack;

public class PathSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null){
            return false;
        }

        Stack<TreeNode> dataSet = new Stack<>();
        Stack<Integer> sumSet = new Stack<>();
        // Add the root node to the queue
        dataSet.push(root);
        sumSet.push(root.val);

        while(!dataSet.isEmpty()){

            TreeNode pNode = dataSet.pop();
            int pValue = sumSet.pop();

            if(pNode.left==null && pNode.right==null && pValue==targetSum){
                return true;
            }

            // Check if this has children
            if(pNode.left!=null){
                // Add the node to the queue
                dataSet.add(pNode.left);
                sumSet.add(pNode.left.val+pValue);
            }

            if(pNode.right!=null){
                // Add the node to the queue
                dataSet.add(pNode.right);
                sumSet.add(pNode.right.val+pValue);
            }


        }


        return false;
    }


}
