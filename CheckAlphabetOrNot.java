import java.util.Scanner;

class Alphabet
{
public static void main(String args[])
{
Scanner alp=new Scanner(System.in);
System.out.print("Enter any character: ");
char c=alp.next().charAt(0);
 
if((c>='A' && c<='Z') || (c>='a' && c<='z'))
{
 System.out.println(c+" is alphabet");
}
else
System.out.println(c+" is not alphabet");

}
}