package leetcode;

public class FlattenBinaryTree {


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

    public void flatten(TreeNode root) {

        if (root == null) return;

        while (root != null) {
            if (root.left != null) {
                // Go to the left of the root
                TreeNode tempLeft = root.left;
                // Go to the right most end of the left of root
                TreeNode current = tempLeft;
                while (current.right != null) {
                    current = current.right;
                }
                // Point the current to right of root
                current.right = root.right;
                // Set left of root to null
                root.left = null;
                // Point left into a right
                root.right = tempLeft;
            }
            // Move to the next node of the root
            root = root.right;
        }


    }

}
