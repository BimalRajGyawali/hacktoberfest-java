/*
   Two numbers are entered through the keyboard. Write a program to find the value of one number
    raised to the power of another.  (Do not use Java built-in method)
*/

import java.util.*;
class Raisedto
{
      
      public static void main(String args[ ])
      {
          int a,b,res=1;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter base value");
          a=sc.nextInt();
          System.out.println("Enter index value");
          b=sc.nextInt();
          for(int i=0;i<b;i++)
          {
             res=res*a;
           }
          
             System.out.println("Value of "+a+" raised to "+b+" is "+res);
       }
}


/* ============= OUTPUT ===============

C:\Java\bin>javac Raisedto.java

C:\Java\bin>java Raisedto
Enter base value
2
Enter index value
5
Value of 2 raised to 5 is 32

==================================== */
