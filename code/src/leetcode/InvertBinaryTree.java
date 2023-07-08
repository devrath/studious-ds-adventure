package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode invertTreeIteratively(TreeNode root) {

        if(root==null){
            return null;
        }

        Queue<TreeNode> ourSet = new LinkedList<>();
        ourSet.add(root);

        while (!ourSet.isEmpty()){

            TreeNode pNode = ourSet.poll();

            TreeNode temp = pNode.left;
            pNode.left = pNode.right;
            pNode.right = temp;

            if(pNode.left!=null) {
                ourSet.add(pNode.left);
            }

            if(pNode.right!=null) {
                ourSet.add(pNode.right);
            }
        }

        return root;
    }


    public TreeNode invertTree(TreeNode root) {
        return recursiveInvertTree(root);
    }

    private TreeNode recursiveInvertTree(
            TreeNode root
    ) {
        // Base condition
        if(root==null){
            return null;
        }

        TreeNode left = recursiveInvertTree(root.left);
        TreeNode right = recursiveInvertTree(root.right);

        root.right = left;
        root.left  = right;

        return root;
    }


}
