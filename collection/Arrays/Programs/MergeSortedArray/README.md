## 📺  `Remove Duplicates from Sorted Array`

### 🧿 `Problem`
* Given an integer array nums sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
* Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
  * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The 
    remaining elements of nums are not important as well as the size of nums.
  * Return k.

### :electron: `Algorithm`
* We shall use two pointers `left-pointer` and `right-pointer`.
* We shall use a loop and keep iterating until the `right-pointer` is less than the `total size`.
* On each iteration, If the item at `left-pointer` is equal to the item at `right-pointer` increment the `right-pointer` --- > Keep doing this.
* If on an iteration, `right-pointer` becomes greater than `left-pointer` --> increment left `left-pointer` and then copy item at `right-pointer` to `left-pointer`
* Wait until the loop gets finished.
* Now once the loop ends, increment the counter of `left-pointer` because the array position starts from zero.
* Return the `left-pointer` value as result.

### 🧪 `TestCases`
**Example 1:**
```kotlin
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```
**Example 2:**

```kotlin
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```


