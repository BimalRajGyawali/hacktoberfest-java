/*
     Write a program to enter the numbers till the user wants and at the end the program 
      should display the largest and smallest numbers entered.

*/


import java.util.*;
class Minmax
{
    public static void main(String args[ ])
    {
        int n=1,min=32767,max=-32768;
        Scanner sc = new Scanner(System.in);
       while(n!=-999)
       {
            System.out.println("Enter a number or enter -999 to stop");
            n=sc.nextInt();
            if(min>n && n!=-999)
               min=n;
            if(max<n)
               max=n;
        }
           System.out.println("Maximum among entered numbers is "+max+" and minimum is "+min);
    }
}

/* =============== OUTPUT ==============

C:\Java\bin>javac Minmax.java

C:\Java\bin>java Minmax
Enter a number or enter -999 to stop
45
Enter a number or enter -999 to stop
75
Enter a number or enter -999 to stop
89
Enter a number or enter -999 to stop
63
Enter a number or enter -999 to stop
52
Enter a number or enter -999 to stop
10
Enter a number or enter -999 to stop
18
Enter a number or enter -999 to stop
42
Enter a number or enter -999 to stop
35
Enter a number or enter -999 to stop
-999
Maximum among entered numbers is 89 and minimum is 10

======================================= */
