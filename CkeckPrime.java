package org.example.basics;

/*
     Write a program to check whether entered number is Prime or not.
*/



import java.util.*;

class Prime
{
public static void main(String args[])
{
Scanner pri=new Scanner(System.in);
System.out.print("Enter any number: ");
int n=pri.nextInt();

int flag=0;

for(int i=2;i<n/2;i++)
{
 if(n%i==0)
   {
     flag=1;
     break;
   }
}
if(flag==0)
 System.out.println(n+" is a Prime number");
else
 System.out.println(n+" is Not a Prime Number");

}
}