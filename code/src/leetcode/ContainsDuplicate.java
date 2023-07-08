package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean initiate(int[] ip) {

        Set<Integer> ipSet = new HashSet<>();

        for (int input : ip) {
            if(!ipSet.contains(input)){
                ipSet.add(input);
            }else{
                return true;
            }
        }
        return false;
    }

}
