package trie;

public class Trie {

    // We declare a constant value for the alphabet size
    private int ALPHABET_SIZE = 26;
    // Root node has the field empty
    private Node root = new Node(' ');


    /**
     * INSERTING a node
     * @param word
     */
    public void insert(String word){
        // START from the root which is an empty value.
        Node current = root;
        // Iterate the entire array
        for(char ch : word.toCharArray()){
            // Get the index
            int index = ch - 'a';
            // Check if the node does not exist
            if(current.children[index]==null){
                // We explicitly create the node
                current.children[index] = new Node(ch);
            }
            // We have-it/not-have-it, eventually we point to that node
            current = current.children[index];
        }
        // After the for loop is done the current references the last node
        current.isEndOfWord = true;

    }

    private class Node {

        private char value;
        private Node[] children = new Node[ALPHABET_SIZE];
        private boolean isEndOfWord = false;

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }


}
