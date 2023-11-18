## 📺 `Problem statement`
There are elements in the list, There can be a possibility of being a cycle in the list. If the cycle is found print is found and if not print that it is not found. 

## 🚡 `Input`
```kotlin
[1,2,3,4,5,6]
Here address of 6 is points to 3
```

## 📟 `Output`
```kotlin
Cycle Detected !
```

## 🧭 `Observation and explanation`
#### `Brute force approach`
* We can loop the elements of the list one by one and at each iteration add the address to a HashSet.
* When adding the elements to HashSet if the address already exists then it indicates that there is a cycle.
* This approach works but the problem with this is, It occupies `O(n)` in terms of `space complexity`.

### `Efficient solution`
* We can use `The Hare and Tortoise Algorithm` or in other words `The Floyd Warshall Algorithm`.
* Here we perform iteration until we encounter the null value.
* In each iteration we advance the hare by 2 steps and the tortoise by just one step.
* If the hare meets the tortoise in the iteration, we break the loop indicating cycle is found 
