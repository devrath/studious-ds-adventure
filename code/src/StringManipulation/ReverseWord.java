package StringManipulation;

import java.util.Stack;

public class ReverseWord {

    private String input = "Trees are beautiful";

    public void initiate() {

        Stack<String> strStack = new Stack<>();

        StringBuffer strBuff = new StringBuffer();
        for (Character ch : input.toCharArray()){
            if(ch.toString().trim().isEmpty()){
                strStack.push(strBuff.toString());
                strBuff.setLength(0);
            }else{
                strBuff.append(ch);
            }
        }
        strStack.push(strBuff.toString());
        strBuff.setLength(0);

        while (!strStack.isEmpty()){
            strBuff.append(strStack.pop());
            strBuff.append(" ");
        }

        System.out.println(strBuff);
    }


}
