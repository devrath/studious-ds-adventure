package recursion;

public class BST {



    public Node rNode;

    class Node {
        int value;
        Node lNode;
        Node rNode;
    }

    public BST(int value){
        rNode = new Node();
        rNode.value = value;
        rNode.lNode = rNode.rNode = null;
    }

    public void rInsert(int value){
        insert(rNode,value);
    }

    public boolean rContains(int value){
        return contains(rNode,value);
    }

    public boolean delete(int value){
        return delete(rNode,value);
    }

    /** ******************* PRIVATE IMPLEMENTATIONS ******************* **/

    /**
     * Checking if the value is present in the BST
     * @param currNode
     * @param value
     * @return If the value is present/not-present in the tree
     */
    private boolean contains(Node currNode, int value){

        if((currNode.lNode==null) && (currNode.rNode==null)){
            if(currNode.value==value){
                return true;
            }
            return false;
        }

        if(value<currNode.value){
            // Left subtree
            if(currNode.lNode!=null){
                if(currNode.lNode.value==value){
                    return true;
                }else{
                    return contains(currNode.lNode,value);
                }
            }else{
                return false;
            }
        }else{
            // Right subtree
            if(currNode.rNode!=null){
                if(currNode.rNode.value==value){
                    return true;
                }else{
                    return contains(currNode.rNode,value);
                }
            }else{
                return false;
            }
        }
    }

    /**
     * Inserting a value in the BST
     * @param currNode
     * @param value
     * @return If the value is present/not-present in the tree
     */
    private void insert(Node currNode,int value){
        Node newNode = createNewNode(value);
        Node leafNode = findLeafNode(currNode,value);

        if(value==leafNode.value){
            // Don't do anything
        }else if(value<leafNode.value){
            leafNode.lNode = newNode;
        }else{
            leafNode.rNode = newNode;
        }
    }

    /**
     * Deleting a value in the BST
     * @param rootNode
     * @param value node matching to be deleted
     * @return returns true/false for the value to be deleted
     */
    public boolean delete(Node rNode, int value) {

        if(rNode.lNode==null && rNode.rNode==null){
            // There is just one node present
            if(rNode.value==value){
                rNode.value=0;
                return true;
            }else{
                return false;
            }
        }else{
            // There are more than one node present
            // Now check if there is matching node present

            return deleteChild(rNode,value);
        }

    }

    private boolean deleteChild(Node rNode, int value) {


        if(rNode.lNode!=null && rNode.rNode==null){
            // Left subtree
            //Node node = getPreviousNode(rNode.lNode,value);

            if(rNode.lNode.value==value){
                rNode.lNode = rNode;
                return true;
            }

        }else if(rNode.lNode==null && rNode.rNode!=null){
            // Right subtree
            Node node = getPreviousNode(rNode.rNode,value);
        }

        return false;
    }

    private Node getPreviousNode(Node rNode, int value) {

        Node currentNode = rNode;

        //if(currentNode.value==value)


        return currentNode;
    }

    private Node findLeafNode(Node currNode, int value) {
        if(value<currNode.value){
            if(currNode.lNode==null){
                return currNode;
            }else{
                Node lNode = currNode.lNode;
                return findLeafNode(lNode,value);
            }
        }else{
            if(currNode.rNode==null){
                return currNode;
            }else{
                Node rNode = currNode.rNode;
                return findLeafNode(rNode,value);
            }
        }
    }

    /**
     * Creates a new node and returns that new node
     * @param value
     * @return Node the is newly created
     */
    private Node createNewNode(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.lNode = newNode.rNode = null;
        return newNode;
    }

    /** ******************* PRIVATE IMPLEMENTATIONS ******************* **/

}
