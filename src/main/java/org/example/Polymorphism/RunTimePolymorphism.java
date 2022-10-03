public class RunTimePolymorphism {
    public static void main(String[] args)
    {
        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods inside main() method

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}

    class Parent {

    // Method of parent class
        void Print()    {   System.out.println("parent class"); }
    }

// Class 2
    class subclass1 extends Parent {
        void Print()    {   System.out.println("subclass1");     }
    }

// Class 3
    class subclass2 extends Parent {

        void Print()    {   System.out.println("subclass2");    }
    }