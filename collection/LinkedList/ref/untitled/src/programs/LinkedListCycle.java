package programs;


public class LinkedListCycle {

    private Node head;
    private Node tail;
    private int length;

    public LinkedListCycle() {
        // Add elements to sample set
        addElements();
        detectCycle();
    }

    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void detectCycle() {

        if(head==null){
            // No elements are present
            System.out.println("No elements are present to detect cycle");
        }else if(head.next==null){
            // Just one element is present
            System.out.println("One element is present, So there cannot be a cycle");
        }else{

            Node rabbit=head;
            Node turtle=head;
            // Flag to keep track if cycle is found
            boolean isCycleDetected = false;
            // Keep iterating until we reach to end of the list
            while(rabbit!= null && rabbit.next!=null){
                // Proceed 2 steps
                rabbit = rabbit.next.next;
                // Proceed 1 step
                turtle = turtle.next;
                // If both are equal then a cycle is found while iterating
                if(rabbit==turtle){
                    // Indicate cycle is found
                    isCycleDetected = true;
                    System.out.println("Cycle Detected !");
                    // Break from the loop
                    break;
                }
            }

            if(!isCycleDetected){
                // If the flag is false - It indicates loop was not there
                System.out.println("Cycle Not Detected !");
            }

        }
    }

    // 1 , 2, 3, 3, 4

    // Add the elements to sample set
    private void addElements() {

        Node firstNode = createNode(1);
        Node secondNode = createNode(2);
        Node thirdNode = createNode(3);
        Node fourthNode = createNode(4);
        Node fifthNode = createNode(5);
        Node sixthNode = createNode(6);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        // Cycle
        //sixthNode.next = thirdNode;
        // Set length
        length = 6;

        head = firstNode;
        tail = sixthNode;
    }

    /**
     * OPERATION: Creating a new node
     */
    private Node createNode(int value) { return  new Node(value);}

}
