package fundamentals;

public class AppendElements {

    private Node head;
    private Node tail;
    private int length;

    public AppendElements() {
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

        // Append Node-1
        append(node1);
        // Append Node-2
        append(node2);
        // Append Node-3
        append(node3);
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
        System.out.println("Head ----->" + head.value);
        System.out.println("Tail ----->" + tail.value);
        System.out.println("Length --->" + length);

    }

}
