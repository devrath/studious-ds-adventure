package arrays.programs.easy;

public class SingleNumber {

    int[] input = new int[]{4,1,2,1,2};

    public SingleNumber(){

        int item = input[0];

        for(int i=1; i<input.length ; i++){
            item = item ^ input[i];
        }

        System.out.println("Result:->"+item);
    }

}
