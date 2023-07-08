package leetcode;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int initiate(String s) {

       int left = 0;
       int right = 0;
       int maxValue = 0;
       char[] ipArr = s.toCharArray();
       HashSet<Character> ourSet = new HashSet<>();

       while (right<ipArr.length){
           char currCharacter = ipArr[right];

           if(ourSet.add(currCharacter)){
               // Here we add value to the SET
               // Calculate the max value - We add plus 1 because (Consider in first iteration value is 0)
               maxValue = Math.max(maxValue,(right - left + 1));
               // increment the right pointer
               right++;
           }else{
               // We found the duplicate character here
                while (ipArr[left]!=currCharacter){
                    // We remove the character from the set
                    ourSet.remove(ipArr[left]);
                    // Increment left pointer
                    left++;
                }
                // Once the while loop is complete the left pointer will reach the actual duplicate character
                ourSet.remove(currCharacter);
                left++;
           }
       }

       return maxValue;
    }

}
