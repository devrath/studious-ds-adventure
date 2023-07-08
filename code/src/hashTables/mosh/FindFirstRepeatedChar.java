package hashTables.mosh;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedChar {

    private String input = "A green apple";

    public void initiate(){

        Set<Character> coll = new HashSet<>();

        for (Character ch:input.toLowerCase().toCharArray()) {
            if(coll.contains(ch)){
                System.out.println("Result:--> "+ch);
                break;
            }else{
                coll.add(ch);
            }
        }

    }

}
