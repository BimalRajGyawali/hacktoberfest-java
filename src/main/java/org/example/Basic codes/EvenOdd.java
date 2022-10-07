/* 
     Write a program to determine whether a entered number is even or odd.
*/


class EvenOdd
{
    public static void main(String args[ ])
    {
        int n=Integer.parseInt(args[0]);
 
        if(n%2==0)
          System.out.println("Entered number is even");
        else
          System.out.println("Entered number is odd");
     }
}


/* ============= OUTPUT ===============

C:\Java\bin>javac EvenOdd.java

C:\Java\bin>java EvenOdd 10
Entered number is even

C:\Java\bin>java EvenOdd 15
Entered number is odd

==================================== */
