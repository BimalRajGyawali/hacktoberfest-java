Reflection is a feature in the Java programming language.
It allows an executing Java program to examine or "introspect" upon itself, and manipulate internal properties of the program.<br><br>
For example, it's possible for a Java class to obtain the names of all its members and display them.

The reflection classes, such as `Method`, are found in `java.lang.reflect` package.

There are 3 steps that must be followed to use these classes.

 1. The first step is to obtain a `java.lang.Class `object for the class that we want to manipulate.
    `java.lang.Class` is used to represent classes and interfaces in a running Java program.<br><br>

 2. The second step is to call a method such as `getDeclaredMethods`, to get a list of all the methods declared by the class.<br><br>

 3. Then the third step is to use the reflection API to manipulate the information.<br><br>
     For example, the sequence:

````java
    Class c = Class.forName("java.lang.String");
    Method m[] = c.getDeclaredMethods();
    System.out.println(m[0].toString());
````

## Field Modification

Changing the data stored in the fields are possible through Reflections.
<br>

They can be marked `private`.
<br>
However, if the field is marked as `final`, in few of the cases, it may fail.

````java
// BestFruit is a class name we target, 
// and 'name' is the private field

Field field = BestFruit.class.getDeclaredField("name");

// make the field accessible
field.setAccessible(true);

// use the set() method to make changes
// to the field, fruit in out case is an instance of BestFruit
        
field.set(fruit, "Mango");
````