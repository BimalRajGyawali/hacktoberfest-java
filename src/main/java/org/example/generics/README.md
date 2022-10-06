The Java Generics allows to create a single class, interface, and method that can be used with different types
of data (objects).
This aids in code Reusability
Generics do not work with primitive types. It can only be used with reference type

**Java Generics Class**
We can create a class that can be used with any type of data. Such a class is known as Generics Class.

Here is an example for a generic class in java

`class Main {
public static void main(String[] args) {

    // initialize generic class with Integer data

    GenericsClassExample<Integer> intObj = new GenericsClassExample<>(8);
    System.out.println("Generic Class returns: " + intObj.getData());

    // initialize generic class with String data
    GenericsClassExample<String> stringObj = new GenericsClassExample<>("I Love Java");
    System.out.println("Generic Class returns: " + stringObj.getData());
}
}

// create a generics class
class GenericsClassExample<T> {

// variable of T type
private T data;

public GenericsClassExample(T data) {
this.data = data;
}

// method that return T type variable
public T getData() {
return this.data;
}
}`

**Java Generics Method**
Similar to the generics class, we can also create a method that can be used with any type of data. Such a class
is known as Generics Method.

Here's is how you  can create a generics class in Java:

`class Main {
public static void main(String[] args) {

    // initialize the class with Integer data
    GenericsMethodExample demo = new GenericsMethodExample();

    // generics method working with String
    demo.<String>genericsMethod("Generic Method working with string");

    // generics method working with integer
    demo.<Integer>genericsMethod(69);
}
}

class GenericsMethodExample {

// creae a generics method
public <T> void genericsMethod(T data) {
System.out.println(" this is Generics Method:");
System.out.println("Data Passed: " + data);
}
}`

**Bounded Types**
In general, the type parameter can accept any data types (except primitive types).

However, if we want to use generics for some specific types (such as accept data of number types) only, then we 
can use bounded types.

In the case of bound types, we use the extends keyword. For example,

`<T extends R>`

This means T can only accept data that are subtypes of R.


**Example: Bounded Types can be shown in below code**

`class BoundedTypesExample <T extends Number> {

public void display() {
System.out.println("This is a bounded type generics class.");
}
}

class Main {
public static void main(String[] args) {

    // create an object of GenericsClass
    BoundedTypesExample <Integer> obj = new BoundedTypesExample <>();
}
}`

**Why Use Java Generics**

**1. Code Reusability**
   With the help of generics in Java, we can write code that will work with different types of data. For example,

`public <T> void genericsMethodExample(T data) {...}`
Here, we have created a generics method. This same method can be used to perform operations on integer
data, string data, and so on.

**2. Compile-time Type Checking**
The type parameter of generics provides information about the type of data used in the generics code. For example,

`// using Generics
GenericsClassExample<Integer> list = new GenericsClassExample<>();`

Here, we know that GenericsClass is working with Integer data only.

Now, if we try to pass data other than Integer to this class, the program will generate an error at compile time.

**3. Used with Collections**
The collections framework uses the concept of generics in Java. For example,

`// creating a string type ArrayList
ArrayList<String> list1 = new ArrayList<>();

// creating a integer type ArrayList
ArrayList<Integer> list2 = new ArrayList<>();`

In the above example, we have used the same ArrayList class to work with different types of data.

Similar to ArrayList, other collections (LinkedList, Queue, Maps, and so on) are also generic in Java.

