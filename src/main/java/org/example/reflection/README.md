Reflection is a feature in the Java programming language.
It allows an executing Java program to examine or "introspect" upon itself, and manipulate internal properties of the program.<br><br>
For example, it's possible for a Java class to obtain the names of all its members and display them.

The reflection classes, such as `Method`, are found in `java.lang.reflect` package.

There are 3 steps that must be followed to use these classes.

 1. The first step is to obtain a `java.lang.Class `object for the class that we want to manipulate.
    `java.lang.Class` is used to represent classes and interfaces in a running Java program.<br><br>

 2. The second step is to call a method such as `getDeclaredMethods`, to get a list of all the methods declared by the class.<br><br>

 3. Then the third step is to use the reflection API to manipulate the information.<br><br>
     For example, the sequence:<br><br>

     `Class c = Class.forName("java.lang.String");` <br>
     `Method m[] = c.getDeclaredMethods();`<br>
     `System.out.println(m[0].toString());`