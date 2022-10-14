package org.example.reflection;

import java.lang.reflect.Field;

import static java.lang.System.out;

public class FieldModificationDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // create an instance of BestFruit
        // we will be changing the name of the
        // fruit, which is stored in private variable

        BestFruit fruit = new BestFruit("Apple");
        out.println("Before modification " + fruit.getName());

        // target the field named 'name'
        // use getDeclaredField() instead of getField()
        // because getDeclaredField()
        // lists all the fields present in the class including the private one's.

        Field field = BestFruit.class.getDeclaredField("name");

        // make the field accessible to modify
        field.setAccessible(true);

        // make changes ont the instance
        // and set name ot Mango
        field.set(fruit, "Mango");

        out.println("After modification: " + fruit.getName());
    }
}
