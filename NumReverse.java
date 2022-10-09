import java.util.Scanner;

class Reverse
{
public static void main(String args[])
{
Scanner rev=new Scanner(System.in);
System.out.print("Enter any digit number: ");
int n=rev.nextInt();
int r=0;
while(n!=0)
{
int a=n%10;
r=r*10+a;
n=n/10;
}
System.out.println(r);
}
}