/*
Reflection is a feature in the Java programming language.
It allows an executing Java program to examine or "introspect" upon itself,
and manipulate internal properties of the program.
For example, it's possible for a Java class to obtain the names of all its members and display them.
 */
package org.example.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-10-02
 */
public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName() throws ClassNotFoundException
        Class<?> student = Class.forName("org.example.reflection.Student");
        //gives the array of methods declared in Student class
        Method[] methods = student.getDeclaredMethods();

        //array of methods is converted into list of sorted strings(method names)
        List<String> methodList = Arrays.stream(methods).toList() // converts array of Method to List of Method
                .stream().map(Method::getName) //takes each method and extracts its name in String format
                .sorted() // names of all the methods are sorted alphabetically
                .toList(); // all the sorted Method names are converted into list

        //method names in the list are printed
        methodList.forEach(System.out::println);
    }
}
