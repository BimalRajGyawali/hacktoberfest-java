//Java program to implement inheritance in interfaces
interface SampleInterface{
    void method1();
    void method2();
}
interface ChildSampleInterface extends SampleInterface{     //This interface inherits methods of Sampleinterface
    void method3();
    void method4();
}

class MySampleClass implements ChildSampleInterface{    //class cannot extend interface only implements.
    public void method1(){
        System.out.println("Method 1 from Sample Interface");
    }
    public void method2(){
        System.out.println("Method 2 from Sample Interface");
    }
    public void method3(){
        System.out.println("Method 3 from Child Sample Interface");
    }
    public void method4(){
        System.out.println("Method 4 from Child Sample Interface");
    }
}

public class InheritanceInInterfaces{
    public static void main(String[] args) {
        MySampleClass SC = new MySampleClass();
        SC.method1();
        SC.method2();
        SC.method3();
        SC.method4();
    }

}