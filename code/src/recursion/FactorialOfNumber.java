package recursion;

public class FactorialOfNumber {

    public static void main(String[] args){

        int factorialNum = 4;
        // 4! = 4*3*2*1
        // 3! = 3*2*1
        // 2! = 2*1
        // 1! = 1
        // n = n*(n-1)!
        System.out.println(recursiveFactorial(4));


    }

    private static int calculateFactorial(int n) {

        int factorialResult = 1;

        for(int i=n ; i>1 ; i--){
            factorialResult = factorialResult*i;
        }

        return factorialResult;

    }

    private static int recursiveFactorial(int n) {
        if(n==0){
            return 1;
        }

        return n * recursiveFactorial(n-1);
    }


}
