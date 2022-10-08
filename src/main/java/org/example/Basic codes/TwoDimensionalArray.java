/*
    Write a program to demonstrate 2-D array in java.
*/

import java.util.*;


class TwoDimensionalArray
{
 
     public static void main(String args[ ])
     {
 
         int row,col;
         Scanner sc = new Scanner(System.in);
      
         System.out.println("Enter number of rows");
         row=sc.nextInt();
         System.out.println("Enter number of columns");
         col=sc.nextInt();
 
         int[][] a = new int[row][col];
         System.out.println("Enter "+(row*col)+" elements in array row wise");
         
         for(int i=0;i<row;i++)    // Loop to take values from user to be stored into array
         {
            for(int j=0;j<col;j++)
             {
                 a[i][j]=sc.nextInt();
              }
         }
          
          System.out.println("Entered 2-D array is");
          for(int i=0;i<row;i++)    //Loop to display values in array
         {
            for(int j=0;j<col;j++)
             {
                 System.out.print(a[i][j]+" ");
              }
              System.out.println("");
         }
    }
}

/* =============== OUTPUT ================

C:\Java\bin>javac TwoDimensionalArray.java

C:\Java\bin>java TwoDimensionalArray
Enter number of rows
3
Enter number of columns
3
Enter 9 elements in array row wise
10
20
30
40
50
60
70
80
90
Entered 2-D array is
10 20 30
40 50 60
70 80 90
======================================= */
     
 
    