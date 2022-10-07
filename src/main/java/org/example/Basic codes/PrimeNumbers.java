/*
   Write a program to check whether entered number is prime or not.
*/


import java.util.*;
class PrimeNumbers
{
   public static void main(String args[])
   {
      int i,n;
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
    
      for(i=2;i<n;i++)
      {
          if(n%i==0)
          {
             break;
            
          }
       }
 
     if(i==n)
        System.out.println("Number is prime");
      else
       System.out.println("Number is not prime"); 
 
     }
}


/* ================ OUTPUT =============

C:\Java\bin>javac PrimeNumbers.java

C:\Java\bin>java PrimeNumbers
13
Number is prime

C:\Java\bin>java PrimeNumbers
15
Number is not prime

====================================== */
