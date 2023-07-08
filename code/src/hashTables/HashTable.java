package hashTables;

import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public HashTable(){
        dataMap = new Node[size];
    }

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    // Generating the address for a key
    private int hash(String key){
        // initialise to zero
        int hash = 0;
        // Convert the `key` string to array of characters
        char[] keyChars = key.toCharArray();
        // Iterate the array to apply a logic
        for (int i=0 ; i< keyChars.length ; i++){
            int ascValue = keyChars[i];
            hash = (hash + ascValue*23) % (dataMap.length);
        }
        return hash;
    }

    // Printing the hash table
    public void printTable(){
        for(int i=0 ; i< dataMap.length ; i++){
            System.out.println(i+":");
            Node temp = dataMap[i];
            while (temp!=null){
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public void set(String key, int value){
        // Index generated always is deterministic: "Index generated for the key is always same"
        int index = hash(key);
        /**
         * To Possibilities: <1>,<2>
         * <1> There is no item at that index
         * <2> There is already an item at that index, so it has to be appended
         **/
        Node temp = dataMap[index];

        Node newNode = new Node(key, value);
        if(temp==null){
            //<1> There is no item at that index
            dataMap[index] = newNode;
        }else{
            //<2> There is already an item at that index, so it has to be appended
            while (temp.next!=null){
                // Keep iterating
                if(temp.key==key){
                   temp.value=value;
                   break;
                }
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public int get(String key){
        // Determine the index.
        int index = hash(key);
        // Determine the position of the node in the array.
        Node temp = dataMap[index];

        if(temp==null){
            return 0;
        }else{
            while(temp.next!=null){
                if(temp.key==key){
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return 0;
    }

    public ArrayList<String> getKeys(){
        ArrayList<String> keysList = new ArrayList<>();

        if(dataMap.length!=0){
            for (int i=0 ; i<dataMap.length ; i++){
                Node temp = dataMap[i];
                if(temp==null){
                    // No keys
                }else if(temp.key!=null && temp.next==null){
                    // Just One key
                    keysList.add(temp.key);
                }else{
                    // Many keys
                    while (temp.next!=null){
                        keysList.add(temp.key);
                        temp=temp.next;
                    }
                }
            }
        }
        return keysList;
    }

}
