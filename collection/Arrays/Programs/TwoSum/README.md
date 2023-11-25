## 📺  `Two Sum`

### 🧿 `Problem`
* Given an array of integer nums and an integer target, return indices of the two numbers such that they add up to the target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
* You can return the answer in any order.

### :electron: `Algorithm`
* We know the target element and a bunch of input elements.
* Now using the 2 parameters that are known, we shall find the result parameter.
* Basically we shall keep a `hashmap` and add the `key,value` pairs where `key` is the items and `value` is the index of the item.
* Now we loop the input array again and use the formulae `Result = Target - ItemUnderLoop`.
* We check in each iteration If the `Result` is present in the initial hashmap prepared.
* If the item is present then get the `index(value)` by using the `key(result)`.
* Result will be `that index` and the `current index` in the loop. Add a condition here that if both are not equal, if equal, return zero for both index

### 🧪 `TestCases`
**Example 1:**
```kotlin
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```
**Example 2:**
```kotlin
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
**Example 3:**
```kotlin
Input: nums = [3,3], target = 6
Output: [0,1]
```



