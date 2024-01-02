<div align="center">

![Arrays](https://github.com/devrath/studious-ds-adventure/assets/1456191/c990423d-2cd0-49ea-9014-3c8d495dca29)

</div>

<div align="center">

  
| `Contents` |
| ---------- |
| [Concepts](https://github.com/devrath/studious-ds-adventure/blob/main/collection/Arrays/README.md#concepts) |
| [Fundamentals](https://github.com/devrath/studious-ds-adventure/tree/main/collection/Arrays/Fundamentals) |
| [Programs](https://github.com/devrath/studious-ds-adventure/tree/main/collection/Arrays/Programs) |

</div>


## `Concepts`

### `What are arrays`
* Arrays are of the data structures, which are used to store a `list of numbers`,` list of characters`,` list of integers`,` list of objects`, whatever.
* Important context here is that Items are stored continuously in the memory location by one after another what we refer to as sequentially.
* Arrays are unlike linked lists where the linked list elements are distributed throughout the memory locations.

### `Structure of arrays`
![Untitled Diagram drawio](https://github.com/devrath/studious-ds-adventure/assets/1456191/052dfa49-5536-4e0c-9ffd-e175f54ecb55)
* Observe in the array above, We have an array of integers.
* Let's say the initial address is `100` and each array holds `4` bytes of memory. Thus next address would be `104` and so on.

### `Disadvantages of arrays`
* Since the array size is fixed, We need to give a defined size for it when creating the array.
* If more items are to be added to the existing array and the array is filled, We need to `re-size` the array, meaning we need to create a new array copy all the elements from the old array to the new array, and then add the new element.
* In the deletion operation, If the element has to be deleted from the end then it's simple, we can access by index and remove the item. But if it has to be deleted from the beginning, then we need to clear the item at the first position and shift all the elements from the right side to the left side.

### `When to use an array and when not to use array`
* If we know the size of items and we are involved in getting the elements by index, then we choose arrays
* If operations involve insertion and deletion that involves dynamically increasing and decreasing the element's size, we use a linked list.

### `Time Complexities`
| `Operation` | `Complexity` |
| ----------- | ------------ |
| Look up by index | O(1) |
| Look up by value | O(n) |
| Inserting        | O(n) |
| Deleting         | O(n) |












