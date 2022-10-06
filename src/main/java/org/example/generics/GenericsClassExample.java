package org.example.generics;

class GenericsClassExample<T> {

    // variable of T type
    private T data;

    public GenericsClassExample(T data) {
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }
}