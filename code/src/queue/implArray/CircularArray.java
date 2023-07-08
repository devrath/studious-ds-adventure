package queue.implArray;

public class CircularArray {

    private int[] myArr;
    private int size;
    private int front,rear;

    CircularArray(int currentSize){
        myArr = new int[currentSize];
        size = myArr.length;
        front = 0;
        rear = 0;
    }


    /**
     * We insert from rear and delete from first
     * So this is FIFO
     * @param value
     */
    public void insert(int value){
        if(size==0){
            // No place to insert
            throw new IllegalArgumentException("No space to insert");
        } else {
            // Size is sufficient to add elements into array

            if(rear<size){
                // until the size of array is filled from the rear
                myArr[rear]=value;
                rear++;
            }else{
                // No lets check if any elements are deleted and place is created at the front
                if(front==0){
                    // No place to insert
                    throw new IllegalArgumentException("No space to insert");
                }else{
                    // One of the element is deleted so there is place created to insert
                    --front;
                    myArr[front] = value;
                }
            }
        }
    }

    /**
     * Deleting an element
     */
    public void delete(){
        if(size==0){
            // Can't delete since the size of the array is zero
            throw new IllegalArgumentException("Can't delete since the size of the array is zero");
        }else{
            // Possibility of deletion
            if(front<rear){
                myArr[front]=0;
                front++;
            }else{
                // All elements are deleted
                front=0;
                rear=0;
                throw new IllegalArgumentException("All elements are deleted");
            }
        }
    }




    /**
     * OPERATION:
     * Printing elements in the array
     */
    public void display(){
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("[");
        for(int i=0 ; i<size ; i++){
            strBuff.append(myArr[i]);
            if(i<size-1){
                strBuff.append(",");
            }
        }
        strBuff.append("]");
        System.out.println(strBuff);
    }

}
