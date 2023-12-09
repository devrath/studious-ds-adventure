package BinaryTrees;

public class TraversalsInBinarySearchTree {

    private Node root = null;


    /** ************************** TRAVERSALS ************************** **/
    public void preOrderTraversal() {
        Node current = root;
        recursivePreOrderTraversal(current);
    }

    public void inOrderTraversal() {
        Node current = root;
        recursiveInOrderTraversal(current);
    }

    public void postOrderTraversal() {
        Node current = root;
        recursivePostOrderTraversal(current);
    }

    /** ************************** TRAVERSALS ************************** **/

    private void recursivePreOrderTraversal(Node current) {
        // Print root node
        System.out.print("[");
        System.out.print(current.value);
        System.out.print("] ");

        // Check if there is left subTree ---> Traverse left
        if(current.left!=null){
            // Traverse to left of subtree
            recursivePreOrderTraversal(current.left);
        }

        if(current.right!=null){
            // Traverse to right of subtree
            recursivePreOrderTraversal(current.right);
        }

    }

    private void recursiveInOrderTraversal(Node current) {
        // Check if there is left subTree ---> Traverse left
        if(current.left!=null){
            // Traverse to left of subtree
            recursiveInOrderTraversal(current.left);
        }

        // Print root node
        System.out.print("[");
        System.out.print(current.value);
        System.out.print("] ");

        if(current.right!=null){
            // Traverse to right of subtree
            recursiveInOrderTraversal(current.right);
        }
    }

    private void recursivePostOrderTraversal(Node current) {
        // Check if there is left subTree ---> Traverse left
        if(current.left!=null){
            // Traverse to left of subtree
            recursivePostOrderTraversal(current.left);
        }

        if(current.right!=null){
            // Traverse to right of subtree
            recursivePostOrderTraversal(current.right);
        }

        // Print root node
        System.out.print("[");
        System.out.print(current.value);
        System.out.print("] ");
    }

    /** ************************ HELPER FUNCTIONS ********************** **/
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

    public Node printResult(){
        return root;
    }
    
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
    /** ************************ HELPER FUNCTIONS ********************** **/

}
