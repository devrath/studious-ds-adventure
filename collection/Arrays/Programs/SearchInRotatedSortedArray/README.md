## 📺  `Move Zeros`

### 🧿 `Problem`
* Given an integer array nums, move all 0's to the end
* Maintain the relative order of the non-zero elements.
* Must do this in place without making a copy of the array.

### :electron: `Algorithm`
* We shall use two pointers 
* Tracking pointer:-> To navigate the entire array in one traversal
* Counter pointer:-> To keep track of the position till which contains elements with no zeros
* Traverse the entire array and copy the elements one one to the left on the counter pointer
* Now at this position, all the elements are moved to the left maintaining the relative ordering
* Fill the remaining positions with zero since we had track of the counter pointer

### 🧪 `TestCases`

**Example 1:**
```kotlin
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```
**Example 2:**
```kotlin
Input: nums = [0]
Output: [0]
```
