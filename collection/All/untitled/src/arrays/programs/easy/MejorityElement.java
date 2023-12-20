package arrays.programs.easy;

public class MejorityElement {

    int[] input = new int[]{3,2,3};

    public MejorityElement(){

        int votes = 0;
        int majority = 0;

        for(int i=0; i<input.length ; i++){

            int currentItem = input[i];

            if(i==0){
                // It is first iteration
                votes++;
                majority = currentItem;
            }else{
                // It is not first iteration
                if(currentItem!=majority){
                    // Iterating item is not the majority element
                    if(votes==0){
                        // Assign new element
                        majority = currentItem;
                        // Decrement counter
                        votes++;
                    }else{
                        // Decrement counter
                        votes--;
                    }
                }else{
                    // Increment counter
                    votes++;
                }

            }

        }

        System.out.println("Mejority element:->"+majority);
    }

}
