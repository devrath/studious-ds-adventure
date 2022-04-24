package programs;

import Utils.PrintArray;

import java.util.Scanner;

public class Program1 {

    public void initiate(){
        System.out.println("Adding the values to the array");

        int[] dataSet = new int[6];
        dataSet[0] = 10;
        dataSet[1] = 20;
        dataSet[2] = 30;
        dataSet[3] = 40;
        dataSet[4] = 50;
        dataSet[5] = 60;

        // Print the array
        new PrintArray(dataSet);
        System.out.println("Enter the value whose index has to be found !");
        Scanner scanner = new Scanner(System.in);
        String valueToBeFound = scanner.nextLine();
        System.out.println("---------------------------------------");

        int index = -1;
        for (int i=0 ; i< dataSet.length ; i++){
            if(dataSet[i]==Integer.valueOf(valueToBeFound)){
                index = i;
            }
        }

        if(index==-1){
            System.out.println("Value is not present in the array !");
        }else{
            System.out.println("Index of the value is ->"+index);
        }

    }

}
