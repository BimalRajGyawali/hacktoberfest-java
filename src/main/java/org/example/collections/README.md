# Collection

### Description

-------
This sub package contains information about Java Collection Framework

### Collection

-------
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.A Collection represents a single unit of objects, i.e., a group.

The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
- Interfaces and its implementations, i.e., classes
- Algorithm

![Collection](./java-collection-hierarchy.png)

### Advantages of Collection framework

-----------

- **Consistent API**: The API has a basic set of interfaces like Collection, Set, List, or Map, all the classes (ArrayList, LinkedList, Vector, etc.) that implement these interfaces have some common set of methods.

- **Reduces programming effort:** A programmer doesn’t have to worry about the design of the Collection but rather he can focus on its best use in his program. Therefore, the basic concept of Object-oriented programming (i.e.) abstraction has been successfully implemented.

- **Increases program speed and quality**: Increases performance by providing high-performance implementations of useful data structures and algorithms because in this case, the programmer need not think of the best implementation of a specific data structure. He can simply use the best implementation to drastically boost the performance of his algorithm/program.
 
## Methods of Collection Interface

| Method                    | Description                                                                                      |
|---------------------------|--------------------------------------------------------------------------------------------------|
| add(Object)               | This method is used to add an object to the collection.                                          |
| addAll(Collection c)      | This method adds all the elements in the given collection to this collection.                    |
| clear()                   | This method removes all of the elements from this collection.                                    |
| contains(Object o)        | This method returns true if the collection contains the specified element.                       |
| containsAll(Collection c) | This method returns true if the collection contains all of the elements in the given collection. |
| equals(Object o)          | This method compares the specified object with this collection for equality.                     |
| hashCode()                | This method is used to return the hash code value for this collection.                           |
| isEmpty()                 | This method returns true if this collection contains no elements.                                |
| iterator()                | This method returns an iterator over the elements in this collection.                            |
| max()                     | This method is used to return the maximum value present in the collection.                       |


