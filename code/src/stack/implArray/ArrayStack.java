package stack.implArray;

public class ArrayStack {

    private int[] mainArray;
    private int itemCount;

    ArrayStack(){
        mainArray = new int[0];
        itemCount = mainArray.length;
    }


    /**
     * Displaying the elements of the array
     */
    public void display(){
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("[");
        for (int i=0 ; i<itemCount ; i++){
            strBuff.append(mainArray[i]);
            if(i<itemCount-1){
                strBuff.append(",");
            }
        }
        strBuff.append("]");
        System.out.println(strBuff);
    }

    /**
     * Pushing the element for the stack
     * @param value
     */
    public void push(int value){
        resizeArray();
        mainArray[itemCount] = value;
        itemCount++;
    }

    /**
     * Removing the element from the stack
     */
    public void pop(){
        if(itemCount==0){
            throw new IllegalStateException("There are no element left to delete");
        }else{
            itemCount--;
        }
    }

    /**
     * Checking if the array is empty
     * @return
     */
    public boolean isEmpty(){
        return mainArray.length == 0;
    }

    /**
     * Getting the top element of the array
     * @return
     */
    public int peek(){
        return mainArray[itemCount-1];
    }

    /**
     * Resize the array by increasing the size
     */
    private void resizeArray() {
        int newSize = mainArray.length + 1;
        int[] newArray = new int[newSize];
        for(int i=0 ; i<mainArray.length ; i++){
            newArray[i] = mainArray[i];
        }
        mainArray = newArray;
    }


}
