## 📺  `Generate Parenthesis`

### 🧿 `Problem`
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

### :electron: `Algorithm`
![Untitled Diagram drawio](https://github.com/devrath/studious-ds-adventure/assets/1456191/509e981a-eeab-44aa-800e-387363be9e71)

#### `Rules`
* When `n = 2`
* Start with an open bracket
* Open bracket until `n < 2`
* Close bracket until `Closed < Open`



### 🧪 `TestCases`
**Example 1:**
```kotlin
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
```
**Example 2:**
```kotlin
Input: n = 1
Output: ["()"]
```
