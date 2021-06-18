package com.demo;

public class CustomArray {

    private int[] items;
    private int count=0;

    public CustomArray(int size) {
        items = new int[size];
    }

    // OPERATION: Insertion
    public void insert(int item) {
       // If the array is full, resize it
        if(items.length==count){
            // Create a new array (Size is twice of existing array)
            int[] newItems = new int[count*2];
            // Copy the items to the new array
            for(int i=0 ; i<count ; i++){
                newItems[i] = items[i];
            }
            newItems[count++] = item;
            // Set items to this new array | - > Without this step we might get array index out of bound
            items = newItems;
        }else{
            // Add the item to the end of the array
            items[count++] = item;
        }
    }

    // OPERATION: Deletion
    public void removeAt(int index) {
        // Validate the INDEX.
        // If index input = -1 ..... This does not make any sense to remove the element at -1.
        // If index value is equal to size of array or more than it ... we can't remove the element here since there are no elements.
        // --- // Shift the element to the left, This will remove the element.
        if(index<0){
            // If index input = -1 ..... This does not make any sense to remove the element at -1.
            System.out.println("Enter a valid index");
        }else if (index>=count){
            // If index value is equal to size of array or more than it ... we can't remove the element here since there are no elements.
            System.out.println("Enter a valid index");
        }else{
            // Loop from the index that you want to remove
            for(int i=index ; i<count ; i++){
                // Shift the elements
                items[i] = items[i+1];
            }
        }
        count--;
    }

    // OPERATION: Display
    public void display() {
        // System.out.println(Arrays.toString(items));
        System.out.print("[");
        int itemsPrinted = 0;
        for(int i=0 ; i<count ; i++){
            System.out.print(items[i]);
            if(itemsPrinted<count-1){
                System.out.print(",");
            }
            itemsPrinted++;
        }
        System.out.print("]");
    }

    // OPERATION: Search
    public void indexOf(int item) {
        // We will loop the array - If we find the item then we return the index, Else we will return -1
        for (int i=0 ; i<count ; i++) {
            if(items[i] == item){
                System.out.println("Item is found at position: "+i);
            }
        }
        System.out.println("Item is found at position: -1");
    }

}
