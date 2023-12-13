![github-header-image (1)](https://github.com/devrath/studious-ds-adventure/assets/1456191/b66e5691-755f-499e-9fab-fdc18ec78759)

## `Complexities`

| 🆂🅿🅰🅲🅴 | 🆃🅸🅼🅴 |
| -------- | ------- |
| O(n) | O(n2) |


## `Approach`
* It is the simplest of sorting techniques.
* We would be given an array of unsorted numbers, We need to sort them in ascending order.
* Here we scan the items from left to right, If the order is different, We swap them.

### `Steps`
* The data set is `[8,2,4,1,3]`
* When the first iteration is complete, The output is `[2,4,1,3,8]`
* So at each iteration the largest element reaches the end of the array, Thus we will need multiple iterations to sort the elements completely.
* Now on each new iteration, we know highest element reaches to end so in the new new iteration, one comparision should be less to be more efficient.
  
