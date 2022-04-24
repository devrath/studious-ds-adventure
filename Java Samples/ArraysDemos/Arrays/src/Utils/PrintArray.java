package Utils;

import java.util.Arrays;

public class PrintArray {
    public PrintArray(int[] dataSet) {
        System.out.println("---------------------------------------");
        System.out.println("Length of the array:-> "+dataSet.length);
        if(dataSet.length>0){
            System.out.println("---------------------------------------");
            System.out.println(Arrays.toString(dataSet));
            System.out.println("---------------------------------------");
        }
    }
}
