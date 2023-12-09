package BinaryTrees;


import java.util.ArrayList;
import java.util.List;

/**
 * SUPPORTED OPERATIONS:
 * ---------------------
 * <1> INSERTION    :-> Inserting a new value into the binary tree </1>
 * <2> FIND-VALUE   :-> Finding if a value is present in the binary tree(Iteration) </2>
 * <3> MAX-VALUE    :-> Finding the maximum value of the binary tree </3>
 * <4> TREE-SIZE    :-> Finding the size of the binary tree </4>
 * <5> COUNT-LEAVES :-> Counting the number of leaves in tree </5>
 * <6> Ancestor     :-> Implement a method to return the ancestor of a given value</6>
 * <7> Ancestors    :-> Implement a method to return all the ancestors of a value in a List<Integer></7>
 */

public class CustomTree {

    private Node root = null;


     /**
     * ************************************* TREE-OPERATIONS *************************************
     **/

    /**
     * Inserting a Node
     */
    public void insert(int value) {

        Node current = root;

        if(current==null){
            // There are no elements inserted, so we perform the first insertion operation
            root = createNode(value);
        }else{
            Node nodeToInsert = createNode(value);
            // Iterate to the leaf node from the root where we need to perform insertion
            while (current!=null){
                // Either we insert to left of root or we insert to right of root
                if(value < current.value){
                    if(current.right==null){
                        current.left = nodeToInsert;
                        break;
                    }else{
                        current = current.left;
                    }
                }else{
                    if(current.right==null){
                        current.right = nodeToInsert;
                        break;
                    }else{
                        current = current.right;
                    }
                }
            }
        }

    }

    /**
     * Finding a node based on the value
     */
    public boolean find(int value){
        Node current = root;
        boolean isValueFound = false;

        while(current!=null){
            if(value==current.value){
                isValueFound = true;
                break;
            }else{
                if(value<current.value){
                    // Traverse to left sub-tree since value might be on left
                    current = current.left;
                }else{
                    // Traverse to right of sub-tree since value might be on right
                    current = current.right;
                }
            }
        }
        return isValueFound;
    }

    /**
     * Finding the maximum value in the binary tree
     */
    public void findMaxValue(){
        Node current = root;

        if(current==null){
            // Empty tree
            System.out.println("No elements are present");
        }else{
            int maxElement = 0;
            // Elements are present in the tree, So there is possibility of element existing.
            if(current.right==null){
                // There is just one element, So that element itself will the max element
                maxElement = current.value;
            }else{
                while(current!=null){
                    maxElement = current.value;
                    current=current.right;
                }
            }
            System.out.println("Maximum element is:-> "+maxElement);
        }
    }

    /**
     * Finding the number of elements in tree
     */
    public void findTreeSize(){
        Node current = root;
        int treeSize = 0;
        if(current!=null){
            // At-lest one element is present
            if((current.left==null) && (current.right==null)){
                // Only one element is present
                treeSize = 1;
            }else{
                // More than one element can be present
                // Explanation:-> We increment (+1) here at end because root node is not taken in recursive function, So we explicitly add it
                treeSize = recursiveFindSize(current,treeSize)+1;
            }
        }
        System.out.println("Tree Size: ->"+treeSize);
    }

    /**
     * Finding the number of leaves in the tree
     */
    public void countLeaves(){
        Node current = root;
        int noOfLeaves = 0;
        if(current!=null){
            if((current.left==null) && (current.right==null)){
                // Just one element is present, It itself is the leaf node
                noOfLeaves=1;
            }else{
                // More than one element is present, So there is a possibility of more than one leaf nodes
                noOfLeaves = recursiveFindLeavesSize(current,noOfLeaves);
            }
        }
        System.out.println("Number of leaves in tree: ->"+noOfLeaves);
    }


    /**
     * Implement a method to return the ancestor of a given value
     */
    public void ancestorOfValue(int ipValue){
        // LOGIC:-> Keep a reference to parent node while traversing the tree until you find the element

        boolean isValueFound = false;

        Node current = root;
        Node parentNode = root;
        while (current!=null){

            if(ipValue<current.value){
                // Traverse to left subtree
                parentNode = current;
                current = current.left;
            }else if(ipValue>current.value){
                // Traverse to right subtree
                parentNode = current;
                current = current.right;
            }else {
                // We found the element while traversing
                if(ipValue==current.value){
                    isValueFound = true;
                    break;
                }
            }

        }

        if(isValueFound){
            System.out.println(parentNode);
        }else{
            System.out.println("Element not present in the tree");
        }


    }


    /**
     * Implement a method to return all the ancestors of a given value
     */
    public void allAncestorsOfValue(int ipValue){
        // LOGIC:-> Keep a reference to parent node while traversing the tree until you find the element

        boolean isValueFound = false;
        List<Integer> ancestors = new ArrayList<>();

        Node current = root;
        Node parentNode = root;
        while (current!=null){

            if(ipValue<current.value){
                // Traverse to left subtree
                parentNode = current;
                ancestors.add(current.value);
                current = current.left;
            }else if(ipValue>current.value){
                // Traverse to right subtree
                parentNode = current;
                ancestors.add(current.value);
                current = current.right;
            }else {
                // We found the element while traversing
                if(ipValue==current.value){
                    isValueFound = true;
                    break;
                }
            }

        }

        if(isValueFound){
            System.out.println(ancestors);
        }else{
            System.out.println("Element not present in the tree");
        }


    }

    /**
     * ************************************* TREE-OPERATIONS *************************************
     **/


    private int recursiveFindLeavesSize(Node current, int noOfLeaves) {
        // Check if it is a leaf node (Both left and right subtree must be null)
        if((current.left==null) && (current.right==null)){
            // This is leaf node
            noOfLeaves++;
        }else{
            if(current.left!=null){
                noOfLeaves = recursiveFindSize(current.left,noOfLeaves);
            }
            if(current.right!=null){
                noOfLeaves = recursiveFindSize(current.right,noOfLeaves);
            }
        }
        return noOfLeaves;
    }

    private int recursiveFindSize(Node current, int treeSize) {
        if(current.left!=null){
            treeSize = recursiveFindSize(current.left,++treeSize);
        }
        if(current.right!=null){
            treeSize = recursiveFindSize(current.right,++treeSize);
        }
        return treeSize;
    }


    public Node printResult(){
        return root;
    }

    /**
     * Iterate to leaf node
     **/
    private Node iterateToLeafNode(int value, Node current) {
        // Iterate until we reach the leaf node
        return current;
    }

    /**
     * Creating a new Node
     */
    private Node createNode(int value) {
        return new Node(value);
    }

    private class Node {
        Node left;
        Node right;
        int value;
        public  Node(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

}
