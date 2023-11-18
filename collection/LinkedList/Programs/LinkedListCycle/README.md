## 📺 `Problem statement`
There are elements in the linked list where duplicates are seen but there is a condition that they are sorted 


## 📟 `Output`
```kotlin
Elements before removing duplicates ----->[1-2-3-3-4]
Elements after removing duplicates ------>[1-2-3-4]
```

## 🧭 `Observation and explanation`
#### `Brute force approach`
* Here we take a set and iterate all the elements one by one and add them to the list.
* Then since the set keeps only unique elements, it ignores the duplicates. Finally, the set contains only unique elements
* We iterate the list again and create a new list which results in sorted unique elements.
* This is not an efficient solution if the data set is large (consumes extra space) also we need to perform iteration twice(`O(n2)`)

### `Efficient solution`
* We use a pointer approach.
* We shall use two pointers where one pointer will point to the position that has all unique elements and another pointer will iterate the elements as the current node.
