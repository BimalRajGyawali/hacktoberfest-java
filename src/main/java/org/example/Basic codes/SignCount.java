/*
   Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
   negative and zeros entered.

*/


import java.util.*;
class SignCount
{
   public static void main(String args[ ])
   {
        int pcount=0,ncount=0,zcount=0;
        int  n=1;
        Scanner sc = new Scanner(System.in);
 
        while(n!=-999)
        {
           
           System.out.println("Enter a number or enter -999 to stop");
           n=sc.nextInt();
           if(n>0)
                pcount++;
           else if(n<0 && n!=-999)
                ncount++;
           else if(n==0)
                zcount++;
         }
        System.out.println("You entered\n"+pcount+" positive numbers\n"+ncount+" negative numbers\n"+zcount+" zeroes");
     }
}

/* ================= OUTPUT ================

C:\Java\bin>javac SignCount.java

C:\Java\bin>java SignCount
Enter a number or enter -999 to stop
5
Enter a number or enter -999 to stop
6
Enter a number or enter -999 to stop
12
Enter a number or enter -999 to stop
10
Enter a number or enter -999 to stop
0
Enter a number or enter -999 to stop
0
Enter a number or enter -999 to stop
-1
Enter a number or enter -999 to stop
-999
You entered
4 positive numbers
1 negative numbers
2 zeroes

========================================= */
          