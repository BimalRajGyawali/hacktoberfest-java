package org.example.collections;

import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> jvmLanguages = List.of("Java", "Kotlin", "Groovy");

        jvmLanguages.forEach(System.out::println);
        System.out.println(jvmLanguages.size());

        List<String> javaFrameworks = Arrays.asList("Spring", "Micronaut", "Quarkus", "Javalin");
        javaFrameworks.forEach(System.out::println);
    }
}
