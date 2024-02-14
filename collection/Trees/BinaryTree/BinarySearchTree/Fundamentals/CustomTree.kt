class CustomTree {

    // Hold the root node reference
    private var root : Node? = null
    // Hold the size value in the tree
    private var itemCount : Int = 0

    class Node(val info : Int){

        var lTree : Node? = null
        var rTree : Node? = null

        override fun toString(): String {
            return "Node=$info"
        }

    }
    // OPERATION: Print
    fun printNode(): Node? {
        return root
    }

    // OPERATION: Creating a new node
    private fun createNode(value : Int): Node {
        return Node(value)
    }

    // OPERATION: Inserting an element into the tree
    fun insert(item : Int){

        // Prepare the node
        val newNode = createNode(value = item)

        if(itemCount==0){
            // Condition: If the tree is empty, Inserting current node will be the root node
            root = newNode

        }else{
            // Condition: If there are at-least one node in the tree

            // We need to find out, Where to insert the node -> So traverse the tree
            var current = root

            while (current!=null){

                if(item<current.info){
                    if(current.lTree==null){
                        // Insert here
                        current.lTree = newNode
                        // break from the loop since item is inserted
                        break
                    }else{
                        // We navigate to left part of the subtree
                        current = current.lTree
                    }
                }else{
                    if(current.rTree==null){
                        // Insert here
                        current.rTree = newNode
                        // break from the loop since item is inserted
                        break
                    }else{
                        // We navigate to right part of the subtree
                        current = current.rTree
                    }
                }
            }

        }

        itemCount++
    }

    // OPERATION: Finding the value
    fun findValue(value : Int): Boolean {

        if(itemCount==0){
            // If no elements are present in the binary tree
            return false
        }else{
            // Elements are present in the binary tree so try to search for the element
            var isElementPresent = false;
            var current = root

            while (current!=null){
                if(value==current.info){
                    // Item fount in the node
                    isElementPresent = true;
                    break
                }else{
                    if(value<current.info){
                        current = current.lTree
                    }else{
                        current = current.rTree
                    }
                }
            }

            return isElementPresent
        }
    }

    // OPERATION: Find the MAX value
    fun findMaxValue(): Int {
        var maxValue = -1
        if(itemCount==0){
            return maxValue
        }else{
            var current = root
            while (current!=null){
                current = current.rTree
                 current?.info?.let {
                     maxValue = it
                }
            }
        }
        return maxValue
    }

    // OPERATION: Return tree size
    fun getTreeSize(): Int {
        return itemCount
    }

    // OPERATION: Count the leaves
    fun countLeaves() : Int {
        var noOfLeaves = 0

        if (itemCount==0){
            // No elements are present
            return noOfLeaves
        }else{
            // Elements are present
            var current = root

            if(current!=null){
                noOfLeaves = recursivelyCalculateLeaves(current,noOfLeaves)
            }
        }

        return noOfLeaves
    }

    private fun recursivelyCalculateLeaves(current: Node, noOfLeaves: Int): Int {

        var _noOfLeaves = noOfLeaves

        if(current.lTree==null && current.rTree==null){
            _noOfLeaves +=1
        }else{
            // Recursive left tree traversal
            if(current.lTree!=null){
                current.lTree?.let {
                    _noOfLeaves = recursivelyCalculateLeaves(it,_noOfLeaves)
                }
            }
            // Recursive right tree traversal
            if(current.rTree!=null){
                current.rTree?.let {
                    _noOfLeaves = recursivelyCalculateLeaves(it,_noOfLeaves)
                }
            }
        }

        return _noOfLeaves
    }


}