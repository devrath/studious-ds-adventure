public class CustomArray {

    private int currentPosition = 0;
    private int[] arrayCollection;

    CustomArray(int arraySize){
        arrayCollection = new int[arraySize];
    }

    /**
     * OPERATION: Getting the total size of array
     * @return int
     */
    public int getArraySize() {
        return arrayCollection.length;
    }


    /**
     * OPERATION: Print the elements in array
     */
    public void displayElements() {
        System.out.println("<====================================>");
        if(currentPosition==0){
            System.out.println("No elements are currently inserted");
        }
        System.out.print("Elements are --> ");
        for (int i=0; i<currentPosition ; i++){
            System.out.print(arrayCollection[i]); // Print element
            if(i<currentPosition-1){
                System.out.print("-"); // Print add dash in the last position
            }
        }
        System.out.print("\n");
        System.out.println("<====================================>");
    }


    /**
     * OPERATION: Insert the element into the array
     * @param value
     */
    public void insert(int value) {

        // Check for the empty array
        if(getArraySize()==0){
            throw new IllegalStateException("Size of the array is zero");
        }

        // Check if the array is full
        if(getArraySize()==currentPosition){
            resizingOperation(); // we need to resize
        }

        arrayCollection[currentPosition] = value; // Add the new value
        currentPosition++; // Increment the position
    }

    /**
     * OPERATION: Deleting the element from an array based on value
     */
    public void deleteByValue(int value) {
        // Check if the array is empty
        if(getArraySize()==0){
            throw new IllegalStateException("Not elements are present in array to delete");
        }

        // Check if the value is prent in array to be deleted
        boolean isElementFound = false;
        int tempPosition = 0;
        for(int i=0; i<getArraySize(); i++){
            // We reached to end of the array & still didn't find the element
            if(tempPosition == getArraySize()){
                break;
            }
            // Element to be deleted is found
            if(arrayCollection[i] == value){
                // Element found
                isElementFound = true;
                // Shift positions to left
                for (int j=tempPosition; (tempPosition+1)<getArraySize(); tempPosition++){
                    arrayCollection[tempPosition] = arrayCollection[tempPosition+1];
                }
                // Decrement positions since one element is deleted
                currentPosition--;
                // Break out of the loop
                break;
            }

            tempPosition++;
        }

        if(!isElementFound){
            throw new IllegalStateException("Element not found: So Deletion cannot be done");
        }
    }


    /**
     * OPERATION: Deleting the element from an array based on index
     */
    public void deleteByIndex(int indexToDelete) {

        if(indexToDelete>=currentPosition || indexToDelete<0){
            throw new IllegalStateException("Invalid position te delete");
        }

        int temp = indexToDelete;
        for (int i=temp ; (temp+1)<getArraySize(); temp++){
            arrayCollection[temp] = arrayCollection[temp+1];
        }

        currentPosition--;
    }


    /**
     * Helpers: Resizing(increasing) the array
     */
    private void resizingOperation() {
        currentPosition = 0; // Set the current position to 0 since we resize the array
        int[] oldCollection = arrayCollection; // Store the old reference
        int newSize = arrayCollection.length + getArraySize(); // Determine the new size
        arrayCollection = new int[newSize]; // Create a new array with new size
        for(int i=0 ; i<oldCollection.length ; i++){
            arrayCollection[i] = oldCollection[i]; // Copy the element
            currentPosition++; // Update the position
        }
    }


}
