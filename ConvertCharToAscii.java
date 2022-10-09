import java.util.Scanner;

class Ascii
{
public static void main(String args[])
{
 
Scanner asc=new Scanner(System.in);
System.out.print("Enter any character: ");
char c=asc.next().charAt(0);

int n=c;

System.out.println(n);
}
}