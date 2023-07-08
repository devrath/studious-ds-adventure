package queue.implArray;

public class PriorityQueue {

    private int[] myArray;
    private int arraySize;
    private int count;


    public PriorityQueue(int size) {
        myArray = new int[size];
        arraySize = size;
        count=0;
    }


    /**
     * OPERATION:
     * Inserting elements in the array
     */
    public void insert(int value){

        //Check if the queue is full
        if(count==(arraySize)){
            // The queue is full - Resize the array and increase the size
            resizeTheArray();
        }

        int i;
        // Shifting the items
        for (i=count-1 ; i>=0 ;i--){
            if(myArray[i]>value){
                // Copy the value of current cell to right cell
                myArray[i+1] = myArray[i];
            }else{
                // If the current item is not greater than the value we are inserting
                break;
            }
        }
        myArray[i+1] = value;
        count++;

    }

    /**
     * Resizing the array
     */
    private void resizeTheArray() {
        int newArraySize = arraySize+1;
        int[] newArray = new int[newArraySize];
        for (int i=0 ; i<arraySize ; i++){
            newArray[i] = myArray[i];
        }
        arraySize = newArraySize;
        myArray = newArray;
    }


    /**
     * OPERATION:
     * Printing elements in the array
     */
    public void display(){
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("[");
        for(int i=0 ; i<count ; i++){
            strBuff.append(myArray[i]);
            if(i<count-1){
                strBuff.append(",");
            }
        }
        strBuff.append("]");
        System.out.println(strBuff);
    }


}
