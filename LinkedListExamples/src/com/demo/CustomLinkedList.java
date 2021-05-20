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

    // OPERATION: removeFirst
    public void removeFirst() {
        if(!isEmpty()){
            var second = first.next;
            first.next = null;
            first = second;
        }else{
            System.out.println("No elements are present");
        }
    }

    // OPERATION: removeLast
    public void removeLast() {
        if(first==last){
            // Just one element
            first=last=null;
            return;
        }else if(!isEmpty()){
            // remove last element since there are are more than one element
            var previousNode = getPreviousNode(); // Get the previous node
            last = previousNode; // Get the last but one previous node
            last.next = null; // Set the last node address to null
        } else{
            // No elements
            System.out.println("No elements are present");
        }
    }

    // Get the previous node
    private Node getPreviousNode() {
        var current = first;
        while (current!=null) {
            if(current.next == last){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // OPERATION: contains
    public boolean contains(int item) {
        return indexOf(item)!=-1;
    }

    /**
     * If no nodes are present in the list
     * @return
     */
    private boolean isEmpty() {
        return first==null;
    }

}
