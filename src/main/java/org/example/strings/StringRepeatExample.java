package org.example.strings;

/**
 * @author rajeshp
 * @Date 10/15/22
 */
public class StringRepeatExample {

    public static void main(String[] args) {

        String var ="HacktoberFest 2022";

        //Concatenate the var 2 times
        System.out.println(var.repeat(2));

        //Prints empty string
        System.out.println(var.repeat(0));

        //Print the var
        System.out.println(var.repeat(1));


    }
}
