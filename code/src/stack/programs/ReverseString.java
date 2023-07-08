package stack.programs;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args){
        String input = "Dev";
        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {

        char[] inputArr = input.toCharArray();
        Stack<Character> stackInput = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();

        for (Character ch : inputArr){
            stackInput.push(ch);
        }

        while (!stackInput.isEmpty()){
            stringBuffer.append(stackInput.pop());
        }

        return stringBuffer.toString();
    }

}
