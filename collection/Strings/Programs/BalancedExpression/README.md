## 📺 `Problem statement`
Here we are given a string that contains only brackets with integers and operators, We need to parse the elements and find out its a balanced expression

## 🧭 `Ideal Complexity`
* `TimeComplexity` - O(n)
* `SpaceComplexity` - O(n)

## ⛰️ `Approach`
* Using Stack -> Time efficient but not space efficient
* Using sliding window technique -> Time and space efficient (Efficient and best choice)

## 📟 `Output`
```kotlin
Input ---> {2+3}
Output ---> Valid
----------------
Input ---> {2+3
Output ---> In-Valid
```
