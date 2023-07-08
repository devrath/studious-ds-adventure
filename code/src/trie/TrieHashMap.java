package trie;

import java.util.HashMap;
import java.util.Map;

public class TrieHashMap {

    private Node root = new Node(' ');


    public void insert(String word) {

        Node current = root;

        for (Character ch : word.toCharArray()){
            if (current.children.get(ch) == null) {
                // If not present create it
                current.children.put(ch,new Node(ch));
            }
            // Link it
            current = current.children.get(ch);
        }

        current.isEndOfWord = true;
    }

    public boolean lookUp(String word) {
        Node current = root;
        boolean isPresent = false;

        char[] charArray = word.toCharArray();

        for (int i=0 ; i<charArray.length ; i++){

            char currChar = charArray[i];

            HashMap<Character,Node>  child = current.children;

            if(child.containsKey(currChar)){
                isPresent = true;
            }else{
                isPresent = false;
            }

            if(child.size()!=0){
                current = child.get(currChar);
            }

        }

        return isPresent;
    }

    public void traversePreOrder(){
        travPreOrder(root);
    }

    private void travPreOrder(Node root) {

        if(root.children.size()!=0){
            Map.Entry<Character,Node> entry = root.children.entrySet().iterator().next();
            if(!root.isEndOfWord){
                travPreOrder(entry.getValue());
            }
            System.out.println(entry.getKey());
        }

    }

    public void removeWord(String word) {

        char[] wordArr = word.toCharArray();
        Node currentNode = root;

        for(int i=0 ; i<wordArr.length ; i++){
            char currentChar = wordArr[i];
            HashMap<Character,Node> map = currentNode.children;
            Map.Entry<Character,Node> entry = map.entrySet().iterator().next();

            if(entry.getKey().equals(currentChar)){
                // check if there is a level below this
                if(entry.getValue().children.size()>0){
                    // There is one more level
                    currentNode = entry.getValue();
                }else{
                    if(i==wordArr.length-1){
                        entry.getValue().isEndOfWord=false;
                    }
                }
            }

        }

    }

    class Node {
        private int value;
        private boolean isEndOfWord = false;
        private HashMap<Character,Node> children = new HashMap<>();

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value ;
        }
    }


}
