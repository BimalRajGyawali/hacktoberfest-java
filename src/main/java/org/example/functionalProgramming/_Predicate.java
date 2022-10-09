package org.example.functionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid.test("9198916644"));

        // Chaining the predicates
        boolean res = isPhoneNumberValid.and(containsNumber3).test("9198976544");
        System.out.println(res);

        boolean orRes = isPhoneNumberValid.or(containsNumber3).test("9146865656");
        System.out.println(orRes);

        boolean biRes = isValidName.test("Aryan", "Upadhyay");
        System.out.println(biRes);
    }

    // Predicate is a boolean returning function that takes one input.
    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("91") && (phoneNumber.length() == 10);

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static BiPredicate<String, String> isValidName = (fName, lName) ->
            (fName.length()!=0 && !lName.equals(fName));
}
