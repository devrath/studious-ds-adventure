package StringManipulation;

import java.util.HashMap;

public class CountVowels {


    private String input = "hello";

    public void initiate(){

        HashMap<Character,Integer> dataSet = new HashMap<>();

        for ( Character ch : input.toLowerCase().toCharArray() ) {
            if(!ch.toString().isEmpty()){
                if(isVowels(ch)){
                    if(dataSet.containsKey(ch)){
                        // Increment it
                        int currentCnt = dataSet.get(ch);
                        dataSet.put(ch,currentCnt+1);
                    }else{
                        // Add for the first time
                        dataSet.put(ch,1);
                    }
                }
            }
        }

        int counter = 0;
        for (Character key : dataSet.keySet() ) {
            counter = counter + dataSet.get(key);
        }

        System.out.println("Result:-> "+ counter);

    }

    private boolean isVowels(Character ch) {
        String str = ch.toString();
        // Vowels = "a,e,i,o,u"
        if(str.equals("a") || str.equals("e") || str.equals("i")
                || str.equals("o") || str.equals("u") ) {
            return true;
        }else{
            return false;
        }
    }

}
