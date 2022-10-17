package org.example.strings;

/**
 * @author rajeshp
 * @Date 10/15/22
 */
public class StringPrintLines {
    public static void main(String[] args) {

        String var ="Hacktoberfest\n2022\nis\nLive !!!";

        //Prints var in separate lines
        var.lines().forEach(System.out::println);

    }
}
