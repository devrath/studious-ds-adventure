package strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    // Indicates number of characters
    int n=2;

    public GenerateParenthesis(){
        List<String> result = new ArrayList<>();
        String initialCharacter = "(";
        int openBracketCount = 1;
        int closedBracketCount = 0;
        int numberOfBrackets = n;
        findAllPatterns(initialCharacter,openBracketCount,closedBracketCount,result,numberOfBrackets);
        System.out.println(result);
    }

    private void findAllPatterns(
            String currentCharacter, int openBracketCount,
            int closedBracketCount, List<String> result, int numberOfBrackets
    ) {

        // Breaking condition
        if(currentCharacter.length()==(numberOfBrackets*2)){
            // If the character length is equal to expected count which is twice of input
            result.add(currentCharacter);
            return;
        }


        if(openBracketCount<numberOfBrackets){
            // There can be minimum of 2 open brackets
            findAllPatterns(currentCharacter+"(",openBracketCount+1,closedBracketCount,result,numberOfBrackets);
        }

        if(closedBracketCount<openBracketCount){
            // There can be open brackets
            findAllPatterns(currentCharacter+")",openBracketCount,closedBracketCount+1,result,numberOfBrackets);
        }

    }


}
