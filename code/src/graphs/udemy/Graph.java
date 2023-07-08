package graphs.udemy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {

    private HashMap<String, ArrayList<String>> graph = new HashMap<>();

    /**
     * Adding a vertex to the graph
     * @param key
     * @return if its successful/unsuccessful as boolean value
     */
    public boolean addVertex(String key){
        if(!graph.containsKey(key)){
            graph.put(key,new ArrayList<>());
            return true;
        }
        return false;
    }

    /**
     * Printing the graph elements
     */
    public void printGraph() {
        System.out.println(graph);
    }

    /**
     * Adding the edge between two vertices
     * @param vertex1
     * @param vertex2
     * @return if the operation is successful/unsuccessful
     */
    public boolean addEdge(String vertex1, String vertex2){
        if(graph.get(vertex1)!=null &&  graph.get(vertex2)!=null){
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    /**
     * Removing the edge between two vertices
     * @param vertex1
     * @param vertex2
     * @return if the operation is successful/unsuccessful
     */
    public boolean removeEdge(String vertex1, String vertex2){

        if(graph.get(vertex1)!=null && graph.get(vertex2)!=null){
            ArrayList<String> vertex1Mappings = graph.get(vertex1);
            ArrayList<String> vertex2Mappings = graph.get(vertex2);

            if(vertex1Mappings.contains(vertex2) &&
               vertex2Mappings.contains(vertex1)
            ){
                vertex1Mappings.remove(vertex2);
                vertex2Mappings.remove(vertex1);
            }
            return true;
        }else{
            return false;
        }

    }

    /**
     * Removing the vertex from a graph
     * @param vertex
     * @return if the operation is successful/unsuccessful
     */
    public boolean removeVertex(String vertex){

        if(graph.get(vertex)!=null){

            graph.remove(vertex);

            for (Map.Entry<String,ArrayList<String>> entry: graph.entrySet()) {
                String key = entry.getKey();
                ArrayList<String> value = entry.getValue();
                if(value.contains(vertex)){
                    value.remove(vertex);
                }
            }

            return true;
        }else{
            return false;
        }

    }

}
