/*
     Write a program to check whether entered number is armstrong or not.
*/


import java.lang.Math;

class ArmstrongNumber
{
    public static void main(String args[ ])
    {
       int n=Integer.parseInt(args[0]);
       int temp=n,sum=0,d,p=args[0].length();

       while(n>0)
       {
          d=n%10;
          sum+=Math.pow(d,p);
          n=n/10;
        }

      if(sum==temp)
      {
         System.out.println("Entered number is armstrong");
      }
      else
      {
         System.out.println("Entered number is not armstrong");
      }
   }
}


/* =============== OUTPUT ==============

C:\Java\bin>javac ArmstrongNumber.java

C:\Java\bin>java ArmstrongNumber 153
Entered number is armstrong

C:\Java\bin>java ArmstrongNumber 155
Entered number is not armstrong

===================================== */
        
          