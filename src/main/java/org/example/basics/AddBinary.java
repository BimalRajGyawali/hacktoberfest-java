import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AddBinary
{
    public static void binary(int n)
    {
        int c=0;
        
        int a[]=new int[32];
        for(int i=n;i!=0;i/=2)
        {
           a[c++]=i%2;
        }
        for(int i=c-1;i>=0;i--)
        {
            System.out.print(a[i]);}
        }
        public static int decimal(int n)
    {
        int c=0;int sum=0;
        for(int i=n;i!=0;i/=10)
        {
            int rem=i%10;
            sum+=rem*Math.pow(2,c++);
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    String s1=sc.next();
		    String s2=sc.next();
		    int s11=Integer.parseInt(s1);
		    int s22=Integer.parseInt(s2);
		    int n1=decimal(s11);
		    int n2=decimal(s22);
		    int answer=n1+n2;
		    binary(answer);
		}
	}
}
