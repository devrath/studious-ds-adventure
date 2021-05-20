package com.demo;

public class CustomLinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    private Node first = null;
    private Node last  = null;

    // OPERATION: addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        // If there are no nodes present, The new node will be the latest node.
        if(isEmpty()){
            first=last=node;
        }else{
            node.next = first;
            first = node;
        }

    }

    // OPERATION: addLast
    public void addLast(int item) {
        var node = new Node(item);

        // If there are no nodes present, The new node will be the latest node.
        if(isEmpty()){
            first=last=node;
        }else{
           last.next = node; // Point the reference of last node to the new node
           last=node; // Point the last to the node
        }

    }

    // OPERATION: indexOf
    public int indexOf(int item) {
       var index = 0;
       var current = first;

       while(current!=null){
           if(current.value==item){
               return index;
           }else{
               current = current.next;
               index++;
           }
       }
        return -1;
    }
    
    /**
     * If no nodes are present in the list
     * @return
     */
    private boolean isEmpty() {
        return first==null;
    }

}
