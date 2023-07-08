package linkedList.singleList;


public class LinkedList {

    private Node head, tail;
    private int length;

    public class Node {
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node tempNode = new Node(value);
        head = tempNode;
        tail = tempNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null || tail == null) {
            // create a new node
            head = newNode;
            tail = newNode;
        } else {
            // Point the last node pointer to newly created node
            tail.next = newNode;
            // Point tail pointer to new node
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            Node prev = head;
            while (temp.next != null) {
                // Store the previous node reference before traversing next
                prev = temp;
                temp = temp.next;
            }
            tail = prev;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            // If there are no nodes in the list
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public Node get(int index) {
        int counter = 0;
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            Node itemToReturn = null;
            while (temp != null) {
                if (index == counter) {
                    // return this element
                    itemToReturn = temp;
                }
                temp = temp.next;
                counter++;
            }
            return itemToReturn;
        }
    }

    public boolean set(int index, int value) {
        int counter = 0;
        if (length == 0) {
            return false;
        } else {
            Node temp = head;
            boolean isValueSet = false;
            while (temp != null) {
                if (index == counter) {
                    // return this element
                    temp.value = value;
                    isValueSet = true;
                }
                temp = temp.next;
                counter++;
            }
            return isValueSet;
        }
    }

    public boolean insert(int index, int value) {
        Node newNode = new Node(value);
        if(index<0 || index>length){
            // Cant inset element since its a invalid position
            return false;
        } else if (index==0) {
            // Prepend
            newNode.next = head;
            head = newNode;
            length++;
            return true;
        }else if(index==length){
            // Append
            tail.next = newNode;
            tail = newNode;
            length++;
            return true;
        }else{
            // Insert in the middle based on position
            Node temp = head;
            Node prev = head;
            int count = 0;
            while (temp!=null){
                prev = temp;
                temp = temp.next;
                if(index==count){
                    Node interm = prev.next;
                    prev.next = newNode;
                    newNode.next = interm;
                    break;
                }
                count++;
            }
            length++;
            return true;
        }
    }

    public boolean remove(int index) {
        if(index<0 || index>length){
            // Not able to delete since the position is invalid
            return false;
        } else if(length==1){
            // There are more than one element but delete the first
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            return true;
        } else if (index==length) {
            // This is the node in the list to be deleted
            Node temp = head;
            Node prev = head;
            while (temp.next != null) {
                // Store the previous node reference before traversing next
                prev = temp;
                temp = temp.next;
            }
            tail = prev;
            prev.next=null;
            length--;
            return true;
        }else{
            // This is the node from the middle of the list to be deleted
            Node temp = head;
            Node prev = head;
            int count = 0;
            while(temp.next !=null){
                prev = temp;
                temp = temp.next;
                count++;
                if(count==index){
                    break;
                }
            }
            prev.next = temp.next;
            temp.next = null;
            length--;
            return false;
        }
    }
}

