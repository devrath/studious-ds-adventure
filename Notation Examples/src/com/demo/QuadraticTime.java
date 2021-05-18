package com.demo;

public class QuadraticTime {

    public void program1(int[] numbers){

        for (int i=0 ; i<numbers.length ; i++) {  // O(N)
            for (int j=0 ; j<numbers.length ; j++) { // O(N)
                System.out.println(numbers[i]+"--"+numbers[j]);
            }
        }

        // Runtime Complexity = O(n^2)
        // Here the number of print statements depends on the size of the input
        // Also the complexity increases in quadratic time

    }

    public void program2(int[] numbers){

        for (int j=0 ; j<numbers.length ; j++) { // O(N)
            System.out.println(numbers[j]);
        }

        for (int i=0 ; i<numbers.length ; i++) {  // O(N)
            for (int j=0 ; j<numbers.length ; j++) { // O(N)
                System.out.println(numbers[i]+"--"+numbers[j]);
            }
        }

        // Runtime Complexity = O(n^2) + O(n) => O(n^2)
        // Here the number of print statements depends on the size of the input
        // Also the complexity increases in quadratic time

    }

}
