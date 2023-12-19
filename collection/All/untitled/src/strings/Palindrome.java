package strings;

public class Palindrome {


    String input = "ABBA";


    public Palindrome() {

        int inputSize = input.length();
        boolean isPalindrome = false;

        if(inputSize==0 || inputSize==1){
            // Empty String or a string with just one character is a palindrome
            isPalindrome = true;
        }else{
            // More than one character is present
            int left = 0;
            int right = inputSize-1;
            while(left<=right){
                if(input.charAt(left)==input.charAt(right)){
                    isPalindrome = true;
                }else{
                    isPalindrome = false;
                    break;
                }
                // Move pointers accordingly
                left++;
                right--;
            }
        }

        System.out.println("Palindrome:-> "+isPalindrome);
    }


}
