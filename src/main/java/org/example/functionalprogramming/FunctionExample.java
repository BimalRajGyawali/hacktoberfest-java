package org.example.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        int incrementedValue = incrementByOneFunction.apply(1);
        System.out.println(incrementedValue);

        int multipliedValue = multiplyBy10Function.apply(incrementedValue);
        System.out.println(multipliedValue);

        //Now If we want to chain multiple function we can do that using the andThen method.
        Function<Integer, Integer> add1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("andThen Output\n" + add1AndThenMultiplyBy10.apply(1));

        //BiFunction.
        System.out.println("Using BiFunction\n" + incrementByOneAndMultiplyBiFunction.apply(4,10));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;
    // Function<Input Type, Return Type> functionName = var -> changeInVariable;
    // This is basically a function defined as a variable in the same class in which we want to use it.
    // To give the value to the only parameter we use apply method.
    // These are functional Interface.

    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;

    // Creating a BiFunction, a function which takes two input and produces an output.
    // Normal Approach
    static int incrementByOneAndMultiply (int number, int multiplyBy) {
        return (number+1)*multiplyBy;
    }

    // Using BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    // Here we take use of a lambda expression that takes two input values and returns a single Integer Value
    // The types of these values are defined in the

}
