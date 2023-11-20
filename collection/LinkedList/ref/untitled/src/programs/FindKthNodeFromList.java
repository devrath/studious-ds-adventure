package programs;

public class FindKthNodeFromList {

    private Node head;
    private Node tail;
    private int length;

    public FindKthNodeFromList() {
        // Add elements to sample set
        addElements();
        // Print elements left after the operations
        printElements("Elements before reversing");
        // Set element
        reverseElements();
        // Print elements left after the operations
        printElements("Elements after reversing");
    }


    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void reverseElements() {

        if(length==0){
            // No elements are present in the list
            System.out.println("No elements are present to reverse");
        }else if(length==1){
            // There is just one element present in the list
            System.out.println("There is just one element so Item remains unchanged");
        }else{
            // There are more than one elements present in the list

            // Initial pointer states
            Node prevNode = null;
            Node currentNode = head;
            Node nextNode = currentNode.next;

           for(int i=0 ; i<length ; i++){
               // <----- On Each iteration ----->

               // Next node will be -- next to current node
               nextNode = currentNode.next;
               // Change the direction of pointer
               currentNode.next = prevNode;

               // point previous node pointer to current node
               prevNode = currentNode;
               // Current Node pointer to next node
               currentNode = nextNode;
           }

           // Exchange the pointers of head and tail
            Node temp = head;
            head = tail;
            tail = temp;

            System.out.println("Done");
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
