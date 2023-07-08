package hashTables.udemy;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

    private static String firstNonRepeatingChar(String input) {

        if(input==null){
            return null;
        }else{
            char[] inputToProcess = input.toCharArray();
            HashMap<Character,Integer> inpColl = new HashMap<>();

            if(inputToProcess.length==0){
                return null;
            }else{

                for (int i=0 ; i<inputToProcess.length ; i++) {
                    char value = inputToProcess[i];
                    boolean isElementExist = inpColl.containsKey(value);
                    if(isElementExist){
                        // Value exist
                        inpColl.remove(value);
                    }else{
                        // Value does not exist
                        inpColl.put(value,i);
                    }
                }
                
                if(inpColl.size()==0){
                    return null;
                }else{
                    int index = 0;
                    String result = "";
                    for (Map.Entry<Character,Integer> item :inpColl.entrySet()) {
                        Character key = item.getKey();
                        Integer value = item.getValue();
                        if(value == 0){
                            // First iteration
                            index = value;
                            result = String.valueOf(key);
                        }else{
                            if(value<index){
                                index = value;
                                result = String.valueOf(key);
                            }
                        }
                    }
                    return result;
                }
            }
        }
    }

}
