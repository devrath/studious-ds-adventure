package heap;

public class BuildHeap {

    // INPUT :-> [20,10,15,4,5]
    private int[] collection= new int[10];
    // Variable to keep track of number of elements in heap
    private int size;


    public void insert(int value){

        if(size==collection.length){
            return;
        }

        // Just insert the value
        collection[size++] = value;
        /**
         * ** Perform bubble-up operation **
         * ** Description:-> If this new item we are inserting is greater than parent, Then we must implement bubble up operation
         */
        int indexOfInsertedItem = size-1;
        // Performing bubbling up operation -> Until index the largest value if bubbles up 
        while(collection[indexOfInsertedItem] > collection[getParentIndex(indexOfInsertedItem)]) {
            swapValues(indexOfInsertedItem,getParentIndex(indexOfInsertedItem));
            // We need to re-calculate the index
            indexOfInsertedItem = getParentIndex(indexOfInsertedItem);
        }

    }

    private void swapValues(int indexOfInsertedItem, int indexOfParent) {
        int temp = collection[indexOfInsertedItem];
        collection[indexOfInsertedItem] = collection[indexOfParent];
        collection[indexOfParent]=temp;
    }

    /** Calculating the parent index **/
    private int getParentIndex(int childIndex){
        int result = (childIndex-1)/2;
        return result;
    }

    /** Calculating the child index **/
    private int getChildIndex(int parentIndex, boolean isLeft){

        int result = 0;

        if(isLeft){
            result = parentIndex * 2 + 1;
        }else{
            result = parentIndex * 2 + 2;
        }

        return result;
    }

    public void printOutput() {
        for (int obj : collection){
            System.out.print(obj);
            System.out.print("-");
        }
    }


}