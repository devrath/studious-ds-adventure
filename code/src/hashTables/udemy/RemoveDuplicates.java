package hashTables.udemy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        //(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5)
        myList.add(1);myList.add(2);myList.add(3);myList.add(4);
        myList.add(1);myList.add(2);myList.add(5);myList.add(6);
        myList.add(7);myList.add(3);myList.add(4);myList.add(8);
        myList.add(9);myList.add(5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

    }

    private static List<Integer> removeDuplicates(List<Integer> myList) {

        Set<Integer> sortedValues = new HashSet<>(myList);
        List<Integer> resultCollection = new ArrayList<>(sortedValues);

        return resultCollection;
    }


}
