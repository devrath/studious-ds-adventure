package recursion;

/**
 * 5! = 5*4*3*1
 */
public class FactorialOfNumber {

    public FactorialOfNumber(int input) {
        // usingLoops(input);
        usingRecursion(input);
    }

    /**
     * METHOD-1: Using recursion to calculate factorial
     */
    private void usingRecursion(int input) {
        int res = recursiveResultCalculation(input);
        System.out.println(res);
    }

    /**
     * METHOD-2: Using iteration to calculate factorial
     */
    private void usingLoops(int input) {

        if((input <= 1)){
            System.out.println("Result:->"+input);
        }else{
            int current = input;
            int result = 1;
            while (current>=1){
                result = result*current;
                current--;
            }
            System.out.println("Result:->"+result);
        }

    }

    /** ********************* Helper functions ********************* **/
    private int recursiveResultCalculation(int input) {
        if (input>1){
            return input * (recursiveResultCalculation(input - 1));
        }else{
            return input;
        }
    }
    /** ********************* Helper functions ********************* **/


}
