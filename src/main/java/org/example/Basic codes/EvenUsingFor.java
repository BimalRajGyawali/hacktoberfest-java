/*
    Write a program to print even numbers from 1 to 20 using loop.
*/

class EvenUsingFor
{
    public static void main(String args[ ])
      {
            int i;
         
            for(i=2;i<=20;i+=2)    // Loop to generate even numbers between 1 to 20
            {
               System.out.println(i);
            }
       }
}


/* ============= OUTPUT ================

C:\Java\bin>javac EvenUsingFor.java

C:\Java\bin>java EvenUsingFor
2
4
6
8
10
12
14
16
18
20

===================================== */
