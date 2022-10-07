/*
   Write a program to store and display your name using charecter array.
*/

import java.util.*;

class PrintName
{
     public static void main(String[] args)
      {
        
           char[] name= new char[20];
           int length;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter length of the name");
           length=sc.nextInt();
           System.out.println("Enter name charecter by charecter");
           for(int i=0;i<length;i++)
           {
             name[i]=sc.next().charAt(0);
           }
           
           System.out.print("Your entered name is : ");
           for(int i=0;i<length;i++)
           {
             System.out.print(name[i]);
           }
      }
}

/* ================ OUTPUT =================

C:\Java\bin>javac PrintName.java

C:\Java\bin>java PrintName
Enter length of the name
5
Enter name charecter by charecter
j
a
m
e
s
Your entered name is : james

========================================= */ 

      
           