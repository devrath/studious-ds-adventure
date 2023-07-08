package arrays;

public class CustomArray {

    private int size = 0;
    private int[] masterArray;
    private int currentIndex=0;

    CustomArray(int size){
        this.size = size;
        masterArray = new int[size];
    }

    /**
     * ********************* ARRAY OPERATIONS *********************
     */
    /**
     * OPERATION:
     * Inserting a element into the array
     * @param value
     */
    public void insert(int value){
        // check if the size is zero
        if(size==0){
            // There are no elements in the array
            // --> We need to resize and add the element
            resizeArray();
        }else{
            // There are elements in array
            if(currentIndex<=(size-1)){
                // But check here if the size has reached the maximum -> If so we need to resize and add the element
                // Just add it don't resize it
            }else{
                resizeArray();
            }
        }
        // Add a new element
        addNewElement(value);
    }

    /**
     * OPERATION:
     * Printing the elements of the array
     */
    public void printElements(){
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("[");
        int counter = 0;
        for (int element: masterArray) {
            if(counter==size){
                break;
            }
            strBuffer.append(element);
            if(counter<size-1){
                strBuffer.append(",");
            }
            counter++;
        }
        strBuffer.append("]");

        System.out.println(strBuffer);
    }

    /**
     * OPERATION:
     * Removing the item at a particular index
     */
    public void removeAt(int index){
        // Check if index is invalid
        if(index<=-1 || index>size){
            // Here the position is invalid so raise the exception
            throw new IllegalArgumentException("Position is invalid remove element");
        }else{
            // Position is valid
            if(index==(size-1)){
                // This is the last element, So easier to remove - O(1)
                masterArray[index]=0;
            }else{
                // This is somewhere at the mid of the array
                for(int i=index ; i<size ; i++){
                    masterArray[i-1] = masterArray[i];
                }
            }
            currentIndex--;
            size--;
        }

    }

    /**
     * OPERATION:
     * Getting the index of the item in the array
     */
    public int indexOf(int value){
        int index = -1;
        for(int i=0 ; i<masterArray.length; i++){
            if(value==masterArray[i]){
                index=i;
                break;
            }
        }
        return index;
    }

    /**
     * OPERATION:
     * Inserting an item at the particular index  in the array
     */
    public void insertAt(int index, int item){
        if(index<=-1 || index>size){
            // Invalid position to insert in the array
            throw  new IllegalArgumentException("Invalid position to insert in the array");
        }else{
            if(size==0 && index==0){
                // Insert at the first position
                resizeArray();
                masterArray[0]=item;
            }else{
                resizeArray();

                for(int i=size-1;i>=index;i--){
                    masterArray[i] = masterArray[i-1];
                }
                masterArray[index]=item;
            }
        }
    }

    /**
     * OPERATION:
     * Reversing the array
     */
    public void reverseArray(){

        int temp = 0;
        for(int i=0 ; i<size/2;i++){
            temp = masterArray[i];
            masterArray[i] = masterArray[size - i - 1];
            masterArray[size - i - 1] = temp;
        }
    }
    /**
     * ********************* ARRAY OPERATIONS *********************
     */


    /**
     * ********************* HELPER METHODS *********************
     */
    private void resizeArray() {
        // Resizing involves copying all the elements of existing array to new array and add the new item
        int newSize = size+1;
        int[] newArray = new int[newSize];
        for (int i=0 ; i< masterArray.length ; i++){
            newArray[i]= masterArray[i];
        }
        // Reset the size
        size = newSize;
        // Reset the new array
        masterArray = newArray;
    }

    private void addNewElement(int value) {
        masterArray[currentIndex] = value;
        currentIndex++;
    }
    /**
     * ********************* HELPER METHODS *********************
     */



}
