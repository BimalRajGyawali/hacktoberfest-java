package org.example.algorithms;

/*
    Write a program to implement the search of all prime numbers up to n
    using the Sieve of Eratosthenes algorithm
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print primes in the range from 0 to (enter number): ");
        int n = sc.nextInt();

        System.out.println(sieve(n).toString());
    }

    public static ArrayList<Integer> sieve(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n must be a positive integer.");
        }

        ArrayList<Integer> primeList = new ArrayList<Integer>();
        ArrayList<Boolean> primeMap = new ArrayList<Boolean>();

        for (int i = 0; i < n; i++) {
            // Sieve even numbers greater than 2

            if (i > 2 && i % 2 == 0) {
                primeMap.add(false);
            }
            else {
                primeMap.add(true);
            }
        }

        for (int i = 3; i < Math.sqrt(n); i++) {
            // Sieves the rest of composite numbers

            if (primeMap.get(i)) {
                for (int j = (int) Math.pow(i, 2); j < n; j++) {
                    if (j % i == 0) {
                        primeMap.set(j, false);
                    }
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (primeMap.get(i)) {
                primeList.add(i);
            }
        }

        return(primeList);
    }
}
