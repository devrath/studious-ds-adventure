package stacks.programs;

import java.util.Stack;

public class ReversingString {

    String initialString = "Hello";
    public ReversingString() {
        inititate();
    }

    private void inititate() {

        Stack<Character> stringStack = new Stack<>();

        for(int i=0 ; i<initialString.length() ; i++){
            stringStack.push(initialString.charAt(i));
        }

        StringBuffer strBuff = new StringBuffer();

        while(!stringStack.empty()){
            strBuff.append(stringStack.pop());
        }


        System.out.println("Initial String---> "+initialString);
        System.out.println("Final String---> "+strBuff.toString());
    }


}
