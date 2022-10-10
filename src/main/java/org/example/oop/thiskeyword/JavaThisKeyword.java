package org.example.oop.thiskeyword;

public class JavaThisKeyword {
    public static void main(String[] args) {
        // Student s1 = new Student(111, "ankit", 5000f);
        // Student s2 = new Student(112, "sumit", 6000f);
        // s1.display();
        // s2.display();
        // Test object = new Test();
        // Test1 object = new Test1();
        // object.get().display();
        // Test2 object = new Test2();
        // object.display();
        // Test3 object = new Test3();
        // object.get();
        // Test5 obj = new Test5();
    }
}

// 'this' keyword is used to refer to the current class instance variable
class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) { // parameterised constructor having 3 parameters
        // using 'this' keyword, we can refer current class instance variables if the
        // formal arguments and instance variables are same.
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
        // Output
        // 111 ankit 5000.0
        // 112 sumit 6000.0
    }
}

// Using this() to invoke current class constructor. It is used for constructor
// chaining,i.e., calling other constructor from the current constructor.
class Test {
    int a;
    int b;

    // Default constructor
    Test() {
        this(10, 20);
        System.out.println("Inside default constructor \n");
    }

    // Parameterized constructor
    Test(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
}

// Using ‘this’ keyword to return the current class instance
// We can return this keyword as an statement from the method. In such case,
// return type of the method must be the class type.
class Test1 {
    int a;
    int b;

    // Default constructor
    Test1() {
        a = 10;
        b = 20;
    }

    // Method that returns current class instance
    Test1 get() {
        return this;
    }

    // Displaying value of variables a and b
    void display() {
        System.out.println("a = " + a + " b = " + b);
        // Output
        // a = 10 b = 20
    }
}

// Using 'this' keyword to invoke current class method
// We can invoke the method of the current class by using the this keyword. If
// not used, compiler automatically adds this keyword while invoking the method.
class Test2 {
    void display() {
        // calling function show()
        // show();
        this.show(); // same as show() // it will first print the content of show() function
        System.out.println("Inside display function");
        // Output
        // Inside show function
        // Inside display function
    }

    void show() {
        System.out.println("Inside show function");
    }
}

// Using 'this' keyword as an argument in the method
// It is mainly used in the event handling.
class Test3 {
    int a;
    int b;

    // Default constructor
    Test3() {
        a = 10;
        b = 20;
    }

    // Method that receives 'this' keyword as parameter
    void display(Test3 obj) {
        System.out.println("a = " + obj.a + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
        // Output
        // a = 10 b = 20
    }
}

// Using ‘this’ keyword as an argument in the constructor call
// We can pass the this keyword in the constructor also. It is useful if we have
// to use one object in multiple classes
// Class with object of Class Test5 as its data member
class Test4 {
    Test5 obj;

    // Parameterized constructor with object of Test5
    // as a parameter
    Test4(Test5 obj) {
        this.obj = obj;

        // calling display method of class Test5
        obj.display();
        // Output
        // Value of x in Class Test5 : 5
    }

}

class Test5 {
    int x = 5;

    // Default Constructor that create a object of Test4
    // with passing this as an argument in the constructor
    Test5() {
        Test4 obj = new Test4(this);
    }

    // method to show value of x
    void display() {
        System.out.println("Value of x in Class Test5 : " + x);
    }
}
