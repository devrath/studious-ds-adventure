# Linked List


<div align="center">
  
| `Contents` |
| ---------- |
| [Concepts](https://github.com/devrath/studious-ds-adventure/blob/main/collection/LinkedList/README.md#concepts) |
| [Programs](https://github.com/devrath/studious-ds-adventure/blob/main/collection/LinkedList/README.md#programs) |

</div>


## `Concepts`

<div align="center">
  
| `Contents` |
| ---------- |
| [Comparing linked list with array list](https://github.com/devrath/studious-ds-adventure/blob/main/collection/LinkedList/README.md#comparing-linked-list-with-array-list-) |
| [Structure of array list](https://github.com/devrath/studious-ds-adventure/blob/main/collection/LinkedList/README.md#structure-of-array-list) |
| [Structure of linked list](https://github.com/devrath/studious-ds-adventure/blob/main/collection/LinkedList/README.md#structure-of-linked-list) |
| [Big-O Comparing ArrayList with linked list](https://github.com/devrath/studious-ds-adventure/blob/main/collection/LinkedList/README.md#big-o-comparing-arraylist-with-linked-list) |

</div>


## `Programs`

<div align="center">
  
| `Contents` |
| ---------- |
| [Append element](https://github.com/devrath/studious-ds-adventure/tree/main/collection/LinkedList/concepts/AppendElement) |
| [Prepend element](https://github.com/devrath/studious-ds-adventure/tree/main/collection/LinkedList/concepts/PrependElement) |
| []() |
| [Insert element](https://github.com/devrath/studious-ds-adventure/tree/main/collection/LinkedList/concepts/InsertElement) |

</div>



------------

### `Comparing linked list with array list `
* An array list is the data structure linked list commonly compared with because `linked list` is `dynamic in length` just like the `array list` but the arrays are fixed in length. 
* In the `linked list` we cannot go to a particular position based on the index.
* In the `array list`, all the elements are in a contiguous place in the memory but in the `linked list` the elements are spread out.

------------

### `Structure of array list`
![Untitled Diagram drawio](https://github.com/devrath/studious-ds-adventure/assets/1456191/bb6539e5-8f0a-410d-b89a-0a68cc3c5caa)
* Note that the elements are stored continuously in the memory.
* We have access to the index

------------

### `Structure of linked list`
![Untitled Diagram drawio1](https://github.com/devrath/studious-ds-adventure/assets/1456191/124d2602-aa2d-4e7c-be85-8ab2497a49bd)
* Observe that each node has a field that points to the next node.
* There is a pointer called `head` that points to the first node.
* There is a pointer called `tail` that points to the last node.
* The last node points to `null` indicating that it is the end of the node and null states it does not point to anything but since there is a variable, we add null to it.
* Observe that it is not contiguous memory locations but rather is distributed throughout the memory locations.

------------

### `Big-O Comparing ArrayList with linked list`  

| `Operation`   | `Linked List`   | `Array List`   |
| ------------- | --------------- | -------------- |
|   Append      |     O(1)        |     O(1)       |
|  RemoveLast   |     O(n)        |     O(1)       |
|   Prepend     |     O(1)        |     O(n)       |
| RemoveFirst   |     O(1)        |     O(n)       |
|   Insert      |     O(n)        |     O(n)       |
|   Remove      |     O(n)        |     O(n)       |
| LookUpByIndex |     O(n)        |     O(1)       |
| LookUpByValue |     O(n)        |     O(n)       |






