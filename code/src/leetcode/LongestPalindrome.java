package leetcode;

public class LongestPalindrome {

    public String initiate(String s) {

        if(s==null){
            // Since the string is null - return the empty string
            return "";
        }else if(s.length()==1){
            // Since its just one character - It itself is the palindrome
            return s;
        }

        String LPS = "" ;

        // Two possibilities - Palindrome can be even or odd
        // Loop the entire string one character by character and apply the logic
        for(int i=1 ; i<s.length() ; i++){

            // POSSIBILITY - Palindrome is even number
            int lPnt = i;
            int rPnt = i;

            while(s.charAt(lPnt)==s.charAt(rPnt)){
                // <----- It's a palindrome ----->

                // Assign it - > First scenario
                if(LPS.equalsIgnoreCase("")){
                    LPS = String.valueOf(s.charAt(lPnt));
                }

                // Now check if next possible iteration is a palindrome
                int nextLPoint = lPnt-1;
                int nextRPoint = rPnt+1;
                if(nextLPoint<0 || nextRPoint==s.length()){
                    break;
                }else{
                    lPnt--;
                    rPnt++;
                }
            }

            // Final substring
            String oddNewSubString = s.substring(lPnt,rPnt);
            if(oddNewSubString.length()>LPS.length()){
                LPS = oddNewSubString;
            }



        }

        return LPS;
    }
}
