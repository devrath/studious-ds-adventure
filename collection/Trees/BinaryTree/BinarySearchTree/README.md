<div align="center">
  
| `Contents` |
| ---------- |
| [What is binary search tree(BST)](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#what-is-binary-search-treebst) |
| [What is the difference between a binary tree and a binary-search-tree](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#what-is-the-difference-between-a-binary-tree-and-a-binary-search-tree) |
| [Time complexity](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#%EF%B8%8F-time-complexity) |
| [Fundamental Programs](https://github.com/devrath/studious-ds-adventure/tree/main/collection/Trees/BinaryTree/BinarySearchTree/Fundamentals) |


</div>


## `What is binary search tree(BST)`

<div align="center">
  
![bst-1](https://github.com/devrath/studious-ds-adventure/assets/1456191/2aeab9ec-b11d-43f7-8ea6-c0ee55834d80)

</div>

* A tree is called a binary search tree if it is fundamentally a binary tree meaning it has 2 children only.
* All the elements in the left sub-tree are lesser than the node under consideration.
* Subsequently all the elements in the right sub-tree are greater than the node under consideration.
* The left and right sub-tree must also be a binary search tree.
* The entire tree must not contain any duplicate nodes.

## `What is the difference between a binary tree and a binary-search-tree`

| `Binary tree` | `Binary Search Treee` |
| ------------- | --------------------- |
| ![bst](https://github.com/devrath/studious-ds-adventure/assets/1456191/cb132f95-0031-4a49-9bea-0b1d9bf6a50b) | ![bst-1](https://github.com/devrath/studious-ds-adventure/assets/1456191/2aeab9ec-b11d-43f7-8ea6-c0ee55834d80) | 

* `Duplicates`
  *  Binary Tree -> Contains duplicates.
  *  Binary search tree -> Does not contain duplicates.
* `Time complexity`
  * Binary Tree -> Its slower around order `O(n)`
  * Binary search tree -> It is faster since its ordered and of `O(nlogn)`
 
## ⏲️ `Time complexity`  
| `Operation` | `Complexity` |
| ----------- | ------------ |
| Insert | O(logn) |
| Deletion | O(logn) |
| Lookup | O(logn) |
