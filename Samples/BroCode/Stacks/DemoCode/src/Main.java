import java.util.Stack;

public class Main {

    /**
     * STACK is a LIFO data structure:
     * <*> Elements are added to the stack from the top.
     * <*> Elements are removed also from the top of the stack.
     * **** First element inserted is the last element to be removed from the stact
     */

    public static void main(String[] args) {
        System.out.println("Demo for the stacks");

        Stack<String> stack = new Stack<>();
        stack.push("Movie-1");
        stack.push("Movie-2");
        stack.push("Movie-3");
        stack.push("Movie-4");
        System.out.println("Is stack empty:-> "+stack.isEmpty());
        System.out.println("Items of the stack:-> "+stack);
        System.out.println("------------------------------------------");
        if(!stack.isEmpty()) {
            System.out.println("Searching for a element in the stack");
            int position = stack.search("Movie-1");
            System.out.println("Element is found at position:->"+position);
        }
        System.out.println("------------------------------------------");
        if(!stack.isEmpty()) {
            System.out.println("Item removed from the stack:-> "+stack.pop());
        }
        System.out.println("------------------------------------------");
        if(!stack.isEmpty()) {
            System.out.println("Check the element from the top of the stack:-> "+stack.peek());
        }
    }

}