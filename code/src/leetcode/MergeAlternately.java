package leetcode;

public class MergeAlternately {


    public String initiate(String word1, String word2) {

        StringBuffer strBuff = new StringBuffer();
        // This tracks the position of the index which is used to get the character of each word
        int position =  0;

        // Until the position is less than either of word1-length or word2-length
        while (position<word1.length() || position<word2.length()){

            // If the position is less than word1-length
            if(position<word1.length()){
                strBuff.append(word1.charAt(position));
            }

            // If the position is less than word2-length
            if(position<word2.length()){
                strBuff.append(word2.charAt(position));
            }

            // Increment position at each iteration
            position++;
        }

        return strBuff.toString();
    }


}
