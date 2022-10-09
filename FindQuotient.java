import java.util.Scanner;

class Quotient
{
public static void main(String args[])
{
int a;
int b;
float q;
int r;
Scanner quo = new Scanner(System.in);
System.out.println("Enter Dividend: ");
a=quo.nextInt();
System.out.println("Enter Divisor: ");
b=quo.nextInt();

q=a/b;
r=a%b;

System.out.println("Quotient: "+ q);
System.out.println("Remainder: "+ r);
}
}
