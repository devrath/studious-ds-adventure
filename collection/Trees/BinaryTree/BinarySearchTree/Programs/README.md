<div align="center">
  
| `Contents` |
| ---------- |
| [Depth of the node](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/DepthAndHeightOfTree/README.md#depth-of-the-node) |
| [Height of the node](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/DepthAndHeightOfTree/README.md#height-of-the-node) |
| [Distinguishing depth and height](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/DepthAndHeightOfTree/README.md#distinguishing-depth-and-height) |
| [Logic to calculate the height of BST](https://github.com/devrath/studious-ds-adventure/tree/main/collection/Trees/BinaryTree/BinarySearchTree/DepthAndHeightOfTree#logic-to-calculate-the-height-of-bst) |
| [Maximum depth of a BST](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/DepthAndHeightOfTree/README.md#maximum-depth-of-a-bst) |

</div>

<div align="center">
  
![Untitled Diagram drawio](https://github.com/devrath/studious-ds-adventure/assets/1456191/90b84f7a-d731-4b67-969d-8c55930b767d)

</div>

## `Depth of the node`
#### `Definition`
* Here the definition defines, the number of edges from the `root node` to the `node` under the reference.
* Depth of 8 ===> 3
* Depth of 20 ==> 0

## `Height of the node`
#### `Definition`
* Here we take the node under consideration and calculate the longest sub-tree meaning the largest number of edges from it to all of the subtrees and we take the largest value.
* Height of 8 ===> 0
* Height of 20 ==> 3

## `Distinguishing depth and height`
| `Depth` | `Height` |
| ------- | -------- |
| It is the number of edges from the node that we are calculating to the root node | It is the largest number of edges from the node under consideration to the leaf nodes |
| The root node will have depth as 0 | The leaf node will have height of 0 |
 
## `Logic to calculate the height of BST`
![Untitled Diagram drawio](https://github.com/devrath/studious-ds-adventure/assets/1456191/8788d2a3-fe84-4e1f-9c06-405bcf2d29bf)
* **`Formulae`** = `1 + MAX(height-Of-Left-SubTee,height-Of-Right-SubTee)`
* We apply `Post order traversal` technique to get the height of BST.

## `Maximum depth of a BST`
#### `Definition`
* Defining the height of the binary tree is the longest path from the root node to all the nodes.
* Height of the binary tree above is 3
