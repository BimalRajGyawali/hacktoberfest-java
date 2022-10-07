/*
    Write a program to print table of entered number 
*/


class Tables
{
   public static void main(String args[ ])
   {
        int i,n=Integer.parseInt(args[0]);
      
       System.out.println("The table of "+n+" is as follows: ");
       for(i=1;i<=10;i++)
         System.out.println(n+" * "+i+" = "+(n*i));
    }
}


/* ============== OUTPUT ==============

C:\Java\bin>javac Tables.java

C:\Java\bin>java Tables 5
The table of 5 is as follows:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

==================================== */
