package queue.implList;

public class Queue {

    Node head;
    Node tail;
    int length=0;

    public Queue(int value){
        Node mNode = new Node(value);
        head = mNode;
        tail = mNode;
        length++;
    }

    class Node {
        Node next;
        int value;
        Node(int value){
            this.value=value;
        }
    }

    /**
     * Printing the elements in the stack
     */
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

    /**
     * Enqueuing - adding elements to the queue
     */
    public void enqueue(int value){
        Node mNode = new Node(value);
        if(length==0){
            // No elements present
            head = mNode;
            tail = mNode;
        }else{
            // There are more than just one element
            tail.next = mNode;
            tail = mNode;
        }
        length++;
    }

    // De-Queuing - removing elements from the queue
    public void dequeue() {
        if(length==0 || length<0){
            // No elements are present to be deleted
            System.out.println("There are no elements present to be deleted");
        }else if(length==1){
            // There is just one element present to be deleted
            head = null;
            tail = null;
            length--;
        }else{
            // delete the element from the beginning
            Node temp = head;
            head = head.next;
            temp.next=null;
            length--;
        }
    }


}
