/*
   Write a program to demonstrate matrix addition.
*/

import java.util.*;

class MatrixAddition
{
   public static void main(String[ ] args)
   {
      
       int row,col,i,j;
       Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter number of rows");
        row=sc.nextInt();
        System.out.println("Enter number of columns");
        col=sc.nextInt();
        int[][] a=new int[row][col];
        int[][] b=new int[row][col];
        int[][] c=new int[row][col];
 
        System.out.println("Enter "+(row*col)+" elements in 1st array");
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
              a[i][j]=sc.nextInt();
            }
       }

       System.out.println("Enter "+(row*col)+" elements in 2nd array");
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
              b[i][j]=sc.nextInt();
            }
       }
        
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
              c[i][j]=a[i][j]+b[i][j];   
            }
       }
      
      System.out.println("Resultant array after addition of two array's is :");
        for(i=0;i<row;i++)
        {
           for(j=0;j<col;j++)
           {
              System.out.print(c[i][j]+" ");
            }
           System.out.println("");
       }
    }
}

/* =============== OUTPUT ===============

C:\Java\bin>javac MatrixAddition.java

C:\Java\bin>java MatrixAddition
Enter number of rows
2
Enter number of columns
2
Enter 4 elements in 1st array
1
2
3
4
Enter 4 elements in 2nd array
1
2
3
4
Resultant array after addition of two array's is :
2 4
6 8


====================================== */

