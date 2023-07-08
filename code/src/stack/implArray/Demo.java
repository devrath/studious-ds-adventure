package stack.implArray;

public class Demo {

    public static void main(String[] args){

        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.display();
        System.out.println("Result-Peek->"+arrayStack.peek());

    }

}
