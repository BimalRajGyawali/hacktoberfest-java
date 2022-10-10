import java.util.*;
class Prime
{
    public static void prime(int n)
    {
        int c=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {c++;}
    }
    if(c==2)
    {System.out.println("Number is prime");
return;}
    else{
        System.out.println("Number is not prime");
        return;
    }
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
prime(n);
    }
}