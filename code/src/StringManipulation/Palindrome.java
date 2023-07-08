package StringManipulation;

import java.util.Stack;

public class Palindrome {

    String input = "ABCA";

    public boolean initiate() {

        Stack<Character> ip = new Stack<>();

        for (Character ch : input.toCharArray()) {
            ip.push(ch);
        }

        StringBuilder strBuild = new StringBuilder();

        while(!ip.isEmpty()){
            strBuild.append(ip.pop());
        }

        if(input.equals(strBuild.toString())){
            return true;
        }else{
            return false;
        }

    }

}
