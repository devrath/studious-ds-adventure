package com.example.code.concepts.linkedlist;

public class LinkedList {

    private Node first;
    private Node last;

    public void addLast(int item) {
        //Wrap the integer inside a node object
        Node node = new Node(item);

        if(first == null){
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
