<h1 align="center">Selection Sort</h1>


## `Approach`
* Like the bubble sort, We need multiple passes to sort the array.
* In each pass, We need to find the next smallest item and move it to the correct position.
* Basically we pick the smallest item and swap it with the appropriate position.

### `Steps`
* Initially, we assume the entire array is un-sorted.
* We shall place the `pointer-1` at first `0th` index position.
* Now we iterate the entire array in the first iteration and keep track of the index of the largest element by comparing each element.
  * At the end of each iteration, We swap the `pointer-1` with the smallest item.
* We keep repeating until the `pointer-1` reaches the end of the array.
