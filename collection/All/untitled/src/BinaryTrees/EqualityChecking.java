package BinaryTrees;

public class EqualityChecking {

    private Node root = null;


    public void isEqual(EqualityChecking tree1,EqualityChecking tree2){

        Node root1 = tree1.root;
        Node root2 = tree2.root;

        boolean result = recursivelyCheckEquality(root1,root2);
        System.out.println("Result-> "+result);
    }

    private boolean recursivelyCheckEquality(Node root1, Node root2) {
        // If the root nodes are themselves null
        if((root1==null) && (root2==null)){
            return true;
        }

        // PRE-ORDER-TRAVERSAL: Root -> LEFT -> RIGHT
        return  (root1.value==root2.value) &&
                (recursivelyCheckEquality(root1.left,root2.left)) &&
                (recursivelyCheckEquality(root1.right,root2.right));
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