import BinaryTrees.CustomTree;
import BinaryTrees.TraversalsInBinarySearchTree;
import arrays.fundamentals.CustomArray;
import arrays.programs.*;
import recursion.FactorialOfNumber;

public class Main {

    public static void main(String[] args) {

        TraversalsInBinarySearchTree tree = new TraversalsInBinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.postOrderTraversal();

    }

}