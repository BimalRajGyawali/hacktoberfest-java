/*
    Write a program to illustrate array in java.
*/


import java.util.*;
class ArrayDemo
{
    public static void main(String[ ] args)
    {

     int a[]=new int[10];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 10 numbers");
     for(int i=0;i<10;i++)
     {
        a[i]=sc.nextInt();
     }

     System.out.println("\nEntered numbers are");
     
     for(int i=0;i<10;i++)
     {
         System.out.print(a[i]+" ");
     }
     
     System.out.println("\nEntered numbers in reverse order are");
     for(int i=9;i>=0;i--)
     {
         System.out.print(a[i]+" ");
     }

   }
}

/* ================= OUTPUT =================

C:\Java\bin>javac ArrayDemo.java

C:\Java\bin>java ArrayDemo
Enter 10 numbers
1
2
3
4
5
6
7
8
9
10

Entered numbers are
1 2 3 4 5 6 7 8 9 10
Entered numbers in reverse order are
10 9 8 7 6 5 4 3 2 1

========================================== */ 

