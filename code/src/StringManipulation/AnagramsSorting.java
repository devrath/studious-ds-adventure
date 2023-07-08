package StringManipulation;

import java.util.Arrays;

public class AnagramsSorting {

    public boolean isAnagram(String str1, String str2){

        // One of strings might be null -> return false
        // Lengths might not be equal -> return false
        if((str1 == null) || (str2 == null) || str1.length()!=str2.length()){
            return false;
        }

        // Convert into array
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        // Sort the array
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        // Check if both arrays are equal
        return Arrays.equals(str1Arr,str2Arr);
    }

}
