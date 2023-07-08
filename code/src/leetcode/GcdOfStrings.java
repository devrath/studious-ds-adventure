package leetcode;

public class GcdOfStrings {

    public String initiate(String str1, String str2) {
        return recursiveCalculation(str1,str2);
    }

    /**
     * Recursion is used to solve this problem
     * @param str1
     * @param str2
     * @return
     */
    private String recursiveCalculation(String str1, String str2) {

        // Base Condition
        if(str1.equals(str2)){
            // If both strings are equal then return str1
            return str1;
        }

        // Condition: left string length must be higher than right
        // If its not higher switch the strings

        String tempStr1 = "";
        String tempStr2 = "";

        if(str1.length()>str2.length()){
            // Don't switch the strings
            tempStr1 = str1;
            tempStr2 = str2;
        }else{
            // Switch the strings
            tempStr1 = str2;
            tempStr2 = str1;
        }

        // Check if "SECOND" string is first prefix string of "FIRST" string
        String subString = tempStr1.substring(0,tempStr2.length());
        if(subString.equals(tempStr2)){
            // Subtract "STRING-2" from "STRING-1"
            String subtractedFirstStr = tempStr1.substring(tempStr2.length(),tempStr1.length());
            return recursiveCalculation(subtractedFirstStr,tempStr2);
        }

        return "";
    }

}
