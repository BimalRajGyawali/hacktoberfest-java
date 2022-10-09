package org.example.algorithms.searching;
import java.util.Scanner;  
   
class LinearSearch{  
  public static void main(String args[])  
  {  
    int i, n, search, array[];  
   
    Scanner s = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = s.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter elements");  
   
    for ( i= 0; i < n; i++){  
      array[i] = s.nextInt(); 
    }
    System.out.println("Enter value to find");  
    search = s.nextInt();  
   
    for ( i = 0; i < n; i++)  
    {  
      if (array[i] == search)     /* Searching element is present */  
      {  
         System.out.println(search + " is present at location " + (i + 1) + ".");  
          break;  
      }  
   }  
   if (i == n)  /* Element to search isn't present */  
      System.out.println(search + " isn't present in array.");  
  }  
}  
