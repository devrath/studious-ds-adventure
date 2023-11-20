package programs;

import java.util.HashMap;
import java.util.Map;

public class FindKthLastNodeFromList {

    private Node head;
    private Node tail;
    private int length;

    public FindKthLastNodeFromList() {
        // Add elements to sample set
        addElements();
        // Get element
        findKthElementFromEnd(2);
    }

    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void findKthElementFromEnd(int position) {

        if((position<=0) || (position>length)){
            // Invalid operation
            System.out.println("Invalid operation");
        }else{
            // Valid operation
            Map<Integer,Integer> collection = new HashMap<>();

            Node current = head;

            int pos = 0;
            while(current!=null){
                collection.put(pos,current.value);
                pos++;
                current = current.next;
            }

            int collectionSize = collection.size();

            int positionToGet = collectionSize-position;

            System.out.println("Result:--> "+collection.get(positionToGet));

        }

    }

    // Add the elements to sample set
    private void addElements() {
        append(createNode(10));
        append(createNode(20));
        append(createNode(30));
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
     * OPERATION: Printing the elements in the list
     */
    private void printElements(String message){
        // Use the current node to track to iteration
        Node currentNode = head;

        StringBuilder buff = new StringBuilder();
        buff.append(message);
        buff.append("----->");
        buff.append("[");
        while (currentNode!=null){
            buff.append(currentNode.value);
            currentNode = currentNode.next;
            if(currentNode!=null){
                buff.append("-");
            }
        }
        buff.append("]");

        System.out.println(buff);
    }


    /**
     * OPERATION: Creating a new node
     */
    private Node createNode(int value) { return  new Node(value);}

}
