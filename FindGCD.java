package org.example.basics;

/*
     Write a program to find the greatest common divisor.
*/



import java.util.*;
class GCD
{
 public static void main(String args[])
  {
    Scanner gcd = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int x=gcd.nextInt();
    System.out.print("Enter second number: ");
    int y=gcd.nextInt();
   
int G=1;
 
for(int i=1;i<=x && i<=y; i++)
{
 if(x%i==0 && y%i==0)
  {
   G=i;
  }
}
System.out.println("GCD of "+x+" and "+y+" is "+G);
}
}