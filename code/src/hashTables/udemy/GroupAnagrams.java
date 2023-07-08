package hashTables.udemy;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

    private static ArrayList<List<String>> groupAnagrams(String[] content) {

        Map<String,List<String>> masterSnippets = new HashMap<>();

        for (String value : content) {

            // Prepare key
            char[] key = value.toCharArray();
            Arrays.sort(key);
            String keyStr = new String(key);

            // check if there is the key
            boolean isKeyPresent = masterSnippets.containsKey(keyStr);

            if(isKeyPresent){
                // key is present so retrieve it and append it
                List<String> contentLst = masterSnippets.get(keyStr);
                contentLst.add(value);
                masterSnippets.put(keyStr,contentLst);
            }else{
                // key is not present so add a new entry
                List<String> contentLst = new ArrayList<>();
                contentLst.add(value);
                masterSnippets.put(keyStr,contentLst);
            }
        }

        return new ArrayList<>(masterSnippets.values());
    }

}
