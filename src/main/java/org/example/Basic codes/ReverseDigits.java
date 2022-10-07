/*
    Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
     For example, if the input is 12345, the output should be 54321.

*/


class ReverseDigits
{
    public static void main(String args[ ])
     {
         int n=Integer.parseInt(args[0]);
 
         while(n>0)
         {
            System.out.print(n%10);
             n=n/10;
         }
      }
}


/* =================== OUTPUT =================

C:\Java\bin>javac ReverseDigits.java

C:\Java\bin>java ReverseDigits 12345
54321

============================================ */
         