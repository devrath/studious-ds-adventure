package leetcode;

import java.util.Stack;

public class IsPalindrome {


    public boolean initiate(int x) {

        Stack<Character> stCh = new Stack<>();
        String initialStrVal = String.valueOf(x);
        char[] ip = initialStrVal.toCharArray();

        for (char ch : ip) {
            stCh.push(ch);
        }

        StringBuffer strBuf = new StringBuffer();

        while (!stCh.isEmpty()){
            strBuf.append(stCh.pop());
        }

        String finalStrVal = strBuf.toString();

        if(initialStrVal.equals(finalStrVal)){
            return true;
        }else {
            return false;
        }

    }

}
