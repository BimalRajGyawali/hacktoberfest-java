package org.example.numbercrunching;
import java.util.*;
public class CompositeMagic
{
    int n,m,i;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m");
        m=sc.nextInt();
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        if(m<n)
            System.out.println("valid input");
        else
            System.out.println("invalid input");
    }   
    boolean isComposite(int a)
    {
        int c=0;
            for (int j=1;j<=i;j++)
            {
                if(a%j==0)
                    c++;
            }
        if(c>2)
            return true;
        else
            return false;
    }
    void isMagic()
    {
        System.out.println("the composite magic integers are: ");
        int feq=0;
        int num = 0,sum=0;
        for(i=m;i<=n;i++)
        {
          num=i;
          if(isComposite(num))
          {
            while(num>9)
            {
                while(num>0)
                {
                    sum=sum+num%10;
                    num=num/10;
                }
                num=sum;
                sum=0;
            }
              if(num==1)
              {
                System.out.print(i+", ");
                feq++;
              }
          }
        }
         System.out.println();
         System.out.println("frequency of composite magic integer: "+feq);
    }
    public static void main(String[] args) 
    {
        CompositeMagic  obj=new CompositeMagic();
        obj.input();
        obj.isMagic();
    }
}


