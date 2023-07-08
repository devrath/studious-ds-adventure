package trees;

public class MoshBST {


    public Node root;

    /**
     * Inserting the value for the tree
     * @param value
     */
    public void insert(int value) {
        if(root==null){
            // No nodes are present - Thus, Inserting node will be the root node
            root = createNode(value);
        }else{
            // Nodes are present
            Node temp = root;
            while(temp!=null){
                if(value<temp.value){
                    //Insertion should be on left subtree
                    if(temp.leftChild==null){
                        // Insert here
                        Node newNode = createNode(value);
                        temp.leftChild = newNode;
                        break;
                    }else{
                        temp=temp.leftChild;
                    }
                }else if(value> temp.value){
                    //Insertion should be on the right subtree
                    if(temp.rightChild==null){
                        // Insert here
                        Node newNode = createNode(value);
                        temp.rightChild = newNode;
                        break;
                    }else{
                        temp=temp.rightChild;
                    }
                }else{
                    // Don't do anything
                    break;
                }
            }
        }
    }

    /**
     * Finding a value in tree
     * @param value
     * @return
     */
    public boolean find(int value){
        boolean isElementFound = false;

        if(root == null){
            // No elements are present
            isElementFound = false;
        }else{
            Node temp = root;

            while(temp!=null){
                if(value==temp.value){
                    isElementFound = true;
                    break;
                }else if(value<temp.value){
                    if(temp.leftChild==null){
                        isElementFound = false;
                        break;
                    }else{
                        temp = temp.leftChild;
                    }
                }else if(value>temp.value){
                    if(temp.rightChild==null){
                        isElementFound = false;
                        break;
                    }else{
                        temp = temp.rightChild;
                    }
                }
            }
        }


        return isElementFound;
    }

    /**
     * Displaying the root node
     * @return
     */
    public Node displayRoot(){
        return root;
    }

    /**
     * Creating a new node
     * @param value
     * @return Node
     */
    private Node createNode(int value) {
        return new Node(value);
    }

    /**
     * Traversal: PRE-ORDER
     * @param node
     */
    public void traversePreOrder(Node node){

        System.out.println(node.value);

        if (node.leftChild!=null){
            traversePreOrder(node.leftChild);
        }

        if (node.rightChild!=null){
            traversePreOrder(node.rightChild);
        }

    }

    /**
     * Traversal: IN-ORDER
     * @param node
     */
    public void traverseInOrder(Node node){

        if (node.leftChild!=null){
            traverseInOrder(node.leftChild);
        }

        System.out.println(node.value);

        if (node.rightChild!=null){
            traverseInOrder(node.rightChild);
        }

    }

    /**
     * Traversal: POST-ORDER
     * @param node
     */
    public void traversePostOrder(Node node){

        if (node.leftChild!=null){
            traversePostOrder(node.leftChild);
        }

        if (node.rightChild!=null){
            traversePostOrder(node.rightChild);
        }

        System.out.println(node.value);

    }

    /**
     * Calculate height of the tree
     * @param node
     * @return height of the tree
     */
    public int calculateHeight(Node node){

        // BASE CONDITION: if both left and right subtree are null
        if(node.leftChild==null && node.rightChild==null){
            return 0;
        }

        // FORMULAE: 1 + Max((height of left-sub-tree),(height of right-sub-tree))
        int result = 1+ Math.max(
                calculateHeight(node.leftChild),
                calculateHeight(node.rightChild)
        );

        return result;
    }

    /**
     * Calculate the minimum value in a tree
     * @param node
     * @return minimum value
     */
    public int calculateMinValue(Node node){

        // Base condition
        if(node.leftChild==null && node.rightChild==null){
            return node.value;
        }

        int parent = node.value;

        int minOfChilds = Math.min(
                calculateMinValue(node.leftChild),
                calculateMinValue(node.rightChild)
        );

        int result = Math.min(parent,minOfChilds);

        return result;
    }

    /**
     * Public method to calculate is it binary search tree
     * @return
     */
    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    /**
     * Recursive method to calculate the binary search tree
     *
     * @param root
     * @param minValue
     * @param maxValue
     * @return
     */
    private boolean isBinarySearchTree(
            Node root, int minValue, int maxValue
    ) {
            // Check if root is null -> Then it is binarySearch tree
            if(root==null){
                return true;
            }

            // If the value does not fall in a bracket range -> Then it is not binarySearch tree
            if(root.value<minValue || root.value>maxValue){
                return false;
            }

            // Perform recursion of left and right subtree
            return  isBinarySearchTree(root.leftChild,minValue, root.value) &&
                    isBinarySearchTree(root.rightChild, root.value, maxValue);
    }


    class Node {
        public int value;
        public Node leftChild;
        public Node rightChild;

        public Node(int value) {
            this.value = value;
        }

    }


}
