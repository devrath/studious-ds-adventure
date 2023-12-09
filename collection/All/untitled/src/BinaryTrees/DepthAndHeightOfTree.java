package BinaryTrees;

public class DepthAndHeightOfTree {

    private Node root = null;

    int value;

    public DepthAndHeightOfTree(int value){
        this.value = value;
    }




    /**
     * Determining the height of the tree
     */
    public void calculateHeight(){

        // Navigate to the value which we want to calculate the height
        Node current = root;
        while (current!=null){
            if(current.value==value){
                break;
            }
            if (value<current.value){
                current=current.left;
            } else {
                current=current.right;
            }
        }

        // Calculate the height
        int result = recursivelyCalculateHeight(current);
        System.out.println("Result:-> "+result);
    }

    /**
     * Determining the depth of the tree
     */
    public void calculateDepth(){
        int height=0;
        Node current = root;
        int result = recursivelyCalculateDepth(current,height);
        System.out.println("Result:-> "+result);
    }


    private int recursivelyCalculateDepth(Node current, int height) {

        if(current==null){
            return height;
        }

        if(value==current.value){
            // Breaking condition
            height = height+1;
            return height;
        }

        if(value<current.value){
            // Traverse the left subtree
            height = height+1;
            height = recursivelyCalculateDepth(current.left,height);
        }

        if(value>current.value){
            // Traverse the right subtree
            height = height+1;
            height = recursivelyCalculateDepth(current.right,height);
        }

        return height;
    }


    private int recursivelyCalculateHeight(Node current) {

       if(current==null){
           // Breaking condition:-> When we reach leaf node return zero
           return 0;
       }

        return 1+Math.max(
                recursivelyCalculateHeight(current.left),
                recursivelyCalculateHeight(current.right));
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
