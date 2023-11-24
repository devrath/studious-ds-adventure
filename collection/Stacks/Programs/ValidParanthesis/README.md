## 📺 `Problem statement`
There are only parentheses, We need to determine if a valid parenthesis structure is found. Meaning, that opening parenthesis corresponds to proper closing parenthesis

## 📟 `Demo`
```kotlin
Input: [{}]
Output: Balanced expression --> true
```

## 🧭 `Complexity`
* `TimeComplexity` - O(n)
* `SpaceComplexity` - O(n)

## ⛰️ `Explanation`
* We keep a stack and keep adding the opposite character to the stack when we encounter the opening character
* After all the opening brackets if conditions are added, In the else condition check if the stack is empty meaning if no opening brackets are not added indicating that this already is not balanced.
* Now at this moment, all the opening brackets are added to the stack
* Next to the else condition of the empty check, Keep poping each character and compare it with the iterated character, if they are not equal, the return expression is not balanced.
* finally if all the elements are popped, at this state if the stack is empty, it indicates valid parenthesis is present.
