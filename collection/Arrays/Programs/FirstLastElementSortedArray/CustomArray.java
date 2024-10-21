public class CustomArray {

    private int currentPosition = 0;
    private int[] arrayCollection;

    CustomArray(int arraySize){
        arrayCollection = new int[arraySize];
    }

    /**
     * ****************************** OPERATIONS ************************************
     */
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
     * ****************************** OPERATIONS ************************************
     */

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

    /**
     * ****************************** Programs ************************************
     */

    /**
     * PROGRAM: To check if the array contains duplicate elements
     */
    public boolean containsDuplicate(){
        /**
         * ALGORITHM:
         * 1) Start with first item & compare it with rest of the remaining items
         * 2) Then do it for next item and so on for all the remaining items
         */
        boolean containsDuplicate = false;
        for(int i=0 ; i<getArraySize() ; i++){
            int itemToCompare = arrayCollection[i];
            for(int j=i+1 ; j<getArraySize() ; j++){
                int itemToCompareWith = arrayCollection[j];
                if (itemToCompare == itemToCompareWith){
                    // Duplicate found
                    containsDuplicate = true;
                    break; // Do not loop further in inner loop since the duplicate is already found
                }
            }
            if(containsDuplicate){
                break; // Do not loop further in outer loop since the duplicate is already found
            }
        }
        return containsDuplicate;
    }


}
