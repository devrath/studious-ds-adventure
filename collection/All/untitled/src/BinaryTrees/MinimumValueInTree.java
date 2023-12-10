package BinaryTrees;

public class MinimumValueInTree {

    private Node root = null;

    public void calculateMinimumValue() {
        Node current = root;
        int result = min(current);
        System.out.println("Result:->: "+result);
    }

    private int min(Node root) {

        if(root==null){
            return 0;
        }

        // Root Node
        int res = root.value;
        // Left Node
        int leftNode = min(root.left);
        // Right Node
        int rightNode = min(root.right);


        /**
         * LOGIC: Assume root value is the largest value
         *  (1) Compare root with left --> If left is larger value then store left in root
         *  (2) Compare root with right --> If right is larger value then store right in root
         */

        if (leftNode > res){
            res = leftNode;
        }

        if (rightNode > res){
            res = rightNode;
        }

        return res;
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
