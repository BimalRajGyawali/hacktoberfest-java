package org.example.strings;

/**
 * @author rajeshp
 * @Date 10/15/22
 */
public class StringBlankCheckExample {

    public static void main(String[] args) {

        String var ="  ";

        //Checks if a string is empty
        System.out.println(var.isEmpty());

        //Checks if a string is blank
        System.out.println(var.isBlank());


    }
}
