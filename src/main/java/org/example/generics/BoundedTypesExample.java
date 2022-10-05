package org.example.generics;

class BoundedTypesExample <T extends Number> {

    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}