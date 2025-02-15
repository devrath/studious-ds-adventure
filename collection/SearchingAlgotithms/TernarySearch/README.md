<h1 align="center">Ternary Search</h1>

## `Complexities`

| 🆂🅿🅰🅲🅴 | 🆃🅸🅼🅴 |
| -------- | ------- |
|  O(1)    |   O(log3n)  |


## `Approach`
* Instead of dividing the array into `2-parts`, We divide the array into `3-parts`
* How to calculate on which position we need to set the points to divide the array
  * We first calculate the ---------> ```partitionSize = (right - left) / 3```
  * Calculate first mid-point ------> ```mid1 = left + partitionSize```
  * Calculate second mid-point ---> ```mid2 = right - partitionSize```

## `Is Ternary Search faster than Binary Search`
* No
