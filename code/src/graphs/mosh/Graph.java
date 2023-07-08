package graphs.mosh;

import java.util.*;

public class Graph {


    private class Node {
        private final String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    Map<String,Node> nodes = new HashMap<>();
    Map<Node, List<Node>> adjacencyList = new HashMap<>();

    /**
     * Adding a new node
     * @param label
     */
    public void addNode(String label) {
        Node newNode = new Node(label);
        nodes.putIfAbsent(label,newNode);
        // Add the arraylist placeholder for the new node added
        adjacencyList.putIfAbsent(newNode,new ArrayList<>());
    }

    /**
     * Adding an edge from one node to another
     * @param from
     * @param to
     */
    public void addEdge(String from, String to){

        Node fromNode = nodes.get(from);
        if(fromNode==null){
            throw new IllegalArgumentException();
        }

        Node toNode = nodes.get(to);
        if(to==null){
            throw new IllegalArgumentException();
        }

        // Since its unidirectional graph we just add one side connection
        adjacencyList.get(fromNode).add(toNode);
    }

    /**
     * Removing the node
     * @param label
     */
    public void removeNode(String label){

        Node node = nodes.get(label);
        if(node==null){
            return;
        }

        // Remove all the possible links of the node
        for (Node source : adjacencyList.keySet()) {
            adjacencyList.get(source).remove(node);
        }

        // Remove the node from the adjacency list
        adjacencyList.remove(node);
        // Remove the node itself
        nodes.remove(label);

    }


    public void removeEdge(String from,String to){

        Node fromNode = nodes.get(from);
        if(fromNode==null){
            throw new IllegalArgumentException();
        }

        Node toNode = nodes.get(to);
        if(toNode==null){
            throw new IllegalArgumentException();
        }

        adjacencyList.get(fromNode).remove(toNode);
    }


    public void traverseDepthFirstWithRecursion(String label){

        Node node = nodes.get(label);

        if(node!=null){
            // Traverse recursively - Since node exists
            traverseDepthFirstWithRecursion(node, new HashSet<>());
        } else {
            // Return since node is equal to null
            return;
        }

    }


    public void traverseDepthFirstWithIteration(String label){

        Node node = nodes.get(label);

        if(node!=null){
            // Traverse iteratively - Since node exists

            Stack<Node> nodeStack = new Stack<>();
            HashSet<Node> visited = new HashSet<>();

            nodeStack.push(node);

            while (!nodeStack.isEmpty()){

                Node currentNode = nodeStack.pop();
                // We need to check if we have not visited this node before
                if(visited.contains(currentNode)){
                    continue;
                }else{
                    System.out.println(currentNode);
                    visited.add(currentNode);
                }

                for (Node neighbour:adjacencyList.get(currentNode)) {
                    // Check if the node is already visited
                    if(!visited.contains(neighbour)){
                        nodeStack.push(neighbour);
                    }
                }

            }


        } else {
            // Return since node is equal to null
            return;
        }
    }


    public void traverseBreadthFirstTraversal(String label){


        Node node = nodes.get(label);
        if (node == null)
            return;

        Set<Node> visited = new HashSet<>();

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (!visited.contains(current)){
                // If we have not visited the current node - TRUE

                // Print the current node
                System.out.println(current);
                // Add into list of visited nodes
                visited.add(current);

                for (Node neighbour : adjacencyList.get(current)){
                    // Parse the neighbours
                    if (!visited.contains(neighbour)){
                        // Add the neighbours to while loop since they are not visited
                        queue.add(neighbour);
                    }
                }

            }
        }
    }

    public void print() {

        // Loop the list of nodes
        for (Node source : adjacencyList.keySet()) {
            // List of Nodes for source node
            List<Node> targets = adjacencyList.get(source);
            if(!targets.isEmpty()){
                System.out.print(source + " is connected to " + targets);
            }
            System.out.print("\n");
        }

    }


    private void traverseDepthFirstWithRecursion(
            Node root, Set<Node> visited
    ) {
        // Print the root node we ae visiting
        System.out.println(root);
        // Mark the node as visited
        visited.add(root);

        // Recursively visit all the neighbours of root node
        for (Node node:adjacencyList.get(root)) {
            // Check if the node is already visited
            if(!visited.contains(node)){
                traverseDepthFirstWithRecursion(node,visited);
            }

        }
    }


    public boolean hasCycle(){

        Set<Node> allNodes = new HashSet<>();
        Set<Node> visitingNodes = new HashSet<>();
        Set<Node> visitedNodes = new HashSet<>();

        // Add all the nodes to set
        allNodes.addAll(nodes.values());

        while (!allNodes.isEmpty()){
            Node currentNode = allNodes.iterator().next();
            if(hasCycle(currentNode,allNodes,visitingNodes,visitedNodes))
                return true;
        }

        return false;
    }

    private boolean hasCycle(
            Node node, Set<Node> all,
            Set<Node> visiting, Set<Node> visited
    ){

        // Remove the node from `All` set
        all.remove(node);
        //  Add it to the `visiting` set
        visiting.add(node);
        // Now we need to visit all the neighbours of this node
        for (Node neighbour : adjacencyList.get(node)) {
            // If we have visited this neighbour, we look another neighbour
            if(visited.contains(neighbour))
                continue;

            if(visiting.contains(neighbour))
                return true;

            // Otherwise, we need to recursively call this method and visit that neighbour
            if(hasCycle(neighbour,all,visiting,visited))
                return true;
        }

        // If we reach till here, means there are no cycles
        // So we move the node from visiting set to visited set
        visiting.remove(node);
        visited.add(node);

        return false;
    }


}
