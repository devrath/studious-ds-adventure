<div align="center">
  
| `Contents` |
| ---------- |
| [`Building a heap`]() |

</div>

# `Building a heap`
* We shall use an `array` to build a `heap` instead of LinkedList. Because of this, we will save a lot of space.

<div align="center">

![added](https://github.com/devrath/studious-ds-adventure/assets/1456191/cb113271-be38-4929-98da-d9f6d1223671)

</div>

###`Calculate the index of children
```kotlin
left  =  parentIndex * 2 + 1
right =  parentIndex * 2 + 2
```

###`Calculate the index of a parent`
```kotlin
parent = (index-1)/2
```

