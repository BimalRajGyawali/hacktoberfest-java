/*
checks whether a string is a valid password
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Input a password (You are agreeing to the above Terms and Conditions.):
abcd1234
Password is valid: abcd1234
 */
package org.example.basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password rules:\\n\" +\n" +
                "                \"A password must have at least ten characters.\\n\" +\n" +
                "                \"A password consists of only letters and digits.\\n\" +\n" +
                "                \"A password must contain at least two digits.\\n\" +\n" +
                "                \"Input a password (You are agreeing to the above Terms and Conditions.):");

        String password = scanner.nextLine();
        boolean result = isPasswordValid(password);
        if (result)
            System.out.println("password is valid " + password);
        else
            System.out.println("Password is invalid");
        scanner.close();
    }

    //checks password and returns true if it satisfies the condition
    public static boolean isPasswordValid(String password) {
        if (password.length() < 10) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    //checks if input character is character
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    //checks if input character is a numeric value
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
}

