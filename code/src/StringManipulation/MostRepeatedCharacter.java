package StringManipulation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {

    String input = "Trees are beautiful";

    public void initiate() {

        HashMap<Character,Integer> map = new HashMap<>();

        for (Character ch:input.toCharArray()) {
            if(map.containsKey(ch)){
                int currNo = map.get(ch);
                int newValue = currNo+1;
                map.put(ch,newValue);
            }else{
                map.put(ch,1);
            }
        }

        int maxValueInMap=(Collections.max(map.values()));

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }

    }

}
