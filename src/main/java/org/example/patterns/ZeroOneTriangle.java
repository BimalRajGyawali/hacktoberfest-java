package org.example.patterns;

import java.util.*;
public class ZeroOneTriangle {    
    public static void main(String[] args){

        // 0-1 TRIANGLE
        System.out.print("Enter the numbers of rows:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
           }
        System.out.println();
        }

    }
}

// OUTPUT:
// Enter the numbers of rows:5
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
