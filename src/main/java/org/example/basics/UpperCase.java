/*
   Write a program to check whether entered charecter is a upper case letter or not
*/
package org.example.basics;

import java.util.*;
public class UpperCase
{

    public static void main(String args[ ])
    {

        Scanner sc = new Scanner(System.in);
        char chr=sc.next().charAt(0);

           if(chr>='A' && chr<='Z')
             System.out.println("Upper Case Letter");
     }

} 


/* ============= OUTPUT ===============

C:\Java\bin>javac UpperCase.java

C:\Java\bin>java UpperCase
A
Upper Case Letter

==================================== */   
