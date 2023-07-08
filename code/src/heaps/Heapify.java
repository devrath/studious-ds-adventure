package heaps;

public class Heapify {

    public void performHeapify(int[] input) {

        if(input.length==0){
            throw new IllegalStateException("Invalid operation");
        }

        for(int i=0 ; i<input.length ; i++) {
            // Perform recursion for each element in the array
            bubbleDownItem(input,i);
        }
    }

    private void bubbleDownItem(int[] input, int parentIndex) {
        // Here we bubble down item until the element reaches the appropriate position
        // <---->
        // Here we need to check and see if the item is smaller than children
        // If the Item(parent) is smaller, Then swap with the larger child

        // ***************** Calculate the larger index *****************
        int largerIndex = parentIndex; // Initially we assume item passed is the largest index

        int leftChildIndex = parentIndex * 2 + 1;
        int rightChildIndex = parentIndex * 2 + 2;

        if(leftChildIndex<input.length){
            if(input[leftChildIndex] > input[largerIndex]){
                largerIndex = leftChildIndex;
            }
        }

        if(rightChildIndex<input.length){
            if(input[rightChildIndex] > input[largerIndex]){
                largerIndex = rightChildIndex;
            }
        }
        // ***************** Calculate the larger index *****************

        // It is also possible that, element we are working with is greater than both of the children
        if(parentIndex == largerIndex){
            // item is in right position
            return;
        }

        // If the control comes till here, We perform swapping
        swap(input,parentIndex,largerIndex);
        // We pass largerIndex because the item at parentIndex is now at largerIndex
        bubbleDownItem(input,largerIndex);
    }

    private void swap(int[] input, int parentIndex, int largerIndex) {
        int temp = input[parentIndex];
        input[parentIndex] = input[largerIndex];
        input[largerIndex] = temp;
    }
}
