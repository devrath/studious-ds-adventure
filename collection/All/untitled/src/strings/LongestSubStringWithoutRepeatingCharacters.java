package strings;


import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {

    String input = "pwwkew";

    public LongestSubStringWithoutRepeatingCharacters(){

        Map<Character,Integer> visitedCharacters = new HashMap<>();

        int left = 0;
        int size = input.length();
        int max = 0;

        // Keep looping until the right pointer reaches to the end of the loop
        for (int right = 0; right < size; right++) {
            // Current character
            char currentCharacter = input.charAt(right);

            if(
                    // If we have visited the characters before
                    visitedCharacters.containsKey(currentCharacter) &&
                    // If the current character position is also part of substring window we are currently at
                    visitedCharacters.get(currentCharacter)>=left
            ){
                // Move the left pointer one past where that repeating character is
                left = visitedCharacters.get(currentCharacter)+1;
            }

            // We added plus one because both pointers may point to same character
            max = Math.max(max,right-left+1);
            // Regardless add the next character indicating / updating the position of character
            visitedCharacters.put(currentCharacter,right);
        }

        System.out.println("Result:-> "+max);

    }

}
