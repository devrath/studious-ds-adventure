# `Given two trees determine if both trees are equal or not equal`

#### `Approach`
* We can use the `pre-order-traversal` technique.

### `Analysis`
```java
private boolean recursivelyCheckEquality(Node root1, Node root2) {
        // If the root nodes are themselves null
        if((root1==null) && (root2==null)){
            return true;
        }

        // PRE-ORDER-TRAVERSAL: Root -> LEFT -> RIGHT
        return  (root1.value==root2.value) &&
                (recursivelyCheckEquality(root1.left,root2.left)) &&
                (recursivelyCheckEquality(root1.right,root2.right));
}
```

* We have 2 parts here
  * we check if both are null, then the trees are equal.
  * We combine 3 conditions separated by a `&&` condition.
    * Condition 1:-> root values of both trees are equal.
    * Condition 2:-> recursively call the same function params will be left of each sub-trees
    * Condition 3:-> recursively call the same function params will be right of each sub-trees
