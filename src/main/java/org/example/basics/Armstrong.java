import java.util.*;
class Armstrong
{public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int rem;
    System.out.println("The armstrong numbers are");
    for(int j=1;j<=500;j++)
    {int x=0;
        for(int l=j;l!=0;l/=10)
        {
            rem=l%10;
            x=x+(rem*rem*rem);
        }
        if(x==j)
        {System.out.println(j);}
    }
    
}}