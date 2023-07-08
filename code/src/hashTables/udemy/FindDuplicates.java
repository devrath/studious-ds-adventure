package hashTables.udemy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

    private static List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicated = new ArrayList<>();

        HashMap<Integer,Boolean> data = new HashMap<>();

        for(int value : nums){
            if(data.size()==0){
                data.put(value,true);
            }else{
                if(data.get(value)==null){
                    // If Value does not exist - add it
                    data.put(value,true);
                }else{
                    duplicated.add(value);
                }
            }

        }

        return duplicated;
    }
}
