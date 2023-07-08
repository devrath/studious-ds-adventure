package hashTables.udemy;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueChars {

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */

    }

    private static boolean hasUniqueChars(String input) {

        char[] inputArray = input.toCharArray();
        Set<Character> setArr = new HashSet<>();

        boolean hasUniqueElements = true;
        for (char inp:inputArray) {
            if(setArr.contains(inp)){
                hasUniqueElements = false;
                break;
            }
            setArr.add(inp);
        }

        return hasUniqueElements;
    }

}
