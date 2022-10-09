import java.util.*;
class FuncTable
{
    public static void table(int n)
    {
        int mult=1;
 for(int i=1;i<=10;i++)
 {
     mult=n*i;
     System.out.println(n+"*"+i+"="+mult);
     
 }return;
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
table(n);
    }
}