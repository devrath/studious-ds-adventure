package strings;

import java.util.*;

public class GroupAnagrams {

    String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};

    public GroupAnagrams(){


        groupTestAnagrams(input);
    }

    public List<List<String>> groupTestAnagrams(String[] strs) {

        // If the input is null or the size of input string array is zero, Return a empty list
        if(strs==null || strs.length==0){
            return new ArrayList <>();
        }

        Map<String,List<String>> data = new HashMap<>();

        for (String inputStr :  strs) {

            String pattern = generateFrequencyOfaString(inputStr);

            if(data.containsKey(pattern)){
                // If the pattern is found
                List<String> existingStrings = data.get(pattern);
                existingStrings.add(inputStr);

                data.put(pattern,existingStrings);
            }else{
                // If the pattern is not found
                List<String> existingString = new ArrayList<>(Collections.emptyList());
                existingString.add(inputStr);
                data.put(pattern,existingString);
            }

        }

        System.out.println(data.values());

        return new ArrayList<>(data.values());
    }

    private String generateFrequencyOfaString(String input) {

        // Create the buckets for the frequencies
        // There are 26 letters in alphabet 20-buckets in array
        Map<Character,Integer> buckets = new HashMap<>();
        // Iterate over each character in the string
        for(char ch : input.toCharArray()){
            if(buckets.containsKey(ch)){
                // If the character is found 
                int currentCount = buckets.get(ch);
                buckets.put(ch,currentCount++);
            }else{
                // If the character is not found
                buckets.put(ch,1);
            }
        }

        StringBuilder builder = new StringBuilder();
        // Construct the pattern string
        for (Map.Entry<Character,Integer> entry: buckets.entrySet()) {
            Character key = entry.getKey();
            int value = entry.getValue();
            String result = key+value+"";
            builder.append(key + value);
        }

        return builder.toString();
    }



}
