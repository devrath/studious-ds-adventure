<div align="center">
  
| `Contents` |
| ---------- |
| [What is binary tree](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/README.md#what-is-a-binary-tree) |
| [What is binary search tree(BST)](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/README.md#what-is-binary-search-treebst) |
| [What is the difference between a normal tree and a binary tree](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/README.md#what-is-binary-search-treebst) |
| [What is the difference between a binary tree and a binary-search-tree](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/README.md#what-is-the-difference-between-a-binary-tree-and-a-binary-search-tree) |

</div>


## `What is a binary tree`

<div align="center">
  
![bst](https://github.com/devrath/studious-ds-adventure/assets/1456191/cb132f95-0031-4a49-9bea-0b1d9bf6a50b)

</div>

* A tree is called a binary tree if the data is organized in a hierarchical structure and a `node` has two children namely `left` and `right`.
* There can be max of two children for a node and a node can have one child or no child also.
* The elements to the left of the node are called the `left-subtree` of that node and the elements to the right of the node are called the `right-subtree` of that node.

## `What is binary search tree(BST)`

<div align="center">
  
![bst-1](https://github.com/devrath/studious-ds-adventure/assets/1456191/2aeab9ec-b11d-43f7-8ea6-c0ee55834d80)

</div>

* A tree is called a binary search tree if it is fundamentally a binary tree meaning it has 2 children only.
* All the elements in the left sub-tree are lesser than the node under consideration.
* Subsequently all the elements in the right sub-tree are greater than the node under consideration.
* The left and right sub-tree must also be a binary search tree.
* The entire tree must not contain any duplicate nodes.


## `What is the difference between a normal tree and a binary tree`


| `Normal tree` | `Binary Treee` |
| ------------- | --------------------- |
| ![bst-4](https://github.com/devrath/studious-ds-adventure/assets/1456191/003192ea-94c4-4c62-8725-c23116075727) | ![bst](https://github.com/devrath/studious-ds-adventure/assets/1456191/cb132f95-0031-4a49-9bea-0b1d9bf6a50b) | 

In a `normal tree`, A node can have `n-children` but in a `binary tree` a node can have a maximum of two children, also no children, just one child.


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
