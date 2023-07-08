package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public boolean initiate(String ip) {

        // Input -->  ()[]{}

        char[] ipArr = ip.toCharArray();
        Stack<Character> stackIp = new Stack<>();

        for (Character ch: ipArr) {
            if (ch == '(') {
                stackIp.push(')');
            } else if (ch == '[') {
                stackIp.push(']');
            } else if (ch == '{') {
                stackIp.push('}');
            } else if(stackIp.isEmpty()){
                // Scenario where no opening bracket was added and directly closing bracket is added
                return false;
            }else if(stackIp.pop()!=ch){
                // Last scenario is if popped element is not equal to closing bracket
                return false;
            }
        }

        return stackIp.isEmpty();
    }

}
