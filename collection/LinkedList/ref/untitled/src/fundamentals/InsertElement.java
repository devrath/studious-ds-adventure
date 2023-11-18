package fundamentals;

public class InsertElement {

    private Node head;
    private Node tail;
    private int length;

    public InsertElement(int position, int valueToSet) {
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
        if(length==0){
            // No elements are present in the list
            System.out.println("Invalid operation since, There are no elements in list");
        }else if((position<=-1) || (position>length)){
            // Position is invalid on where we are inserting
            System.out.println("Invalid operation since, Position is invalid");
        }else{
            Node newNode = createNode(99);

            if(length==1){
                // There is just one element

                // Check if you want to insert prepend the element or append the element
                if(position==0){
                    // Prepend element
                    newNode.next = head;
                    head = newNode;
                }else{
                    // Append element
                    head.next = newNode;
                    tail = newNode;
                }

            }else{
                // <--------- More than one element are present --------->
                if(position==0){
                    // Scenario-1: Add at the beginning
                    newNode.next = head;
                    head = newNode;
                }else if(position==length){
                    // Scenario-2: Add at the end
                    tail.next = newNode;
                    tail = newNode;
                }else{
                    // Set initial states
                    Node prevElement = null;
                    Node currentElement = head;
                    Node nextElement = currentElement.next;
                    int currentPosition = 0;
                    // Iterate and reach to the position where you want to insert
                    while (currentElement!=null && currentPosition!=position){
                        prevElement = currentElement;
                        nextElement = currentElement.next.next;
                        currentElement = currentElement.next;
                        currentPosition++;
                    }
                    // set the appropriate pointers
                    prevElement.next = newNode;
                    newNode.next = currentElement;
                    currentElement.next= nextElement;
                }

            }
            length++;
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
