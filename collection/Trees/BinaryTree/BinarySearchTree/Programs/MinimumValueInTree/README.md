# `Minimum value in a tree`

#### `Approach`
* We need to calculate the minimum value of all the nodes in the tree.
* To do that basically in each sub-tree from `leaf` node to the `root` node, We calculate the minimum values of all the leaves and compare them to the parent.
* Then set the minimum value in the parent.
* We repeat this recursively until we reach the `leaf node` to the `parent node` and the final minimum value is shown in the parent node.

#### `Which traversal technique to use`
We can use `POST - ORDER - TRAVERSAL`
