package org.example.generics;

class GenericsMethodExample {

    // creae a generics method
    public <T> void genericsMethod(T data) {
        System.out.println(" this is Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
