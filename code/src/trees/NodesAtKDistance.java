package trees;

public class NodesAtKDistance {


    public void printNodeValues(MoshBST.Node node, int kLevel) {
        printNodeValues(node,0,kLevel);
    }

    private void printNodeValues(MoshBST.Node node, int distance, int kLevel) {

        if(distance==0 &&
                node.leftChild==null &&
                node.rightChild==null){
            System.out.println("No elements with a certain distance");
        } else if (distance==kLevel &&
                node.leftChild!=null &&
                node.rightChild!=null) {
            System.out.println(node.value);
        } else{

            if(node.leftChild!=null){
                int newDistance = distance + 1;
                printNodeValues(node.rightChild,newDistance,kLevel);
            }

            if(node.rightChild!=null){
                int newDistance = distance + 1;
                printNodeValues(node.leftChild,newDistance,kLevel);
            }

        }




    }


}
