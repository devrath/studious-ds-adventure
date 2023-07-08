package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int value){
            this.value=value;
        }
    }

    public boolean insert(int value){

        Node mNode = new Node(value);

        if(root==null){
            // There are no elements present
            root=mNode;
            return true;
        }else{
            // There can be more than one node
            Node temp = root;
            while(true){
                if(mNode.value == temp.value){
                    // Element is same
                    System.out.println("Matching element so no insertion is needed");
                    return false;
                }
                if(mNode.value < temp.value){
                    // Element is less than the value that we are inserting
                    // There are two possible options
                    if(temp.left==null){
                        // Option-1: There are no children's
                        temp.left = mNode;
                        return true;
                    }
                    // Option-2: There are children's
                    temp = temp.left;
                }else{
                    // Element is greater than the value that we are inserting
                    if(temp.right==null){
                        // Option-1: There are no children's
                        temp.right = mNode;
                        return true;
                    }
                    // Option-2: There are children's
                    temp = temp.right;
                }
            }
        }
    }

    public boolean contains(int value){
        Node temp = root;

        if(root==null){
            // No elements are present
            return false;
        }

        if(root.value==value){
            // Root element is the element to be searched
            return true;
        }

        boolean isItemFound = false;

        while(true){
            if(value<temp.value){
                // Traverse to left of the tree
                temp = temp.left;
                if(temp==null){
                    isItemFound=false;
                    break;
                }
                if(value==temp.value){
                    isItemFound=true;
                    break;
                }
            }else{
                // Traverse to right of the tree
                temp = temp.right;
                if(temp==null){
                    isItemFound=false;
                    break;
                }
                if(value==temp.value){
                    isItemFound=true;
                    break;
                }
            }
        }
        return isItemFound;
    }

    public ArrayList<Integer> BFS() {
        // Our root node
        Node currentNode = root;
        // Define a holder to hold the nodes in queue
        Queue<Node> queueNodes=new LinkedList<>();
        // Define a holder to hold the values in a list
        ArrayList<Integer> listNodes=new ArrayList<>();

        // Initial state
        queueNodes.add(currentNode);

        // Iterate the elements until there are no elements left in the queue
        while(queueNodes.size()>0){
            currentNode =  queueNodes.remove();
            // Add root element
            listNodes.add(currentNode.value);
            // Check and add if left element present
            if(currentNode.left!=null){
                queueNodes.add(currentNode.left);
            }
            // Check and add if right element present
            if(currentNode.right!=null){
                queueNodes.add(currentNode.right);
            }
        }

        return listNodes;
    }

    public ArrayList<Integer> preorderDFS() {
        ArrayList<Integer> resultArray = new ArrayList<>();
        return preorderRecursiveTraversal(resultArray,root);
    }

    public ArrayList<Integer> postorderDFS() {
        ArrayList<Integer> resultArray = new ArrayList<>();
        return postorderRecursiveTraversal(resultArray,root);
    }

    public ArrayList<Integer> inorderDFS() {
        ArrayList<Integer> resultArray = new ArrayList<>();
        return inorderRecursiveTraversal(resultArray,root);
    }

    /** *************** PRIVATE IMPLEMENTATIONS ********************* **/
    private ArrayList<Integer> inorderRecursiveTraversal(
            ArrayList<Integer> resultArray, Node node
    ) {

        if(node.left != null){
            inorderRecursiveTraversal(resultArray,node.left);
        }

        // Add the root value
        resultArray.add(node.value);

        if(node.right != null){
            inorderRecursiveTraversal(resultArray,node.right);
        }

        return resultArray;
    }
    private ArrayList<Integer> postorderRecursiveTraversal(
            ArrayList<Integer> resultArray, Node node
    ) {

        if(node.left != null){
            postorderRecursiveTraversal(resultArray,node.left);
        }

        if(node.right != null){
            postorderRecursiveTraversal(resultArray,node.right);
        }

        // Add the root value
        resultArray.add(node.value);

        return resultArray;
    }

    private ArrayList<Integer> preorderRecursiveTraversal(
            ArrayList<Integer> resultArray, Node node
    ) {

        // Add the root value
        resultArray.add(node.value);

        if(node.left != null){
            preorderRecursiveTraversal(resultArray,node.left);
        }

        if(node.right != null){
            preorderRecursiveTraversal(resultArray,node.right);
        }

        return resultArray;
    }
    /** *************** PRIVATE IMPLEMENTATIONS ********************* **/
}
