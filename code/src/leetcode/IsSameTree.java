package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class IsSameTree {

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



    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> ourSet = new LinkedList<>();
        ourSet.add(p);
        ourSet.add(q);


        while (!ourSet.isEmpty()) {

            TreeNode first = ourSet.poll();
            TreeNode second = ourSet.poll();

            if(first==null && second==null){
                continue;
            }else if(
                    first ==  null ||
                    second == null ||
                    first.val != second.val
            ){
                return false;
            }

            ourSet.add(first.left);
            ourSet.add(second.left);
            ourSet.add(first.right);
            ourSet.add(second.right);

        }

        return true;
    }





}
