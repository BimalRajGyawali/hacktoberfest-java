package org.example.collections;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> jvmLanguages = List.of("Java", "Kotlin", "Groovy");

        jvmLanguages.forEach(System.out::println);
    }
}
