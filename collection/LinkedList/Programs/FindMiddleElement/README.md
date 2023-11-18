## 📺 `Problem statement`
Finding the middle element is the linked list. The condition is that the length of the linked list is not given.

## 📟 `Output`
```kotlin
For Odd number of elements ---> [4,8,15,16,23]
Middle element ---------------> 15
```
```kotlin
For Even number of elements --> [4,8,15,16,23,42]
Middle element ---------------> 16
```

## ⛰️ `Explanation`
### `Brute force approach`
* We find the length of the list -------------> This involves traversing the entire list once.
* Then we divide the length variable by 2 ----> This gives the middle element in the list.
* Now we traverse again until this position --> Return the element at this position.
* Drawback here:-> If the linked list is large then this involves 2 iterations which is not the best possible solution 

### `Best solution`
* We use the formulae using 2 pointers
  * The first pointer will move two steps on each iteration.
  * The second pointer will move one step on each iteration.
* When to stop the iteration -> We return the element at the first pointer.
  * In the case of even numbers, when the second pointer is at the end of the list(last element) 
  * In the case of the odd numbers, when the second pointer is at the null position in the list(crossed the last element in the list)
