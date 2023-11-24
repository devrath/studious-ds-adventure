package strings;

import java.util.Stack;

public class BalancedExpression {
    // In our demo we shall support for 2 characters
    String input = "[{}]";
    public BalancedExpression() {
        inititate();
        System.out.println("Balanced expression --> "+inititate());
    }

    private boolean inititate() {

        Stack<Character> expStack = new Stack<>();

        if(input.isEmpty()){
            return true;
        }else{
            for(int i=0 ; i<input.length() ; i++){
                if((input.charAt(i)=='[')){
                    expStack.push(']');
                }else if((input.charAt(i)=='{')){
                    expStack.push('}');
                }else{
                    if(expStack.isEmpty()){
                        // No opening brackets are found - so indicate that expression is not balanced
                        return false;
                    }else if(expStack.pop()!=input.charAt(i)){
                        // As soon we encounter a mismatch b/w popped item and looping item, We return false, Since it will not be balanced
                        return false;
                    }
                }
            }
        }

        // If the stack is empty, Then expression is balanced -- > Since all elements are poped
        return expStack.isEmpty();
    }


}
