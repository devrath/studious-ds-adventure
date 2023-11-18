package fundamentals;

public class PrependElements {

    private Node head;
    private Node tail;
    private int length;

    public PrependElements() {
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
        // Node-1
        Node node1 = createNode(10);
        // Node-2
        Node node2 = createNode(20);
        // Node-3
        Node node3 = createNode(30);

        // Prepend Node-1
        prepend(node1);
        // Prepend Node-2
        prepend(node2);
        // Prepend Node-3
        prepend(node3);
    }

    /**
     * OPERATION: Prepending the node at the end of the list
     */
    private void prepend(Node newNode) {

        if(length==0){
            // This is the first node to be added
            head = newNode;
            tail = newNode;
        }else{
            // New node will point to existing node
            newNode.next = head;
            // Point head pointer to new node
            head = newNode;
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
        System.out.println("Head ----->" + head.value);
        System.out.println("Tail ----->" + tail.value);
        System.out.println("Length --->" + length);

    }

}
