package BinaryTrees;

public class NodesAtKDistance {

    private Node root = null;

    public void printNodes(int level){
        Node current = root;
        recursivelyPrint(current,level);
    }

    private void recursivelyPrint(Node current, int level) {

        if(current==null){
            // If we are dealing with empty tree
            return;
        }

        if(level==0){
            // We reached the required level
            System.out.print(current.value);
            return;
        }
        recursivelyPrint(current.left,level--);
        recursivelyPrint(current.right,level--);
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
