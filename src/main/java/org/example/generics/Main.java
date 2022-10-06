package org.example.generics;

public class Main {
    public static void main(String[] args) {
        // Generic Class Example
        // initialize generic class with Integer data mentioned

        GenericsClassExample<Integer> intObj = new GenericsClassExample<>(8);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class with String data
        GenericsClassExample<String> stringObj = new GenericsClassExample<>("generic class example");
        System.out.println("Generic Class returns: " + stringObj.getData());

        // Generic Method Example
        // initialize the class with Integer data
        GenericsMethodExample demo = new GenericsMethodExample();

        // generics method working with String
        demo.<String>genericsMethod("Generic Method working with string");

        // generics method working with integer
        demo.<Integer>genericsMethod(69);

        // create an object of GenericsClass here only subclass of Number(Integer, Double, and so on). can be used
        BoundedTypesExample <Integer> obj = new BoundedTypesExample <>();

    }

}
