import BinaryTrees.CustomTree;
import BinaryTrees.DepthAndHeightOfTree;
import BinaryTrees.MinimumValueInTree;
import BinaryTrees.TraversalsInBinarySearchTree;
import arrays.fundamentals.CustomArray;
import arrays.programs.*;
import recursion.FactorialOfNumber;

public class Main {

    public static void main(String[] args) {

        MinimumValueInTree tree = new MinimumValueInTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(6);
        tree.insert(21);
        tree.insert(4);
        tree.insert(3);
        tree.insert(8);
        tree.calculateMinimumValue();

    }

}