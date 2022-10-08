/*
   Write a method to add two numbers.
*/

class Methoddemo
{

       static int  add(int a,int b)  // Method to add two numbers 
      {
         int c;
         c=a+b;
        return c;
      }

       public static void main(String args[ ])
      {
            System.out.println("Addition is : "+add(5,10));
       }

}

/* ============ OUTPUT ============

C:\Java\bin>javac Methoddemo.java

C:\Java\bin>java Methoddemo
Addition is : 15

================================ */  

