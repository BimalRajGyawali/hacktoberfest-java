package org.example.basics;

/*
     Write a program to print prime number from n to n.
*/




import java.util.*;
class Prime 
{
public static void main(String argsd[])
{
Scanner pri=new Scanner(System.in);
System.out.println("Enter first number: ");
int n1=pri.nextInt();
System.out.println("Enter sec number: ");
int n2=pri.nextInt();

int f=0;
for(int i=n1;i<n2;i++)
{
f=0;
{
for(int j=1;j<n2;j++)
{
if(i%j==0)
f++;
}
if(f==2)
System.out.print(i +"  ");
}
}
}
}