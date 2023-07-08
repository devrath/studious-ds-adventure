package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversalOfBst {

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

    private TreeNode dataSet() {

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(6);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node6.left = node7;

        return node1;
    }


    public void performLevelOrderTraversal() {

        Queue<TreeNode> ourSet = new ArrayDeque<>();
        ourSet.add(dataSet());

        while (!ourSet.isEmpty()){

            TreeNode processingNode = ourSet.poll();
            System.out.println(processingNode.val);

            if(processingNode.left!=null){
                // Add left node into the queue
                ourSet.add(processingNode.left);
            }

            if(processingNode.right!=null){
                // Add left node into the queue
                ourSet.add(processingNode.right);
            }

        }


    }

}
