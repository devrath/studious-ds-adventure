package hashTables.mosh;

import java.util.HashMap;

public class FindFirstNonRepeatingChar {

    private String input = "A green apple";

    public Character initiate(){

        HashMap<Character,Integer> ourSet = new HashMap<>();

        for (Character ch: input.toLowerCase().toCharArray()) {
            if(!ch.toString().isEmpty()){
                // Ignore the empty characters
                if(!ourSet.containsKey(ch)){
                    // If it does not contain the key ---> Then add it
                    ourSet.put(ch,1);
                }else{
                    // GE the key that it already contains and fetch the count of it
                    int count = ourSet.get(ch);
                    ourSet.put(ch,count+1);
                }
            }
        }

        char character = '$';
        for (Character ch: input.toLowerCase().toCharArray()) {
            int count = ourSet.get(ch);
            if(count==1){
                character = ch;
                break;
            }
        }

        return character;
    }

}
