package org.example.basics;

/* 
    Write a program to check whether it is special two digit number or not
    
*/
import java.util.*;
class SpecialTwoDigitNumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int e=n;
        int s=0,p=1;
        while(n!=0)
        {
            int d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        if((s+p)==e)
        {
            System.out.println("The number is special digit");
        }
        else
        {
            System.out.println("The number is not special digit");
        }
    }
}

/* =============== OUTPUT ==============
C:\Java\bin>javac SpecialTwoDigitNumber.java
C:\Java\bin>java Enter the number 59
The number is special digit
===================================== */
