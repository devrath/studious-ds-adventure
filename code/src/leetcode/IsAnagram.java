package leetcode;

import java.util.HashMap;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> dataSet = new HashMap<>();

        for (int i=0 ; i<s.length() ; i++){

            Character currChar = s.charAt(i);
            if(dataSet.containsKey(currChar)){
                // It's an existing value
                int existingValue = dataSet.get(currChar);
                existingValue = existingValue + 1;
                dataSet.put(currChar,existingValue);
            }else{
                // It's a new value
                dataSet.put(currChar,1);
            }

        }

        for (int i=0 ; i<t.length() ; i++){
            Character currChar = t.charAt(i);
            if(dataSet.containsKey(currChar)){
                int existingValue = dataSet.get(currChar);
                if(existingValue==1){
                    dataSet.remove(currChar);
                }else{
                    int newValue = existingValue - 1 ;
                    dataSet.put(currChar,newValue);
                }
            }else{
                dataSet.put(currChar,1);
            }
        }

        return dataSet.isEmpty();
    }

}
