package algorithms.mosh.searching;

public class JumpSearch {

    int[] dataset = {3,5,6,9,11,18,20,21,24,30};
    int itemToSearch = 31;

    public boolean initiate(){
        // Calculate the block size
        int blockSize = (int) Math.sqrt(dataset.length);
        // Initial left pointer position
        int left = 0;
        // Initial right pointer position
        int right = blockSize-1;
        // Item found
        boolean isItemFound = false;

        if(itemToSearch>dataset[dataset.length-1]){
            return false;
        }

        while(left<dataset.length && itemToSearch>dataset[right]){
            // We navigate to next blocks to find the item
            left = right;
            right = right + blockSize;

            if(right>dataset.length-1){
                right = dataset.length-1;
            }
        }

        // Here the pointers are in correct position
        return isElementPresent(itemToSearch);
    }


    public boolean isElementPresent(int itemToSearch) {
        boolean isElementFound = false;

        for (int item: dataset) {
            if(itemToSearch == item){
                isElementFound = true;
            }
        }

        return isElementFound;
    }
}
