class DepthAndHeightOfTree {

    // Root Node
    var root : Node? = null
    // Keeping track of size
    private var size = 0





    fun calculateDepthOfNode(value : Int): Int {

        var depth = 0
        var current = root

        // No elements are present
        if(size==0){
            depth = -1
        }

        // Just one element is present
        if(size==1 && value==current?.info){
            return 1;
        }

        var temp = 0
        while (current!=null){

            if(value<current.info){
                // Traverse to left
                current = current.leftNode
                // Increment the counter
                temp++
            }else if(value>current.info){
                // Traverse to right
                current = current.rightNode
                // Increment the counter
                temp++
            }else if(value==current.info){
                depth = temp
                break
            }

        }


        return depth
    }


    fun calculateHeightOfNode(value : Int): Int {

        var current = root

        while(current!=null){

            // Try to find the node
            if(value==current.info){
                // We found the element ---> Now calculate the height of this element
               break;
            }

            if(value<current.info){
                // Traverse --> to left of the tree
                current = current.leftNode
            }else{
                // Traverse --> to right of the tree
                current = current.rightNode
            }

        }


        return recursivelyCalculateHeight(current!!)
    }

    private fun recursivelyCalculateHeight(current : Node?): Int {

        if(current==null){
            // We reached the leaf of the tree
            return 0;
        }

        return 1 + Math.max(
            recursivelyCalculateHeight(current.leftNode),
            recursivelyCalculateHeight(current.rightNode)
        )

    }



    /** ********************* HELPER FUNCTIONS ********************* **/
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
    /** ********************* HELPER FUNCTIONS ********************* **/


}