## 📺 `Problem statement`
Here we are given a string that contains only parenthesis, We need to parse the parenthesis and let us know if it is valid.

## 📟 Output
```
Input: [{()}]
Output: Valid
---------------
Input: ]{()}]
Output: Invalid
---------------
Input: [)(]
Output: Invalid
```

## ⛰️ `Approach`
* We shall use a stack structure
* We shall loop the string using the `size of the string` and the `char at position`
* As we loop the elements with the first set of `if` conditions as we encounter `open brackets` we add corresponding `closed brackets` to the stack.
* Now in the last `else-condition`, we shall have another `if-condition` where we check that `if the stack is empty` --> This indicates that we did not encounter any of the open brackets and we just encountered a first closing bracket, we return false since its invalid string.
* Then we can have more corresponding `if-conditions` for the brackets we have added earlier but now we pop each of the brackets in the stack one by one in each iteration and compare with the iteration element in the index of the `for-loop`
* After `for-loop` ends we see if the stack is empty and return true indicating its valid parenthesis.
* If the stack is not empty it indicates that it is not a valid parenthesis.

## 🧭 `Ideal Complexity`
* `TimeComplexity` - O(n) - Since we loop the entire array
* `SpaceComplexity` - O(n) - Since we use a stack
