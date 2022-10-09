package org.example.patterns;

import java.util.*;
public class SolidRectangle {
    public static void main(String[] args){
       // SOLID RECTANGLE
       System.out.print("Enter no. of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter no. of rows and columns:4
// 5
// *****
// *****
// *****
// *****