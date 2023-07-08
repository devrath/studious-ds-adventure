package StringManipulation;

public class SentenceCapitalization {

    private String input = "Trees are beautiful";

    public void initiate() {
        // Split the sentence into array of words
        String[] words = input.trim()
                .replaceAll(" +"," ").split(" ");
        // Loop it and capitalize it
        for(int i=0 ; i<words.length ; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        String result = String.join(" ",words);
        System.out.println(result);
    }


}
