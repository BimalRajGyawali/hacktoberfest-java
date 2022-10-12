package org.example.numbercrunching;

import java.util.*;

public class GoldBach {
    int n, f, i, j, k = 0;
    int a[] = new int[50];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an even num b/w 9&50");
        n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("valid input");
        else if (n % 2 != 0)
            System.out.println("invalid input,num is odd");
        else if (n <= 9 || n >= 50)
            System.out.println("invalid input,num is out of range");
    }

    void num() {
        for (i = 2; i <= n; i++) {
            f = 1;
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    f = 0;
            }
            if (f == 1)
                a[k++] = i;
        }
        System.out.println("prime pairs are: ");
        for (i = 0; i < k; i++) {
            for (j = i; j < k; j++)
                if (a[i] + a[j] == n)
                    System.out.println(a[i] + ",\t" + a[j]);
        }
    }

    public static void main(String[] args) {
        GoldBach obj = new GoldBach();
        obj.input();
        obj.num();
    }

}

