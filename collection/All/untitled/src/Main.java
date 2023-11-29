import BinaryTrees.CustomTree;
import arrays.fundamentals.CustomArray;
import arrays.programs.*;

public class Main {

    public static void main(String[] args) {

        CustomTree tree = new CustomTree();
        tree.insert(100);
        tree.insert(75);
        tree.insert(150);
        //tree.insert(25);
        tree.insert(85);
        tree.insert(125);
        tree.insert(175);
        tree.countLeaves();


    }

}