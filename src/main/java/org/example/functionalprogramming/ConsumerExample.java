package org.example.functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // greetCustomer(new Customer("Maria", "123456789"));

        // Using Consumer
        greetCustomerConsumer.accept(new Customer("Maria", "123456879"));

        // Using BiConsumer
        greetCustomerWithOrWithoutPhoneNumber.accept(new Customer("Maria", "123456879"), false);

    }

    // This is the primitive method of a function taking an object as argument and using
    // its fields to produce some output.
    static void greetCustomer(Customer cust) {
        System.out.println("Hello " + cust.cusName +
                ", thanks for registering with Ph. No " + cust.cusPhoneNum + "\n");
    }

    static class Customer {
        private final String cusName;
        private final String cusPhoneNum;

        public Customer(String cusName, String cusPhoneNum) {
            this.cusName = cusName;
            this.cusPhoneNum = cusPhoneNum;
        }
    }

    // Using Functional Interface

    // Consumer -> takes an argument but returns nothing.
    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.cusName
        + ", thanks for sharing your Ph. No. with us " + customer.cusPhoneNum + "\n");
    };

    static BiConsumer<Customer, Boolean> greetCustomerWithOrWithoutPhoneNumber = ((customer, showPhNumber) -> {
        System.out.println("Hello " + customer.cusName +
                ", thanks for registering with your Ph. number " +
                (showPhNumber ? customer.cusPhoneNum : "*********"));
    });

}
