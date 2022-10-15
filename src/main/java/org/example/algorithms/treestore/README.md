# Tree Conversion

It is a method to store a `Node` or a `Tree` to an array so that it could be written to file and saved in the disk.

````java
7 + 3 * 2
Node('+', 7, Node('*', 3 * 2))
        
// converted into a single array form
[7, 3, 2, *, +]
// now we can write the array to a file

// revert the step back to get the original array
````