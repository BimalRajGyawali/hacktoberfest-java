/* 
   Write a program to demonstrate different variables in java 
*/

class Variables
{
     int p; // Instance variable
     
     static int q; // Static variable
}

class VariablesDemo
{
     public static void main(String[] args)
     {
        
          int a=30; // Local variable
          Variables var = new Variables();
          
          var.p=10;
          
          Variables.q=20;

          System.out.println(var.p);
          System.out.println(Variables.q);
          System.out.println(a);
     }
}

/* ============== OUTPUT ===============

C:\Java\bin>javac VariablesDemo.java

C:\Java\bin>java VariablesDemo
10
20
30

===================================== */
 