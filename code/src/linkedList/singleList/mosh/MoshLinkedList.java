package linkedList.singleList.mosh;

public class MoshLinkedList {

    Node head;
    Node tail;

    int nodesCount=0;

    public MoshLinkedList(int value){
        Node newNode = createNewNode(value);
        // Both head and tail will point to new node since it is the only node & the first node
        head = newNode;
        tail = newNode;
        // Increment the counter
        nodesCount++;
    }


    /** ****************** OPERATIONS ******************** **/
    /**
     * OPERATION:
     * Creating a new node
     * @param value
     * @return node
     */
    private Node createNewNode(int value) {
        return new Node(value);
    }

    /**
     * OPERATION:
     * Printing the elements of the node
     */
    public void printElements(){
        StringBuffer bufferStr = new StringBuffer();

        Node temp = head;
        bufferStr.append("[");
        while(temp.next!=null){
            bufferStr.append(temp.value);
            bufferStr.append("-");
            temp=temp.next;
        }
        bufferStr.append(temp.value);
        bufferStr.append("]");

        System.out.println(bufferStr);
    }

    /**
     * OPERATION:
     * Inserting a value at the end of the linked list
     * @param value
     */
    public void insertLast(int value){
        Node newNode = createNewNode(value);

        /*
        Two Scenarios:
        (1) No nodes present
        (2) More than one node are present
        */

        if(nodesCount==0){
            // No nodes present
            head = newNode;
            tail = newNode;
        }else{
            // More than one node are present
            Node temp = head;

            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next=newNode;
            tail = newNode;
        }
        nodesCount++;
    }

    /**
     * OPERATION:
     * Inserting a value at the first of the linked list
     * @param value
     */
    public void insertFirst(int value){
        Node newNode = createNewNode(value);
        /*
        Two Scenarios:
        (1) No nodes present
        (2) More than one node are present
        */
        if(nodesCount==0){
            // No nodes present
            head = newNode;
            tail = newNode;
        }else{
            // More than one node are present
            newNode.next=head;
            head=newNode;
        }
        nodesCount++;
    }

    /**
     * OPERATION:
     * Deleting the value at the beginning of the linked list
     */
    public void deleteFirst(){
        Node prevNode = head;
        Node nextNode = head.next;

        head = nextNode;
        prevNode = null;

        nodesCount--;
    }

    /**
     * OPERATION:
     * Deleting the value at the end of the linked list
     */
    public void deleteLast(){
        Node prevNode = head;
        Node nextNode = head.next;

        head = nextNode;
        prevNode = null;

        nodesCount--;
    }

    /**
     * OPERATION:
     * Check if the
     */
    public boolean contains(int value){
        boolean contains = false;
        Node temp = head;

        while (temp!=null){
            if(temp.value==value){
                contains = true;
                break;
            }
            temp=temp.next;
        }

        return contains;
    }

    /**
     * OPERATION:
     * Checking the element is present, then return the index
     */
    public int indexOf(int value){
        int index = -1;
        boolean isElementFound = false;
        Node temp = head;

        int currentIndex = 0;
        while (temp!=null){
            if(temp.value==value){
                isElementFound = true;
                break;
            }
            currentIndex++;
            temp=temp.next;
        }

        if(isElementFound) {
            index = currentIndex;
        }

        return index;
    }

    /**
     * OPERATION:
     * Converting linked-list to array
     */
    public int[] convertToArray() {

        int[] array = new int[nodesCount];
        Node temp = head;
        int count = 0;

        while (temp!=null){
            array[count] = temp.value;
            temp = temp.next;
            count++;
        }

        return array;
    }


    public void reverse(){

        Node prev = head;
        Node current = head.next;

        tail = head;
        tail.next = null;

        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;


        System.out.println(head);

    }


    /** ****************** OPERATIONS ******************** **/

    /**
     * Node Class
     */
    class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

    }
}
