package linkedlist.programs;


public class RemoveDuplicatesInSortedList {

    private Node head;
    private Node tail;
    private int length;

    public RemoveDuplicatesInSortedList() {
        // Add elements to sample set
        addElements();
        removeDuplicates();
        printElements();
    }

    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void removeDuplicates() {

        if(head==null){
            // No elements are present
            System.out.println("No elements are present, So Invalid operation");
        }else if(head.next==null){
            // Just one element is present
            System.out.println("One element is present, So there cannot be duplicates");
        }else{
            // More than one element are present
            Node prevNode = head;
            Node currNode = prevNode.next;

            while(currNode!=null){

               if(currNode.value == prevNode.value){
                   // Move the current node pointer
                   currNode = currNode.next;
                   // skip the iteration
                   continue;
               }else{
                    // Connect the prev pointer to the current node
                    prevNode.next = currNode;
                    // point the prev pointer to current node --> This will skip the repeated elements
                    prevNode = currNode;
                    // move current pointer to next since it should be one point ahead
                    currNode = currNode.next;
               }
            }
        }
    }

    // 1 , 2, 3, 3, 4

    // Add the elements to sample set
    private void addElements() {
        append(createNode(1));
        append(createNode(1));
        append(createNode(2));
        append(createNode(3));
        append(createNode(3));
        append(createNode(4));
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


    /**
     * OPERATION: Creating a new node
     */
    private Node createNode(int value) { return  new Node(value);}

}
