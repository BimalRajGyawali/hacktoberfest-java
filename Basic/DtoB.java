import java.util.*;
class DtoB
{
    public static void binary(int n)
    {
        int f=0,c=0;
        
        int a[]=new int[32];
        for(int i=n;i!=0;i/=2)
        {
           a[c++]=i%2;
        }
        for(int i=c-1;i>=0;i--)
        {
            System.out.print(a[i]);}
        }
    public static void decimal(int n)
    {
        int c=0;int sum=0;
        for(int i=n;i!=0;i/=10)
        {
            int rem=i%10;
            sum+=rem*Math.pow(2,c++);
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("1:Decimal to Binary");
       System.out.println("2:Binary to Decimal");
       System.out.println("Enter your choice");
       int ch=sc.nextInt();
       switch(ch)
       {
           case 1: System.out.println("Enter the decimal number you want to convert");
           int n=sc.nextInt();
           binary(n);
           break;
           case 2: System.out.println("Enter the binary number you want to convert");
           int m=sc.nextInt();
           decimal(m);
           break;
           default: System.out.println("OOPS! Wrong Input");
       }
    }
    }
