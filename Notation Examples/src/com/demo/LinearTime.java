package com.demo;

public class LinearTime {

    public void program1(int[] numbers){

        for (int i=0 ; i<numbers.length ; i++){ // O(n)
            System.out.println(numbers[i]);
        }

        // Runtime Complexity = O(n)
        // Here the number of print statements depends on the size of the input
        // So the complexity is order of N

    }

}
