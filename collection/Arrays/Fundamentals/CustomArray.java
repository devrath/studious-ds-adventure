package arrays;

/**
 * OPERATIONS SUPPORTED:->
 * <1> Inserting a new item</1>
 * <2> Removing item at particular position in array</2>
 * <3> Removing element from end</3>
 * <4> Index of an item</4>
 */

public class CustomArray {

    private int[] data;

    private int maxSize = 0;
    private int currentPosition = 0;

    public CustomArray(int size){
        // Position starts from first element index
        currentPosition = 0;
        // Set the size of the array with the element size passed
        this.maxSize = size;
        // Initialize the array
        data = new int[maxSize];
    }

    /** ******************************** OPERATIONS ******************************** **/
    /**
     * OPERATION:-> Inserting a new item
     */
    public void insert(int item){
        if(maxSize>=currentPosition){
            // We are either at the beginning with no elements added or at end where array is filled
            resizeArray();
            // Add new element
            addNewElement(item);
        }else{
            // Add new element - > Since space is available
            addNewElement(item);
        }
    }

    /**
     * OPERATION:-> Removing element at a particular position
     */
    public void removeAtPosition(int positionToRemove){
        if((positionToRemove<0)||(positionToRemove>=maxSize)){
            System.out.println("The position is invalid to be deleted");
        }else{
            if(positionToRemove==(maxSize-1)){
                // Last element
                removeElementFromEnd();
            }else{
                // It is not the last element to be deleted
                for (int i=positionToRemove ; i<(maxSize-1) ; i++){
                    data[i] = data[i+1];
                    maxSize--;
                    currentPosition--;
                }
            }
        }
    }

    /**
     * OPERATION:-> Removing element from the end
     */
    public void removeElementFromEnd() {
        if(currentPosition>=0){
            // There are elements present to delete
            currentPosition--;
            maxSize--;
        }
    }

    /**
     * OPERATION:-> Index of a given item
     */
    public void indexOfAnItem(int item){
        int position = -1;
        for (int i=0 ; i<(maxSize-1) ; i++){
            if(data[i]==item){
                position=i;
                break;
            }
        }
        if(position==-1){
            System.out.println("Item not found");
        }else{
            System.out.println("Item found at position:->"+position);
        }
    }
    /** ******************************** OPERATIONS ******************************** **/




    private void addNewElement(int item) {
        data[currentPosition] = item;
        currentPosition++;
    }

    private void resizeArray() {
        int newMaxSize = maxSize+1;
        int[] newData = new int[newMaxSize];
        // Add all the elements from old array to new Array
        for (int i=0;i<maxSize;i++) {
            newData[i] = data[i];
        }
        // Update the new size
        maxSize = newMaxSize;
        // Update the new data
        data = newData;
    }


    @Override
    public String toString() {
        StringBuilder strBuff = new StringBuilder();
        strBuff.append("[");
        for (int i=0;i<currentPosition;i++) {
            strBuff.append(data[i]);
            if(i<currentPosition-1){
                strBuff.append(",");
            }
        }
        strBuff.append("]");

        return strBuff.toString();
    }
}
