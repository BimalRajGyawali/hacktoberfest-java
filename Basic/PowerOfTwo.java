import java.util.*;
class PowerOfTwo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int f=0,c=0;
        int a[]=new int[32];
        for(int i=n;i!=0;i/=2)
{
   a[c++]=i%2;
}
for(int i=c-1;i>=0;i--)
{
    System.out.print(a[i]);
    if(a[i]==1){f++;}
}System.out.println();
if(a[c-1]==1&&f==1)
{System.out.println("Yes the number is a power of two");}
else{
    System.out.println("No the number is not a power of two");
}
    }
}