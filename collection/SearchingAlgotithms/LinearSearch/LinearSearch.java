public class LinearSearch {

    int[] arrayToSearch;
    int numberToSearch;

    public LinearSearch(int[] arrayToSearch, int numToSearch) {
        this.arrayToSearch = arrayToSearch;
        this.numberToSearch = numToSearch;
    }

    public void search() {
        int position = -1;
        if(arrayToSearch==null){
            System.out.println("Cannot search the element since array is null");
        }else if(arrayToSearch.length==0){
            System.out.println("Cannot search the element since array is empty");
        }else{
            // Try to find the element in the array
            for(int i=0; i<arrayToSearch.length; i++){
                if(arrayToSearch[i]==numberToSearch){
                    position = i;
                    break;
                }
            }
        }

        if(position==-1){
            System.out.println("Item not found");
        }else{
            System.out.println("Item found at position " + position);
        }
    }


}
