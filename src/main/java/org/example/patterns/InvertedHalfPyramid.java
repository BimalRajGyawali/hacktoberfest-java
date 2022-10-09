package org.example.patterns;

import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String[] args){

        // INVERTED HALF PYRAMID
        System.out.print("Enter the numbers of rows:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter the numbers of rows:5
// *****
// ****
// ***
// **
// *
