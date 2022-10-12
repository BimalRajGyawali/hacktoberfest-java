package org.example.designpatterns.singleton;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-10-11
 */
public class Demo {

    public static void main(String[] args) {

        //initializing the instance of Singleton class
        Singleton instance1 = Singleton.getSingleInstance();

//        no args constructor is of type private, so it can't be called
//        Singleton singleton = new Singleton();


        //gives output as 1
        System.out.println(instance1.getNum());

        //num variable was incremented
        instance1.incrementNum();

        //we tried to create a new instance but the getSingleInstance() always returns same instance
        Singleton instance2 = Singleton.getSingleInstance();

        //the updated value of num as 2 is printed
        //meaning previous instance was returned by getSingleInstance()
        System.out.println(instance2.getNum());
    }

}
