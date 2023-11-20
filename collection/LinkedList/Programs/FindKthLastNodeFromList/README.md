## 📺 `Problem statement`
Here we need to find the element value of the node for a position given from the end of the list.

## 🚡 `Input`
```kotlin
Elements in list are: -> [10-20-30-40-50]
Position: -> 2
```

## 📟 `Output`
```kotlin
Result -> 40
```

## 🧭 `Observation and explanation`
#### `Brute force solution`
  * We can use a `Hash map` and iterate all the elements one by one and add the `position` as `key` and the element value as `value` and prepare the list.
  * Now we can get the total elements in the `Hash map` from getting its size.
  * Now `ResultPosition = totalElements - inputPostionFromEnd` ==> `map.get(ResultPosition)`
  * The drawback of this is that `extra space` is needed. 

#### `Efficient solution`
  * We shall take 2 pointer nodes and perform the operation
  * We start by keeping both pointers at the head node(Beginning of the list).
  * Now as an initial state say we want to find the `3rd` last element from the end, we move one of the pointers to the `3rd` position from the beginning of the list.
  * Now once the initial conditions are set we start moving both pointers until the pointer ahead is not equal to null.
  * Once it is equal to null, get the element from the position of the first pointer.
