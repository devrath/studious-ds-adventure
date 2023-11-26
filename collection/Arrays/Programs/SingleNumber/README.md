## 📺  `Single Number`

### 🧿 `Problem`
* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
* You must implement a solution with a linear runtime complexity and use only constant extra space.

### :electron: `Algorithm`
* We can use `XOR` operator for this.
* We shall keep an initial value in a variable from the first index, Then in a loop from the next index we iterate and perform `xor` operation.
* The result we replace with the initial variable field on each iteration and return it after loop is completed.

### 🧪 `TestCases`
**Example 1:**
```kotlin
Input: nums = [2,2,1]
Output: 1
```
**Example 2:**
```kotlin
Input: nums = [4,1,2,1,2]
Output: 4
```
**Example 3:**
```kotlin
Input: nums = [1]
Output: 1
```
