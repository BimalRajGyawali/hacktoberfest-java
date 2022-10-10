package org.example.numbercrunching;
import java.util.*;
public class PrimePalindrome 
{
    int n,m;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m");
        m=sc.nextInt();
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        if(m<3000&&n<3000)
            System.out.println("valid input");
        else
            System.out.println("invalid input");
    }         
    boolean isPrime(int no)
    {
        int c=0;
       for (int j=1;j<=no;j++)
            {
                if(no%j==0)
                    c++;
            }
        
        if(c==2)
            return true;
        else
            return false;
    }
    void palindrome()
    {
         System.out.println("the prime palindrome integers are:");
        int f=0;
        for(int i=m;i<=n;i++)
        {
            int num=i;
            int temp=num;
            if(isPrime(num))
             {
               String r="";
               while(num>0)
               {
                 r=r+num%10;
                 num=num/10;
               }
               int sn =Integer.parseInt(r);
               if(temp==sn)
               {
                   System.out.print(i+", ");
                   f++;
               }
             }
        }
         System.out.println();
           System.out.println("freq of the prime palindrome integers is:"+f);
    }
      public static void main(String[] args) 
    {
        PrimePalindromee   obj=new PrimePalindrome ();
        obj.input();
        obj.palindrome();
    }
    
}


