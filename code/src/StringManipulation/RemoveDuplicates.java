package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    String input = "Trees are beautiful";

    public String initiate() {

        Set<Character> set = new HashSet<>();
        StringBuffer strBuff = new StringBuffer();

        for (Character ch : input.toCharArray()) {
            if(!set.contains(ch)){
                set.add(ch);
                strBuff.append(ch);
            }
        }

        return strBuff.toString();
    }


}
