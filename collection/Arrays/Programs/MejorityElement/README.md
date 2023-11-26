## 📺  `Mejority Element`

### 🧿 `Problem`
* Given an array nums of size n, return the majority element.
*  You may assume that the majority element always exists in the array.


### :electron: `Algorithm`
* We can calculate this with items in-place and with a single loop.
* We keep `two-variables` namely `mejorityElement` and `frequency`.
* In the first iteration we keep the first item as `majorityElement` element and increase the `frequency` by one.
* Next in subsequent iterations, if the iterating element is the same as `majorityElement` then increase `frequency` by one.
* If the iterating element is different, we don't change the `majorityElement` unless its `frequency` is zero but decrease the `frequency` by one
* if `frequency` is zero and a different element is found in the iterating element, change the `majorityElement` to new element and increase the `frequency` counter by one.
* Keep doing this until the loop completes.
* return the last updated `majorityElement` as the answer.


### 🧪 `TestCases`
**Example 1:**
```kotlin
Input: nums = [3,2,3]
Output: 3
```
**Example 2:**
```kotlin
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```
