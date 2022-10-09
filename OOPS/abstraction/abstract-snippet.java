// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)
// Abstract class needs to be extended and its method implemented. 
// It cannot be instantiated.

abstract class Car{  
  abstract void run();  
}  
class Maruti extends Car{  
void run(){System.out.println("running safely..");}  
public static void main(String args[]){  
 Car obj = new Car();  
 obj.run();  
}  
}  
