## 📺 `Problem statement`
Inserting a new element at a particular position at a linked list

## 📟 `Output`
Existing `data-set` --  Elements ->[10-20-30]

------------
_**DATA-SET**_
```
int position = -1;
int valueToSet = 88;
```
_**OUTPUT**_
```
Invalid operation since, Position is invalid
```
------------
_**DATA-SET**_
```
int position = 9;
int valueToSet = 88;
```
_**OUTPUT**_
```
Invalid operation since, Position is invalid
```
------------
_**DATA-SET**_
```
int position = 0;
int valueToSet = 88;
```
_**OUTPUT**_
```
Elements ->[99-10-20-30]
Head ----->99
Tail ----->30
Length --->4
```
------------
_**DATA-SET**_
```
int position = 3;
int valueToSet = 88;
```
_**OUTPUT**_
```
Elements ->[10-20-30-99]
Head ----->10
Tail ----->99
Length --->4
```
------------
_**DATA-SET**_
```
int position = 2;
int valueToSet = 88;
```
_**OUTPUT**_
```
Elements ->[10-20-99-30]
Head ----->10
Tail ----->30
Length --->4
```
