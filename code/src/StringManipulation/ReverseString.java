package StringManipulation;

import java.util.Stack;

public class ReverseString {


    private String input = "hello";

    public void initiate() {

        Stack<Character> mStack = new Stack<>();

        for (Character ch:input.toCharArray()) {
            mStack.push(ch);
        }

        StringBuffer stBuff = new StringBuffer();
        while (!mStack.isEmpty()){
            stBuff.append(mStack.pop());
        }

        System.out.println(stBuff);

    }

}
