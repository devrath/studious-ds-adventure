import java.util.LinkedList;
import java.util.Queue;

public class Main {

    /**
     * What are QUEUES: ->
     * * It is a FIFO data structure
     * * It is a data structure that is used for holding the data prior to processing
     * * **** *
     * Operations: -> There are two operations in QUEUES
     * EN-QUEUE: Adding the item to the end of the queue
     * DE-QUEUE: Removing the item from the start of the queue
     * * *** *
     * Two pointers: -> There are two pointers used here
     * HEAD: It points to the end of the queue, where items are removed
     * TAIL: It points to the start of the queue where items are added
     * *******
     * We cannot instantiate a Queue directly instead we can use linked list which is implementation of deque and queue
     * * *** *
     * * These are some methods given by queue interface on implementing it
     * ADDING an element: It is done by operation ENQUEUE or OFFER(e)
     * REMOVING an element: It is done by operation DEQUEUE or poll()
     * CHECKING an element: It is done by the operation peek(), it gives the element at the front of the queue which is head
     * * Since the Queue extends collection, we can check if the queue <isEmpty> and <size> from the collection method.
     * * ************************ *
     * Implementations of queues
     * * Keyboard buffers: -> The order in which you enter is the order in which characters must be displayed in screen
     * * Printer queue: -> The order in which the items are added to printer is the order in which the pages must be printed in printer
     * * Algorithms: -> LinkedList, PriorityQueue, Breadth First search algorithms
     */

    public static void main(String[] args) {

        System.out.println("Starting the program");
        Queue<String> queue = new LinkedList<>();
        queue.offer("Movie-1");
        queue.offer("Movie-2");
        queue.offer("Movie-3");
        queue.offer("Movie-4");
        System.out.println("Elements of Queue:-> "+queue);
        System.out.println("Checking the elements of Queue:-> "+queue.peek());

    }
}