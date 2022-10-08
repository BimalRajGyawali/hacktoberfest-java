/*
    Write a program to take 10 numbers as input from user and display addition of even numbers among them using array.
*/

import java.util.*;

class SumOfEveninArray
{

     public static void main(String[] args)
     {
          int[] a= new int[10];
          Scanner sc = new Scanner(System.in);
          int sum=0;
          
          System.out.println("Enter 10 numbers");
          for(int i=0;i<10;i++)
          {
              a[i]=sc.nextInt();
           }
        
           for(int i=0;i<10;i++)
          {
             if(a[i]%2==0)
             { 
                  sum+=a[i];
             }
          }
 
          System.out.println("Addition of even elements in array is : "+sum);
     }
}

/* ============= OUTPUT ================

C:\Java\bin>javac SumOfArray.java

C:\Java\bin>java SumOfArray
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
Addition of even elements in array is : 30

===================================== */

