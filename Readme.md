# Datastructure
<p>
<img src="https://www.vectorlogo.zone/logos/visualstudio_code/visualstudio_code-icon.svg" alt="Vscode" width="30" height="30"/>
<img src="https://www.vectorlogo.zone/logos/java/java-icon.svg" alt="java" width="30" height="30"/>
</p> 

This repo contains a series of DS problems solved in JAVA.

## Directory

```bash
📦DataStructures
 ┣ 📂LinkedList
 ┃ ┣ 📂Problems
 ┃ ┃ ┣ 📜DetectLoopOrCyclic.java
 ┃ ┃ ┣ 📜KthNodeFromEnd.java
 ┃ ┃ ┣ 📜MiddleElementOfLinkedList.java
 ┃ ┃ ┗ 📜RemoveDuplicate.java
```

## Problems

```
   ◾ Middle element of linked list
   ◾ Detect Loop/Cyclic in linked list
   ◾ Get 3rd (Kth) node end/ tail of linked list
   ◾ Remove duplicates from a sorted linked list
   ◾ Print the linked list in reverse
```

## Logic
❌ __Middle element of linked list__
```
     - Initialize Two pointers and head node should not be null
     - One pointer should traverse the LL 1 by 1 and another pointer by 2
     - When one pointer reaches the tail another reaches the mid of node

```
❌ __Detect Loop/Cyclic in linked list__
```
     - Initialize Two pointers and head node should not be null
     - One pointer should traverse the LL 1 by 1 and another pointer by 2
     - if two pointers are == then ll contains Loop

```
❌ __Get (3rd)Kth Node from last/tail of linked list__
```
     - Initialize Two pointers and head node should not be null
     - One poniter should traverse the ll by 1 till end. count will also increase
     - When n is equal to count the loop breaks and the other pointer reaches the nth value in node

```
❌ __Remove Duplicates element from a sorted linked list__
```
     - Initialize a reference pointer for head node
     - Traverse the linked list till last node with ref
     - Compare the current(ref) node with next node(temp) if data matches delete the node

```
❌ __Print the linked list in reverse(iterative)__
```
     - Check head should not be null
     - Call the reverse function and pass head as agrument
     - If that argument node is not null it will check all node and till last node and again it repeats and it prints the value

```
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)

<p align="center">
<a href='https://ko-fi.com/C0C12CBIQ' target='_blank'><img height='36' style='border:0px;height:36px;' src='https://cdn.ko-fi.com/cdn/kofi3.png?v=5' border='5' alt='Buy Me a Coffee at ko-fi.com' /></a>
</p>
