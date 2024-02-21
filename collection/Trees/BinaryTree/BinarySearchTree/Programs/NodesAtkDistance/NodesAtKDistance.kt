class NodesAtKDistance {

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


    fun printNodes(requiredLevel : Int){
        var initialLevel = 0
        var current = root

        printAtLevel(current,requiredLevel,initialLevel)
    }

    private fun printAtLevel(current: Node?, requiredLevel: Int, initialLevel: Int) {

       if (current==null){
           return
       }

        var mInitialLevel = initialLevel

        if(requiredLevel!=initialLevel){
            // Keep traversing
            mInitialLevel += 1
            if(current!=null && current?.leftNode!=null){
                printAtLevel(current?.leftNode,requiredLevel,mInitialLevel)
            }
            if(current!=null && current?.rightNode!=null){
                printAtLevel(current?.rightNode,requiredLevel,mInitialLevel)
            }
        }else{
            if(current!=null){
                println(current.info)
            }
        }

    }

}