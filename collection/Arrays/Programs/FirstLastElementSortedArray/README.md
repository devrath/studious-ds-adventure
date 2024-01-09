## 📺  `Find the First and Last Position of the Element in the Sorted Array`

### 🧿 `Problem`
* Given a target number, Find the `index` of the first and last occurrence of the target number in the array.
* If the target value is not present, return -1

### :electron: `Algorithm`
* See one thing to note here is that the array is sorted.
* Since the array is sorted, the Element on the left of the `target` element will be smaller and the element in the right of the `target` element will be larger.
* We can apply a binary search for this.


### 🧪 `TestCases`

**Example 1:**
```kotlin
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```
**Example 2:**
```kotlin
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```
**Example 3:**
```kotlin
Input: nums = [], target = 0
Output: [-1,-1]
```
