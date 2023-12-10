import BinaryTrees.*;
import arrays.fundamentals.CustomArray;
import arrays.programs.*;
import recursion.FactorialOfNumber;

public class Main {

    public static void main(String[] args) {

        EqualityChecking tree1 = new EqualityChecking();
        tree1.insert(20);
        tree1.insert(10);
        tree1.insert(30);
        tree1.insert(6);
        tree1.insert(21);
        tree1.insert(4);
        tree1.insert(3);
        tree1.insert(8);
        EqualityChecking tree2 = new EqualityChecking();
        tree2.insert(20);
        tree2.insert(10);
        tree2.insert(30);
        tree2.insert(6);
        tree2.insert(21);
        tree2.insert(4);
        tree2.insert(3);
        tree2.insert(8);
        EqualityChecking check = new EqualityChecking();
        check.isEqual(tree1,tree2);

    }

}