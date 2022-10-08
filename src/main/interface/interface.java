// this is interface definition where we just define the interface
// methods of interface has to be overidden by the class extending it
interface Interface1{  
    void print1(); 
    }  
    interface Interface2{  
    void print2();  
    } 
    
    // multiple inheritance in java is only possible using interfaces
    // If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.
    class Test implements Interface1,Interface2{  
    // we override print1() from interface1
    public void print1(){System.out.println("Hello from Interface1");}  
    // we override print2() from interface2
    public void print2(){System.out.println("Hello from Interface2");}  
      
     // all methods of both interfaces are implemented/defined here
    public static void main(String args[]){  
    Test obj = new Test();  
    // this object will have properties from both interfaces
    obj.print1();  
    obj.print2();  
     }  
    }  
        
    
    // output of the code above:
    // Hello from Interface1
    // Hello from Interface2
        
        
        
      