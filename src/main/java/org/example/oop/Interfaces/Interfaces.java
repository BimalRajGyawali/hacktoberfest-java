package org.example.oop.Interfaces;




// Interface
interface Test{
    int a =67;
    void engine(int dec);
    void horn(int kick);
}

// Abstract class
abstract class Test1{
    abstract void engine(int dec);
    abstract  int magsewa(int dev);
}


// class that is using interfaces as a template
class Car1 implements Test{

    public void engine(int dec){    // You have to give public as it is implemented from a interface.
        System.out.println("This class implements the interface");
    }
    public void horn(int kick){     // You have to give public as it is implemented from a interface.
        System.out.println("This class implements the interface");
    }

}

class Agsdh extends Test1{

    void engine(int dec){
        System.out.println("This is a class extended from a abstract class");
    }


    int magsewa(int dev){
        return 4;
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.engine(4);  // prints "This class implements the interface"

        Agsdh agsdh = new Agsdh();
        agsdh.engine(4); // prints "This is a class extended from a abstract class"
    }
}
