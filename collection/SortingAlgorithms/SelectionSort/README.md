<h1 align="center">Selection Sort</h1>

## `Complexities`

| 🆂🅿🅰🅲🅴 | 🆃🅸🅼🅴 |
| -------- | ------- |
| O(n) | O(n2) |


## `Approach`
* Like the bubble sort, We need multiple passes to sort the array.
* In each pass, We need to find the next smallest item and move it to the correct position.
* We pick the smallest item and swap it with the appropriate position.

### `Steps`
* Initially, we assume the entire array is un-sorted.
* We shall place the `pointer-1` at first `0th` index position.
* Now we use a second `for-loop` inside the parent `for-loop` and keep iterating it
* On each inner for-loop iteration we get the smallest element position and keep a reference
* At the end of each iteration of the inner for loop we perform the swapping.
* We keep doing multiple iterations of the parent loop and multiple iterations of children's loops.
* In the end the array would be sorted.

### `On comparison with bubble sort`  
* Here the time complexity is `O(n2)` but it's better than bubble sort because, at the end of each iteration, the `unsorted-array` size decreases.
