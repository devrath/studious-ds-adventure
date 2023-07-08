package queue.implArray;

public class Demo {

    public static void main(String[] args){

        PriorityQueue myQueue = new PriorityQueue(3);
        myQueue.insert(10);
        myQueue.insert(5);
        myQueue.insert(3);
        myQueue.insert(7);
        myQueue.insert(6);

        myQueue.display();

    }

}
