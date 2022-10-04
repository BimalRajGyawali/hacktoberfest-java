public class RunTimePolymorphism {
    public static void main(String[] args)
    {
        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods inside main() method

        a = new SubClass1();
        a.display();

        a = new SubClass2();
        a.display();
    }
}

    class Parent {

    // Method of parent class
        void display()    {   System.out.println("Parent Class"); }
    }

// Class 2
    class SubClass1 extends Parent {
        void display()    {   System.out.println("SubClass-1");     }
    }

// Class 3
    class SubClass2 extends Parent {

        void display()    {   System.out.println("SubClass-2");    }
    }