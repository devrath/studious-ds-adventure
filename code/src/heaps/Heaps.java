package heaps;

public class Heaps {

    private int[] items = new int[10];
    private int size = 0;

    /** ****************** OPERATIONS ****************** **/

    public void insert(int value){
        if(isFull()){
            throw new IllegalStateException("Array is full");
        }else{
            items[size] = value;
            size++;
            bubbleUp();
        }
    }

    public void remove(){
        // If the heap is empty, Throw an exception
        if(size==0){
            throw new IllegalArgumentException("Heap is empty");
        }

        // <------ We always remove the top element ------>
        // <*> Copy the value of last node into the root node
        items[0] = items[size-1];
        // <*> Decrement the size since last node is not needed
        size--;
        // <*> Execute bubble down operation so the element bubbles down to proper position
        //     If the item in the root is smaller than its children, we need to bubble it down
        int currentParentIndex = 0;
        while( currentParentIndex<=size && isParentInvalid(currentParentIndex)){
            // Here its is invalid parent
            // Now we need to determine which child is larger
            int largerChildIndex = largerChildIndex(currentParentIndex);
            // Swap elements
            swap(currentParentIndex,largerChildIndex);
            // reset the index
            currentParentIndex = largerChildIndex;
        }


    }

    /** ****************** OPERATIONS ****************** **/

    private boolean isParentInvalid(int currentParentIndex){

        // If left child is not there, No children are present and parent is valid
        if(!hasLeftChild(currentParentIndex)){
            return true;
        }

        // If right child is not there - Check if left child is greater than parent child
        if(!hasRightChild(currentParentIndex)){
            return items[currentParentIndex]<leftChild(currentParentIndex);
        }

        // Both left child and right child are present - So make perform a AND condition
        return items[currentParentIndex]<leftChild(currentParentIndex) &&
                items[currentParentIndex]<rightChild(currentParentIndex);
    }

    private boolean hasLeftChild(int parentIndex){
        if(getLeftItemIndex(parentIndex)<=size){
            return true;
        }else{
            return false;
        }
    }

    private boolean hasRightChild(int parentIndex){
        if(getRightItemIndex(parentIndex)<=size){
            return true;
        }else{
            return false;
        }
    }

    private int largerChildIndex(int currentParentIndex) {
        // We check if there is left child ->
        // If left child is not there are no children, Since we add items from left to the right
        if(!hasLeftChild(currentParentIndex)){
            return currentParentIndex;
        }

        // If right child is not there just return left child index
        if(!hasRightChild(currentParentIndex)){
            return getLeftItemIndex(currentParentIndex);
        }


        if(leftChild(currentParentIndex)>rightChild(currentParentIndex)){
            return getLeftItemIndex(currentParentIndex);
        }else{
            return getRightItemIndex(currentParentIndex);
        }
    }

    private int leftChild(int index){
        return items[getLeftItemIndex(index)];
    }

    private int rightChild(int index){
        return items[getRightItemIndex(index)];
    }

    private int getLeftItemIndex(int parentIndex){
        int result = (parentIndex*2)+1;
        return result;
    }

    private int getRightItemIndex(int parentIndex){
        int result = (parentIndex*2)+2;
        return result;
    }


    private void bubbleUp(){
        // If (new item inserted > parent) --> bubble up until it reaches to right position
        int insertedItemIndex = size-1;
        while(
                insertedItemIndex > 0 &&
                        items[insertedItemIndex] > items[parentIndex(insertedItemIndex)]
        ){
            // Breaking condition is until the insertedItemIndex is greater than 0
            // <----- Bubble up the number - Swapping logic ----->
            // Swap items
            swap(insertedItemIndex,parentIndex(insertedItemIndex));
            // Set the index to parent index
            insertedItemIndex = parentIndex(insertedItemIndex);
        }
    }

    private boolean isFull() {
        return size == items.length;
    }

    private int parentIndex(int index){
        return (index-1)/2;
    }

    private void swap(int first, int second){
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

}
