public class RemoveLastElements {

    private Node head;
    private Node tail;
    private int length;

    public RemoveLastElements() {
        // Add elements to sample set
        addElements();
        // --- Remove elements ---
        removeElement();
        removeElement();
        removeElement();
        // --- Remove elements ---
        // Print elements left after the operations
        printElements();
    }


    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void removeElement() {

        if(length==0){
            // <-------- There are no elements left to delete  ------------------>
            System.out.println("There are no elements left to delete");
        }else {
            if(length==1){
                // <--------  There is just one element left to delete -------------->
                head=tail=null;
                System.out.println("Last remaining element is deleted");
            }else{
                // <-------- There are more than one elements left to delete -------->
                Node currentNode = head;
                // Traverse till the node that is previous to last node
                while (currentNode.next.next!=null){
                    // Iterate to next node
                    currentNode = currentNode.next;
                }

                // Set the last node to null
                currentNode.next = null;
                // Point the tail to the last node that will be called future last node
                tail = currentNode;
            }
            // Decrement the counter
            length--;
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


    /**
     * OPERATION: Creating a new node
     */
    private Node createNode(int value) { return  new Node(value);}

}
