package hashTables.udemy;

import java.util.*;

public class FindPairs {


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        // Create a set to store unique elements from arr1
        Set<Integer> mySet = new HashSet<>();
        // Create a list to store pairs meeting the conditions
        List<int[]> pairs = new ArrayList<>();

        // Iterate over arr1 and add elements to mySet
        for (int num : arr1) {
            mySet.add(num);
        }

        // Iterate over arr2 and check for pairs with target sum
        for (int num : arr2) {
            // Calculate the complement to reach the target
            int complement = target - num;
            // Check if the complement is in mySet (arr1)
            if (mySet.contains(complement)) {
                // Add the pair (complement, num) to pairs list
                pairs.add(new int[]{complement, num});
            }
        }

        // Return the list of pairs meeting the conditions
        return pairs;
    }

}
