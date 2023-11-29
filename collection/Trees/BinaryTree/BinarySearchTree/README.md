<div align="center">
  
| `Contents` |
| ---------- |
| [What is binary search tree(BST)](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#what-is-binary-search-treebst) |
| [What is the difference between a binary tree and a binary-search-tree](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#what-is-the-difference-between-a-binary-tree-and-a-binary-search-tree) |
| [Time complexity](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#%EF%B8%8F-time-complexity) |
| [Fundamental Programs](https://github.com/devrath/studious-ds-adventure/tree/main/collection/Trees/BinaryTree/BinarySearchTree/Fundamentals) |
| [Tree Traversals](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#tree-traversals) |

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

## `Tree traversals`

<div align="center">
  
| `Contents` |
| ---------- |
| [About traversals](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#about-traversals) |
| [Categories of traversals](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/BinarySearchTree/README.md#categories-of-traversals) |
| [Sample traversal using depth-first traversals]() |

</div>


## `About traversals`
* In linear data structures, there is just one possibility, We start at the beginning and traverse in such a way until we reach the end of the data structure.
* But in the non-linear data-structure trees, we start at one node and we have 2 possibilities, either go left or go right and this repeats until we reach the leaf nodes.

## `Categories of traversals`
* Breadth First Traversal:
* Depth First Traversal:
  
### Breadth First Traversal:
* Here we visit all the nodes in one level before visiting the nodes at another level.
* This is called level order traversal.

### Depth First Traversal:   
The depth-first traversals are divided into 3 types
* Pre-Order traversal ---------> `Root-Left-Right`
* In-Order traversal ----------> `Left-Root-Right`
* Post-Order traversal --------> `Left-Right-Root`

## `Sample traversal using depth-first traversals`  
<div align="center">
  
![levelOrder](https://github.com/devrath/studious-ds-adventure/assets/1456191/0ec9f489-8128-4251-8b31-638280ef9ae6)

| `Traversal Type` | `Data`                     |
| ---------------- | -------------------------- |
| Level order traversal | ` [7,4,9,1,6,8,10] ` |
| Pre-Order traversal  | ` [7,4,1,6,9,8,10] `   |
| In-Order traversal   | ` [1,4,6,7,8,9,10] `   |
| Post-Order traversal | ` [1,6,4,8,10,9,7] `   |

![3](https://github.com/devrath/studious-ds-adventure/assets/1456191/122077d0-a4aa-4f6f-a3c0-1cfc1de9f4c1)
| `Traversal Type` | `Data`                              |
| ---------------- | ----------------------------------- |
| Pre-Order traversal  | ` [20,10,6,3,8,14,30,24,26] `   |
| In-Order traversal   | ` [3,6,8,10,14,20,24,26,30] `   |
| Post-Order traversal | ` [3,8,6,14,10,26,24,30,20] `   |

</div>
