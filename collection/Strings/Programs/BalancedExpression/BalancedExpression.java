package strings;

import java.util.Stack;

public class BalancedExpression {

    String input = "(1+2}";
    public BalancedExpression() {
        System.out.println("Balanced expression --> "+inititate());
    }

    private boolean inititate() {

        Stack<Character> collection = new Stack<>();

        for (int i=0 ; i<input.toCharArray().length ; i++){
            char currentChar = input.charAt(i);

            // If open bracket ---> Add to collection
            if(isItOpeningBrackets(currentChar)){
                // Logic is to add matching closing bracket
                collection.add(getMatchingClosingBracket(currentChar));
            }

            if(isItClosingBrackets(currentChar) && collection.isEmpty()){
                // No open brackets are found, and we encountered a closing bracket
                // So it is not balanced
                return false;
            }

            if(isItClosingBrackets(currentChar)){
                // On each pop one item will get removed from stack collection
                char currentPoppedItem = collection.pop();
                if(currentPoppedItem!=currentChar){
                    return false;
                }
            }

        }

        // At this moment -> Stack should be empty if it is valid balanced expression --> Else its imbalanced expression
        return collection.isEmpty();
    }

    /**
     * Determine if it is a opening bracket
     */
    private boolean isItOpeningBrackets(Character character) {

        if(character == '('){
            return true;
        }else if(character == '['){
            return true;
        }else if(character == '<'){
            return true;
        }else if(character == '{'){
            return true;
        }

        return false;
    }

    /**
     * Determine if it is a closing bracket
     */
    private boolean isItClosingBrackets(Character character) {

        if(character == ')'){
            return true;
        }else if(character == ']'){
            return true;
        }else if(character == '>'){
            return true;
        }else if(character == '}'){
            return true;
        }

        return false;
    }


    /**
     * For each opening bracket, return a corresponding matching closing bracket
     */
    private char getMatchingClosingBracket(Character character) {
        if(character == '('){
            return ')';
        }else if(character == '['){
            return ']';
        }else if(character == '<'){
            return '>';
        }else if(character == '{'){
            return '}';
        }
        return 0;
    }


}
