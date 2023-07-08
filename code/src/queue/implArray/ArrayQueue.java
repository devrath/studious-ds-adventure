package queue.implArray;

public class ArrayQueue {

    private int[] myArray;
    private int rear,front,size;

    public ArrayQueue() {
        myArray = new int[0];
        rear=0;
        front=0;
        size=0;
    }

    /**
     * OPERATION:
     * Printing elements in the array
     */
    public void display(){
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("[");
        for(int i=rear ; i<front ; i++){
            strBuff.append(myArray[i]);
            if(i<front-1){
                strBuff.append(",");
            }
        }
        strBuff.append("]");
        System.out.println(strBuff);
    }

    /**
     * OPERATION:
     * Inserting element from the end of the queue
     */
    public void enqueue(int value){
        resizeArray();
        myArray[rear] = value;
        front++;
    }

    /**
     * OPERATION:
     * Deleting the element from the front of the queue
     */
    public void dequeue(){
        if(size==rear){
            System.out.println("No elements left to delete");
        }else{
            myArray[front-1] = 0;
            front--;
            size--;
        }
    }


    /**
     * OPERATION:
     * Increasing the array size
     */
    private void resizeArray() {
        // Determine the size
        int newSize = size+1;
        int[] newArray = new int[newSize];
        // Add all the elements of older array to new array
        for(int i=0 ; i<size ; i++){
            newArray[i+1] = myArray[i];
        }
        // Set the new Array
        myArray = newArray;
        // Set the size
        size = newSize;
    }


}
