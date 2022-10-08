/*
   Write a program to swap two numbers.
*/


class SwapNumbers
{
     public static void main(String args[ ])
     {
         int a,b,temp;
 
         a=Integer.parseInt(args[0]);
         b=Integer.parseInt(args[1]);
       
        System.out.println("Numbers before swapping are a="+a+" b="+b);      
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after swapping are a="+a+" b="+b); 

     }
}

/* ============= OUTPUT =============

C:\Java\bin>javac SwapNumbers.java

C:\Java\bin>java SwapNumbers 10 12
Numbers before swapping are a=10 b=12
Numbers after swapping are a=12 b=10

================================== */
