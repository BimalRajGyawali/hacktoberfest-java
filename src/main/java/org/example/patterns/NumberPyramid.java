package org.example.patterns;

import java.util.*;
public class NumberPyramid {
    public static void main(String[] args){

        // HALF PYRAMID WITH NUMBERS
        System.out.print("Enter the numbers of rows:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter the numbers of rows:5
// 1
// 12
// 123
// 1234
// 12345
