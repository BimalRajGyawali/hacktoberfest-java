/*
    Write a program to determine whether entered year is a leap year or ordinary year.
*/

class Leapyear
{
 
     public static void main(String args[ ])
     {
        int year;
        year=Integer.parseInt(args[0]);
       
        if((year%4==0) && (year%100!=0) || (year%400==0))
           System.out.println("Leap Year");
        else
           System.out.println("Ordinary Year");
      }
}


/* ============ OUTPUT ============

C:\Java\bin>javac Leapyear.java

C:\Java\bin>java Leapyear 2000
Leap Year

C:\Java\bin>java Leapyear 2005
Ordinary Year

================================ */       