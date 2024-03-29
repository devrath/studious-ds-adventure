![test](https://github.com/devrath/studious-ds-adventure/assets/1456191/06cc5207-49ee-4d76-a3ea-1ac71215bee9)<div align="center">

| `Contents` |
| ---------- |
| [What are heaps](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/Heaps/README.md#what-are-heaps) |
| [Applicaitons of heap](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/Heaps/README.md#applicaitons-of-heap) |
| [Insertion operation](https://github.com/devrath/studious-ds-adventure/tree/main/collection/Trees/BinaryTree/Heaps#insertion-operation) |
| [Deletion operation](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Trees/BinaryTree/Heaps/README.md#deletion-operation) |

</div>


# `What are heaps`

<div align="center">
  
![heap](https://github.com/devrath/studious-ds-adventure/assets/1456191/2d199273-83ec-4229-b4fc-6462ad6efcf1)

</div>

* A tree is called a heap if it's complete & Satisfies the heap property.
  * If it has to be complete, Then it should satisfy the below conditions.
    * If all the nodes are filled apart from the leaves.
    * Every level except the last level must be full of nodes.
    * Also the elements are filled from left to right.
  * If the heap needs to satisfy the heap property.
    * If we pick any node, All its children must be less than or equal to the node under consideration. 
 
  
## `Complete trees Examples`
<div align="center">
  
![heap](https://github.com/devrath/studious-ds-adventure/assets/1456191/e2b65626-1e7d-4ff5-9151-271d3d29b74b)
![heap1](https://github.com/devrath/studious-ds-adventure/assets/1456191/1a2f8bd9-53df-4f28-9f9c-3223c57a2239)

</div>

## `Non-Complete Trees Examples`
<div align="center">

![heap2](https://github.com/devrath/studious-ds-adventure/assets/1456191/41af9d3b-0552-42c8-b954-172304aab6f9)
![heap3](https://github.com/devrath/studious-ds-adventure/assets/1456191/6e05e5be-f325-43bd-a88c-d1e12023958a)

</div>

## `Tree that satisfies heap property`

<div align="center">

![dd](https://github.com/devrath/studious-ds-adventure/assets/1456191/c72df89f-ea11-4f47-a787-fc2cf1d099b8)

</div>

# `Applicaitons of heap`
* Sorting --------------> Heap sort
* Graph Algorithms -----> Shortest path
* Priority Queues
* Finding kth smallest/largest value

# `Insertion operation`
*  `Time complexity - O(logn)`
*  Input - `[10,5,17,4,22]`
*  We perform bubbling up 
![dd](https://github.com/devrath/studious-ds-adventure/assets/1456191/a6d2381c-ef3f-4fb2-acaf-6c47e5133bf5)

# `Deletion operation`
*  `Time complexity - O(logn)`
*  We tried to remove 22
*  We do bubbling down here
![test](https://github.com/devrath/studious-ds-adventure/assets/1456191/226a95aa-9551-4efe-a24b-4d93e6d625e7)

