package algorithms.mosh.searching;

public class LinearSearch {

    int[] items = { 7 , 1 , 3 , 6 , 5 };

    public boolean isElementPresent(int itemToSearch) {
        boolean isElementFound = false;

        for (int item: items) {
            if(itemToSearch == item){
                isElementFound = true;
            }
        }

        return isElementFound;
    }

}
