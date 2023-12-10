import BinaryTrees.*;
import arrays.fundamentals.CustomArray;
import arrays.programs.*;
import recursion.FactorialOfNumber;

public class Main {

    public static void main(String[] args) {

        NodesAtKDistance node = new NodesAtKDistance();
        node.insert(7);
        node.insert(4);
        node.insert(9);
        node.insert(1);
        node.insert(6);
        node.insert(8);
        node.insert(10);

        node.printNodes(2);

    }

}