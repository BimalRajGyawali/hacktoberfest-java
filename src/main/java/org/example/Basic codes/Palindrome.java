/*
    Write a program to check whether entered number is palindrome or not.
*/


class Palindrome
{

   public static void main(String args[ ])
    {
       int n=Integer.parseInt(args[0]);
       int rem,rev=0,temp=n;
      
       while(n>0)
       {
          rem=n%10;
          rev=rev*10+rem;
          n=n/10;
       }
       if(temp==rev)
          System.out.println("Palindrome");
       else
          System.out.println("Not a Palindrome");
     }
}

/* ============== OUTPUT ==============

C:\Java\bin>javac Palindrome.java

C:\Java\bin>java Palindrome 1221
Palindrome

C:\Java\bin>java Palindrome 123
Not a Palindrome

==================================== */
