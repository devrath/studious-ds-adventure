package stack.implList;

public class ListStack {

    Node head = null;
    int length = 0;

    public ListStack(int value){
        Node mNode = new Node(value);
        head = mNode;
        length++;
    }

    class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
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
     * Determining the length of the stack
     */
    public void printLength(){
        System.out.println("Length of the stack is:-> "+length);
    }

    /**
     * Push operation
     */
    public void push(int value){
        if(length==0){
            Node mNode = new Node(value);
            head = mNode;
        }else{
            Node mNode = new Node(value);
            mNode.next = head;
            head = mNode;
        }
        length++;
    }

    /**
     * Push operation
     */
    public void pop(){
        if(length==0){
            // No elements present to delete
            System.out.println("Stack is empty");
        }else if(length==1){
            // Just one element is present
            head = null;
            length--;
        }else{
            // More than one element present
            Node nextNode = head.next;
            Node currentNode = head;
            head = nextNode;
            currentNode.next = null;
            length--;
        }
    }

}
