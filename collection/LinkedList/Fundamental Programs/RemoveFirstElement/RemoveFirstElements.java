public class RemoveFirstElements {

    private Node head;
    private Node tail;
    private int length;

    public RemoveFirstElements() {
        initiate();
        printElements();
    }

    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void initiate() {
        // Add elements
        append(createNode(10));
        append(createNode(20));
        append(createNode(30));
        // Perform deletion from the beginning of list
        removeFirstElement();
        removeFirstElement();
        removeFirstElement();
    }

    /**
     * OPERATION: Removing the element from the beginning of the list
     */
    private void removeFirstElement() {
        if(length==0){
            // There are no elements
            System.out.println("No elements are left to delete");
        }else{
            if(length==1){
                // There is just one element
                head = null;
                tail = null;
            }else{
                // There are more than one element
                Node nextNode = head.next;
                head = nextNode;
            }
            length--;
        }
    }

    /**
     * OPERATION: Appending the node at the end of the list
     */
    private void append(Node newNode) {

        if(length==0){
            // This is the first node to be added
            head = newNode;
            tail = newNode;
        }else{
            // Attach the last node to the new node
            tail.next = newNode;
            // Point he tail to the new node
            tail = newNode;
        }

        // Increment the length
        length++;

    }

    /**
     * OPERATION: Creating a new node
     */
    private Node createNode(int value) { return  new Node(value);}

    /**
     * OPERATION: Printing the elements in the list
     */
    private void printElements(){
        // Use the current node to track to iteration
        Node currentNode = head;

        StringBuilder buff = new StringBuilder();

        buff.append("[");
        while (currentNode!=null){
            buff.append(currentNode.value);
            currentNode = currentNode.next;
            if(currentNode!=null){
                buff.append("-");
            }
        }
        buff.append("]");

        System.out.println("Elements ->" + buff.toString());
        if(head!=null){
            System.out.println("Head ----->" + head.value);
        }else{
            System.out.println("Head ----->" + null);
        }
        if(tail!=null){
            System.out.println("Tail ----->" + tail.value);
        }else{
            System.out.println("Tail ----->" + null);
        }
        System.out.println("Length --->" + length);

    }

}
