public class PrintElements {

    private Node head;
    private Node tail;
    private int length=0;

    public PrintElements() {
        initiate();
        printElements();
    }

    private class Node {
        int value;
        Node next = null;
        Node(int value) {
            this.value = value;
        }
    }

    private void initiate(){
        // Create a new node
        Node newNode = new Node(10);
        // Point the head node to the new node
        head = newNode;
        // Point the tail to the new node
        tail = newNode;
        // Increment length
        length++;
    }


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
