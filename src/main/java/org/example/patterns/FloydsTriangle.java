package org.example.patterns;

import java.util.*;
public class FloydsTriangle {
    public static void main(String[] args){

        // FLOYD's TRIANGLE
        System.out.print("Enter the numbers of rows:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter the numbers of rows:5
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
