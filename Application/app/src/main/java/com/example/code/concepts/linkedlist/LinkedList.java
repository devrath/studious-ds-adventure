package com.example.code.concepts.linkedlist;

import com.orhanobut.logger.Logger;

import org.w3c.dom.Node;

public class LinkedList {

    private Node first;
    private Node last;

    public void deleteLast(){

        if(first==null){
            // Linked list is empty
            Logger.d("The List is empty, So can't perform the delete operation!");
        }else{
            // Get the previous node
            Node prevNode = getPrevious(last);
            if(prevNode==null){
                first = last = null;
            }else{
                // Point prevNode to last link
                last = prevNode;
                // Un-link the node so that garbage collector can free the data
                last.next = null;
            }
        }
    }

    private Node getPrevious(Node node) {
        Node currentNode = first;

        // Traverse and find the last node
        while (currentNode!=null){
            if(currentNode.next == node) return currentNode;
             currentNode = currentNode.next;
        }

        // By now if you are not able to find the last node - return null value
        return null;
    }

    public void deleteFirst(){
        if(first==null){
            // Linked list is empty
            Logger.d("The List is empty, So can't perform the delete operation!");
        }else{
            // Items are available in the list

            // Keep the second node reference
            Node secondNode = first.next;
            // Unlink the first node so that, GC can collect the node
            first.next = null;
            // Point the head node into the second node
            first = secondNode;
        }
    }

    public int indexOf(int item){
        int currentIndex = 0;
        Node current = first;

        while(current.next!=null){
            if(current.value==item) return currentIndex;
            current = current.next;
            currentIndex++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item)!=-1;
    }

    public void addLast(int item) {
        //Wrap the integer inside a node object
        Node node = new Node(item);

        if(isEmpty()){
            // SCENARIO-1: There are no nodes present in the list so new node becomes the only node to be present.
            first = last = node;
        }else{
            // Scenario-2: The are one or more nodes, Thus the new node we are adding becomes the last node.

            // Linking the last node to the new node
            last.next = node;
            // We need to point the last to the new node
            last = node;
        }

    }

    public  void addFirst(int item) {
        // Wrap the integer in the node object
        Node node = new Node(item);

        if(isEmpty()){
            first = last = node;
        }else{
            // Point the address of the new node to the first
            node.next = first;
            // Point the first to new node
            first = node;
        }

    }

    private boolean isEmpty() {
        return first == null;
    }

    /**
     * Node class is made private since no-where in program we can access the node class
     * We declared this class inside the Linked list, doing so we can access the private members of the node class
     */
    private class Node {
        // Here we store the value
        private int value;
        // Here we store the reference to the next node
        private Node next;

        public Node(int value) {
            // A node must always have a value so whenever the node is created, We need to have a value.
            this.value = value;
        }
    }

}
