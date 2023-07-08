package trees;

public class EqualityChecking {


    public boolean areTreesEqual(MoshBST.Node tree1, MoshBST.Node tree2){


        if(tree1==null && tree2==null){
            // If both trees are null, then return true.
            return true;
        }else if(tree1!=null && tree2!=null){
            // If both of the trees are not null
            if(
                    (tree1.value == tree2.value) &&
                    areTreesEqual(tree1.leftChild,tree2.leftChild) &&
                    areTreesEqual(tree1.rightChild,tree2.rightChild)
            ){
                return true;
            }else{
                return false;
            }
        }else{
            // One of the trees are null
            return false;
        }
    }


}
