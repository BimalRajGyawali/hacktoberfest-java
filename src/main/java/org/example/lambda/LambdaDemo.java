/*
Lambda expressions are a simpler way of defining the body of abstract method of a functional interface.
We don't need a class to implement an interface just to write the body of its abstract method.
Lambda expressions make the method implementation easier and the code looks clean with minimum amount of effort.
We can pass code as an argument while using lambda expressions.
 */
package org.example.lambda;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-10-04
 */
public class LambdaDemo {

    static void usePrintable(Printable printable) {
        printable.print("world!");
    }

    static Integer useSummable(Summable summable) {
        return summable.sum(30, 40);
    }

    public static void main(String[] args) {
        //here, we're writing our own implementation for print() in Printable interface
        Printable printImplementation = (a) -> System.out.println("Hello " + a);
        //here, we're writing our own implementation for sum() in Summable interface
        Summable sumImplementation = Integer::sum;// equivalent to '(a,b) -> Integer.sum(a,b);'

        //we're using the lambda expression in a function call
        usePrintable(printImplementation);
        System.out.println(useSummable(sumImplementation));

        Performer performer = (a, b) -> {
            System.out.println("Inside perform task method");
            return a + b;
        };

        System.out.println(performer.performTask(30, 50));
    }
}
