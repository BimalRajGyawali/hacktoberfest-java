/*
    Write a program to print greatest number among three numbers.
*/


class MaxAmongThree
{
   public static void main(String args[ ])
   {
       int a,b,c;
       a=Integer.parseInt(args[0]);
       b=Integer.parseInt(args[1]);
       c=Integer.parseInt(args[2]);
 
      if(a>b && a>c)
      {
         System.out.println(a+" is greater than "+b+" and "+c);
       }
     else if(b>a && b>c)
      {
         System.out.println(b+" is greater than "+a+" and "+c);
      }
     else if(c>a && c>b)
     {
        System.out.println(c+" is greater than "+a+" and "+b);
     }
     else
     {
        System.out.println("Don't enter identical numbers");
     }
  }
}


/* =========== OUTPUT ==============

C:\Java\bin>javac MaxAmongThree.java

C:\Java\bin>java MaxAmongThree 10 59 62
62 is greater than 10 and 59

================================= */