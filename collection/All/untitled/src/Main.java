
import arrays.programs.medium.FirstLastPositionSortedArray;
import arrays.programs.medium.SearchInRotatedSortedArray;
import heap.BuildHeap;
import strings.GenerateParenthesis;
import strings.GroupAnagrams;
import strings.LongestSubStringWithoutRepeatingCharacters;

public class Main {

    public static void main(String[] args) {

        // INPUT :-> [20,10,15,4,5]

        BuildHeap heapObj = new BuildHeap();
        heapObj.insert(10);
        heapObj.insert(5);
        heapObj.insert(17);
        heapObj.insert(4);
        heapObj.insert(22);
        heapObj.remove();
        heapObj.printOutput();

    }

}