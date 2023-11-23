package strings;

public class ReversingString {

    String initialString = "Hello";
    public ReversingString() {
        System.out.println("Initial:-> "+initialString);
        inititate();
        System.out.println("Final:-> "+initialString);
    }

    private void inititate() {
        char[] items = initialString.toCharArray();
        int rightPointer = initialString.toCharArray().length;
        int leftPointer = 0;

        while(leftPointer<rightPointer){
            exchange(items,leftPointer,rightPointer);
            leftPointer++;
            rightPointer--;
        }
    }

    private void exchange(char[] items, int leftPointer, int rightPointer) {
        char temp = items[leftPointer];
        items[leftPointer] = items[rightPointer];
        items[rightPointer] = temp;
    }


}
