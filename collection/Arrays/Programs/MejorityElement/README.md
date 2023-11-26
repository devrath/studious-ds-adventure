## 📺  `Merge Sorted array`

### 🧿 `Problem`
* You are given two integer arrays `nums1` and `nums2`
* They're sorted in non-decreasing order.
* There are two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.
* Merge nums1 and nums2 into a single array sorted in non-decreasing order.
* The final sorted array should not be returned by the function, but instead be stored inside the array nums1
* To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

### :electron: `Algorithm`
* We shall use three-pointers
  * `leftPointer` pointing to `m` which is the elements filled of the left array.
  * Then we shall use `rightPointer` pointing to `n` which is pointing to the elements filled in the right array.
  * Finally `resultPointer` points to the end of the left array.
* We shall add a for loop to loop until `rightPointer` is greater than or equal to zero
* Inside the loop we compare the elements at `leftPointer` of `leftArray` with the elements of `rightPointer` of `rightArray` based on which is a greater copy of the greatest element to `resultPointr` position of `leftarray`.


### 🧪 `TestCases`
**Example 1:**
```kotlin
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```
**Example 2:**
```kotlin
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```
**Example 3:**
```kotlin
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
```
