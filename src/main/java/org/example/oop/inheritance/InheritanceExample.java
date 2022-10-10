package org.example.oop.inheritance;
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int a) {
        System.out.println("I am in base and setting x now");
        x = a;
    }
}

class Derived extends Base
{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int b) {
        System.out.println("I am in Derived and setting y now");
        y = b;
    }
}


public class InheritanceExample{
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
    
        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
        
        
        
        
    }
    
 }