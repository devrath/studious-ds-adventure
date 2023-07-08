package doublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
        // When we invoke the constructor, We create a first node
        Node mNode = new Node(value);
        head = mNode;
        tail = mNode;
        length = 1;
    }

    class Node {
        int value;
        Node prev;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    
    public void getHead(){
        if(head!=null){ System.out.println("Head: "+head.value);
        }else{ System.out.println("No elements present"); }
    }

    public void getTail(){
        if(tail!=null){ System.out.println("Tail: "+tail.value);
        }else{ System.out.println("No elements present"); }
    }

    public void getLength(){
        System.out.println("Elements count: "+length);
    }

    public void printElements(){
        Node temp = head;
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("<--");
        while (temp!=null){
            strBuff.append(temp.value);
            temp = temp.next;
            strBuff.append("-");
        }
        strBuff.append("->");
        System.out.println(strBuff);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null && tail == null){
            // No nodes are present
            head = newNode;
            tail = newNode;
        }else if(length==1){
            // Only one node is present
            head.next = newNode;
            newNode.prev = head;
            tail = newNode;
        }else{
            // There can be more than one elements
            Node temp = head;
            Node lastNode = head;
            while (temp!=null){
                if(temp.next==null){
                    lastNode=temp;
                }
                temp = temp.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
            tail= newNode;
        }
        length++;

    }

    public Node removeLast(){
        Node temp = tail;
        if(length==0){
            // There are no elements left to delete
            return null;
        }else if (length==1) {
            // There is just one node remaining
            head=tail=null;
            length--;
            return null;
        }else if(length>1){
            // There are more than one element
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;
            return tail;
        }else {
            return null;
        }
    }

    public void prepend(int value) {
        Node mNode = new Node(value);
        if(length==0){
            // No elements present
            head = mNode;
            tail = mNode;
        }else if(length>=1){
           // Only one element is present
           mNode.next = head;
           head.prev = mNode;
           head = mNode;
        }
        length++;
    }

    public void removeFirst(){
        if(length==0){
            System.out.println("No elements present to delete");
        } else if (length==1) {
            head = tail = null;
            length--;
        }else{
            Node nextNode = head.next;
            head = nextNode;
            head.prev = null;
            length--;
        }
    }

    public void get(int position){
        if(position<length || position>=length){
            // It's a invalid position
            System.out.println("Invalid position");
        }else if(position == 0 && length==0){
            // No nodes are present so return null
            System.out.println("No elements are present to be returned");
        } else if (position == 1 && length==1) {
            // Just one node it presents so return it
            System.out.println("Element:->"+head.value);
        }else if(position < length/2){
            // Element is present in the left part of the list so use head pointer
            Node temp = head;
            int count = 0;
            for (int i=0 ; i<length ; i++){
                if (count==position){
                    break;
                }
                temp = temp.next;
                count++;
            }
            System.out.println("Element:->"+temp.value);
        }else{
            // Element is present in the right part of the list so use tail pointer
            Node temp = tail;
            int count = length-1;
            for (int i=0 ; i<length ; i++){
                if (count==position){
                    break;
                }
                temp = temp.prev;
                count--;
            }
            System.out.println("Element:->"+temp.value);
        }
    }
    public void set(int position, int value){
        if (position < 0 || position>=length) {
            // Position is invalid
            System.out.println("Invalid position");
        } else if(length==1 && position==(length-1)){
            // Just one element
            head.value = value;
        } else {
            // Find the element and change the value
            // Here based on the position again we can traverse from left or right part of the linked list
            if(position<length/2){
                // We can start from head
                Node temp = head;
                int count = 0;
                while (temp!=null){
                    if(position==count){
                        temp.value = value;
                        break;
                    }
                    temp = temp.next;
                    count++;
                }
            }else{
                // we can start from tail
                Node temp = tail;
                int count = length-1;
                while (temp!=null){
                    if(position==count){
                        temp.value = value;
                        break;
                    }
                    temp = temp.prev;
                    count--;
                }
            }
        }
    }

    public void insert(int position, int value){
        Node mNode = new Node(value);
        if(position<0 || position>=length){
            System.out.println("Invalid position");
        }else if(length==0){
            head = mNode;
            tail = mNode;
            length++;
        } else if (length==1) {
            // Just one element is present
            if(position==0){
                // Insert at the beginning
                Node temp = head;
                mNode.next = temp;
                temp.prev = mNode;
                head = mNode;
            }else if(position==1){
                // Insert at the end
                Node temp = head;
                temp.next= mNode;
                mNode.prev = temp;
                tail= mNode;
            }
            length++;
        }else{
            // There are more than one element
            if(position<length/2){
                // LEFT-PART:-> Use head pointer to traverse the element
                Node temp = head;
                Node prev = head;
                int count = 0;

                while(temp!=null){
                    if(position == count){
                        break;
                    }
                    prev = temp;
                    temp = temp.next;
                    count++;
                }
                prev.next = mNode;
                mNode.prev = prev;
                mNode.next=temp;
                temp.prev=mNode;
            }else{
                // RIGHT-PART:-> Use tail pointer to traverse the element
                Node temp = tail;
                Node prev = tail;
                int count = length;
                while (temp!=null){
                    if(count==position){
                        break;
                    }
                    prev = temp;
                    temp = temp.prev;
                    count--;
                }

                temp.next = mNode;
                mNode.next = prev;
                prev.prev = mNode;
                mNode.prev = temp;
            }
            length++;
        }
    }

}
