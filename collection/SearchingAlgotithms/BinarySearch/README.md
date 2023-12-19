<h1 align="center">Binary Search</h1>

## `Complexities`

| 🆂🅿🅰🅲🅴 | 🆃🅸🅼🅴 |
| -------- | ------- |
|  O(1)    |   O(logn)  |


## `Preconditions for Binary search`
* Our arrays need to be sorted for an array where binary search can be applied.
* If the arrays are not sorted, We need to sort them using the `linear search` depending on the cost of the use case.

## `Why binary search is faster than the linear search`
* It is faster because, on every iteration, We reduce the number of elements we need to search by half.
* Because of this, the time taken to find an element is very fast.

## `How binary search works`
* Take an array and get the middle element in the array.
* The two pointers `LeftIndex` points to the beginning of the array, and The pointers `RightIndex` points to the end of the array.
* Find the Middle element, It can be found by the formulae `(leftIndex + rightIndex)/2`. It returns the index of the middle element.
* Check if the item in the middle index is the item we are searching for. If the Item is found then return the index.
* If the item is not found, Check the item we are searching for is lesser than the middle element or greater.
* Based on the condition, We search either the left part of the array or the right part of the array.
* We keep repeating it until our left pointer is greater than the right pointer.
* If the element is not found, Then return the `-1` as a result.


