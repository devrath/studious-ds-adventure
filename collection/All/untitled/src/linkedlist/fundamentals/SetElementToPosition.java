package linkedlist.fundamentals;

public class SetElementToPosition {

    private Node head;
    private Node tail;
    private int length;

    public SetElementToPosition(int position, int valueToSet) {
        // Add elements to sample set
        addElements();
        // Set element
        setElement(position,valueToSet);
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

    private void setElement(int position, int valueToSet) {

       if(position<=-1 || position>=length){
           // <------ Position is invalid ------>
           System.out.println("Invalid position to insert");
       }else {
           // <-- Elements are present(more than one), So we can insert into a position -->
           // Traverse to a position
           Node currentNode = head;
           int traversePosition = 0;

           while ((currentNode!=null) && (traversePosition!=position)){
               currentNode = currentNode.next;
               traversePosition++;
           }
           if(currentNode!=null){
               currentNode.value = valueToSet;
           }
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
