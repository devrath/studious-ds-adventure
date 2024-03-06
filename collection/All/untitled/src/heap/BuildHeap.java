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

    public void remove(){
        // Logic:
        // 1> We remove the root node.
        // 2> Move the last node to root node.
        // 3> We apply bubble down operation so that the largest node remains at the top.



        // 1> We remove the root node.
        // 2> Move the last node to root node.
        collection[0] = collection[size-1];//-> We combined the steps 1 and 2
        size--;


        // If item(root) < children ==> BubbleDown
        int temp = 0;
        while (temp<=size && areParentsLesser(temp)){
            // Swap with the larger child
            int leftChildValue = collection[getChildIndex(temp,true)];
            int rightChildValue = collection[getChildIndex(temp,false)];
            if(leftChildValue>rightChildValue){
                // Left is greater ----> So Exchange parent with leftItem
                swapValues(temp,getChildIndex(temp,true));
            }else{
                // Right is greater ----> So Exchange parent with rightItem
                swapValues(temp,getChildIndex(temp,false));
            }
        }

    }

    public boolean areParentsLesser(int parent){
        int parentValue = collection[parent];
        int leftChildValue = collection[getChildIndex(parent,true)];
        int rightChildValue = collection[getChildIndex(parent,false)];

        return parent < leftChildValue && parent < rightChildValue;
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