/*
     Write a program to add numbers from 1 to n without using loop. 
*/

class AddNaturalNumbersWithoutLoop
{
 
   public static void main(String args[ ])
    {
        int n=Integer.parseInt(args[0]);
 
        System.out.println("Sum of natural numbers from 1 to "+n+" is "+(n*(n+1)/2));
   }

}


/* =============== OUTPUT =============

C:\Java\bin>javac AddNaturalNumbersWithoutLoop.java

C:\Java\bin>java AddNaturalNumbersWithoutLoop 10
Sum of natural numbers from 1 to 10 is 55

==================================== */


