/*
    Write a program to print nth term of fibonacci sequence
*/


class FibonacciSeries
{

   public static void main(String args[ ])
     {
        int f1=-1,f2=1,f3=0;
        int n=Integer.parseInt(args[0]);
 
        for(int i=0;i<n;i++)
        {
           f3=f1+f2;
           f1=f2;
           f2=f3;
        }
   System.out.println("The "+n+" th fibonacci term is "+f3);
     }      
}


/* ============ OUTPUT ===============

C:\Java\bin>javac FibonacciSeries.java

C:\Java\bin>java FibonacciSeries 10
The 10 th fibonacci term is 34

=================================== */
