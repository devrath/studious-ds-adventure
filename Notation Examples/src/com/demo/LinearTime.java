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


    public void program2(int[] numbers){

        System.out.println(numbers[0]);
        for (int i=0 ; i<numbers.length ; i++){ // O(n)
            System.out.println(numbers[i]);
        }
        System.out.println(numbers[1]);

        // Runtime Complexity = O(1) + O(n) + O(1) => O(2) + O(n) => O(n)
        // Here the number of print statements depends on the size of the input
        // We drop the value 2 because if we have a million items, just 2 additional items does not impact the cost of algorithm
        // So the complexity is order of N

    }


    public void program3(int[] numbers){

        for (int i=0 ; i<numbers.length ; i++){ // O(n)
            System.out.println(numbers[i]);
        }
        for (int i=0 ; i<numbers.length ; i++){ // O(n)
            System.out.println(numbers[i]);
        }

        // Runtime Complexity = O(n) + O(n) => O(2n) => O(n)
        // We drop the value 2 because if we have a million items, cost of algorithm increases linearly
        // So the complexity is order of N

    }



    public void program3(int[] numbers,String[] names){

        for (int i=0 ; i<numbers.length ; i++){ // O(n)
            System.out.println(numbers[i]);
        }
        for (int i=0 ; i<names.length ; i++){ // O(m)
            System.out.println(names[i]);
        }

        // Runtime Complexity = O(n) + O(m) => O(n+m) => O(n)
        // Yes we have two inputs but the complexity increases linearly
        // So the complexity is order of N

    }

}
