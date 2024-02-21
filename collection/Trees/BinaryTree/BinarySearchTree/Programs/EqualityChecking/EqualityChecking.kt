class TreesEqualityChecking {

    // Root Node
    var root : Node? = null
    // Keeping track of size
    private var size = 0


    class Node(val info : Int) {
        var leftNode : Node? = null
        var rightNode : Node? = null
        override fun toString() = "Node -> $info"
    }

    /**
     * Printing the root node
     */
    fun printNode() = root

    /**
     * Creating a new node
     */
    fun createNode(info : Int) : Node = Node(info)

    /**
     * Inserting a new element
     */
    fun insert(info : Int) {

        val newNode = Node(info)

        if(size==0){
            // If the element we are inserting is the first element, Then it becomes the root node
            root = newNode
            size+=1
        }else{
            // At-least there is one element ----> Now determine if we can add to left or if we can add to right
            var current = root

            while(current!=null){

                if(current.info==info){
                    // Don't do anything
                }else if(info<current.info){
                    if(current.leftNode==null){
                        // We reached to leaf position
                        // Insert to the left of the tree
                        current.leftNode = newNode
                        size += 1
                        break
                    }else{
                        // Traverse to left of the current node
                        current = current.leftNode
                    }
                }else{
                    if(current.rightNode==null){
                        // We reached to leaf position
                        // Insert to the right of the tree
                        current.rightNode = newNode
                        size += 1
                        break
                    }else{
                        // Traverse to right of the current node
                        current = current.rightNode
                    }
                }

            }
        }



    }


    fun compareTreesToCheckEquality(set1 :Node?, set2:Node?) : Boolean{
        
        // Breaking condition
        if((set1==null) && (set2==null)){
            return true;
        }

       return (set1?.info == set2?.info) && compareTreesToCheckEquality(set1?.leftNode,set2?.leftNode)
               && compareTreesToCheckEquality(set1?.rightNode,set2?.rightNode)
    }


}