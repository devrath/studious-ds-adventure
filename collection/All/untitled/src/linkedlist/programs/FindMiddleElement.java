package linkedlist.programs;

public class FindMiddleElement {

    private Node head;
    private Node tail;
    private int length;

    public FindMiddleElement() {
        // Add elements to sample set
        addElements();
        findMiddleElement();
    }

    private class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private void findMiddleElement() {

        if(head==null){
            // No elements are present
            System.out.println("No elements are present, So we cannot find the middle element");
        }else if(head.next==null){
            // Just one element is present
            int middleElement = head.value;
            System.out.println("Middle Element:-> "+middleElement);
        }else{
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println("Middle Element:-> "+slow.value);

        }
    }

    // Add the elements to sample set
    private void addElements() {
        append(createNode(4));
        append(createNode(8));
        append(createNode(15));
        append(createNode(16));
        append(createNode(23));
        append(createNode(42));
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
