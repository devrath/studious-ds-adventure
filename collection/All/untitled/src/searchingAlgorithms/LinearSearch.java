package searchingAlgorithms;

import java.util.Arrays;

public class LinearSearch {

    int[] input = new int[]{8, 2, 4, 1, 3};
    int searchValue = 10;

    public LinearSearch() {
        performSearch();
    }

    private void performSearch() {

        int position = -1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == searchValue) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Element not found during searching");
        } else {
            System.out.println("Element found at position:->" + position);
        }

    }


}
