package trees;

public class AvlTrees {

    private Node root;


    /** ****************** PUBLIC METHODS ****************** **/
    public void insert(int value){
        root = insertion(root,value);
    }

    public Node displayRoot(){ return root; }
    /** ****************** PUBLIC METHODS ****************** **/

    /**
     * Insertion of new node to AVL tree
     * @param node
     * @param value
     * Logic:
     * <*> It will start from top, reach to bottom via recursion and break the callstack
     * <*> Now insertion will happen from bottom till top one by one until all the elements in call stack are popped
     */
    private Node insertion(Node node, int value) {
        // On first call, The node will always be null -> Thus create a new node
        // This is also a breaking condition
        if(node==null){
            return createNode(value);
        }

        // We shall go to either left or right child and Append a new node
        if(value < node.value){
            // Go left
            node.leftSubTree = insertion(node.leftSubTree,value);
        }else{
            // Go right
            node.rightSubTree = insertion(node.rightSubTree,value);
        }

        // Set the height of each node
        //int heightOfNode = Math.max(height(root.leftSubTree), height(root.rightSubTree));
        node.height = Math.max(
                height(root.leftSubTree),
                height(root.rightSubTree)) + 1;

        // Finally, return root object
        return node;
    }

    /**
     * Calculating the height of the node
     * @param node
     * @return
     */
    private int height(Node node){
        if(node==null){
            // Height of empty tree is => -1
            return -1;
        }else{
            return node.height;
        }
    }

    /**
     * Creating a new Node
     * @param value
     * @return Node
     */
    private Node createNode(int value){ return new Node(value); }


    /**
     * Node Inner class
     */
    private class Node {
        private int value;
        private Node leftSubTree;
        private Node rightSubTree;
        int height;

        public Node(int value) {
            this.value = value;
        }
    }

}
