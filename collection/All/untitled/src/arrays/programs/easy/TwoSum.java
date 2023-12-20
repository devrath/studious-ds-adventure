package arrays.programs.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    int[] inputArray = new int[]{3,3};
    int target = 6;


    public TwoSum(){
        // Result container
        int[] answer = new int[]{0,0};

        Map<Integer,Integer> collection = new HashMap<>();

        // Add all elements to hashmap
        for(int i=0 ; i<inputArray.length ; i++){
            collection.put(inputArray[i],i);
        }

        // Loop the input array
        for(int i=0 ; i<inputArray.length ; i++){
            // Current element is loop
            int currentItem = inputArray[i];
            // Result = (Target - CurrentElementInLoop)
            int result=target-currentItem;
            // If the hashmap contains result, We found hte answer
            if(collection.containsKey(result)){
                //Get the index from the collection
                int secondIndex = collection.get(result);
                // Handle duplicate scenario
                if(secondIndex!=i){
                    answer[0] = i;
                    answer[1] = secondIndex;
                }
            }
        }

        System.out.println(Arrays.toString(Arrays.stream(answer).toArray()));

    }

}
