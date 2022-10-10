package org.example.functionalprogramming;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL.get());
        System.out.println(namesOfMonth.get());
    }

    static Supplier<String> getDBConnectionURL = () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>> namesOfMonth = () ->
            List.of("January", "February", "March", "April", "May", "June", "July",
                    "August", "September", "October", "November", "December");

}
