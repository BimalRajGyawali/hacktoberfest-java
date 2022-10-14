package org.example.threads;

import static java.lang.System.out;

public class Threads {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // print the results, what fib() output
        out.println("fib(12): " + fib(12));
        out.println("fib(17): " + fib(17));

        // since we execute on the main thread
        // this statement is only executed when the
        // above two fib() function call finishes

        out.println("Took " + (System.currentTimeMillis() - start) + "ms");

        new Thread(() -> {
            out.println("fib(14): " + fib(14));
            out.println("fib(19): " + fib(19));
        }).start();

        // this statement is called, but the recursive
        // algorithm is running on another thread
        out.println("Wait, It's still running!");
    }

    private static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

/**
 * Execution output
 *
 fib(12): 144
 fib(17): 1597

 Took 5ms
 Wait, It's still running!

 fib(14): 377
 fib(19): 4181
 **/