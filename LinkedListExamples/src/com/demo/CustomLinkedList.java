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

    private int size = 0;

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
        size++;
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
        size++;
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
            size--;
            return;
        }else if(!isEmpty()){
            // remove last element since there are are more than one element
            var previousNode = getPreviousNode(); // Get the previous node
            last = previousNode; // Get the last but one previous node
            last.next = null; // Set the last node address to null

            size--;
        } else{
            // No elements
            System.out.println("No elements are present");
        }
    }

    // OPERATION: getSize
    public int getSize() {
        return size;
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

    // OPERATION: Reverse list in place
    public void reverseList() {

        if(!isEmpty()){
            var previous = first;
            var current = first.next;

            while (current!=null){
                var next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            last = first;
            last.next = null;
            first = previous;
        }else{
            System.out.println("List is empty");
        }

    }

}
