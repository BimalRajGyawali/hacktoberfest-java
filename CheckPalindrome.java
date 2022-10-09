import java.util.*;

class Palindrome
{
  public static void main(String args[])
  {
  Scanner pal=new Scanner(System.in);
  System.out.print("Enter any number: ");
  int n=pal.nextInt();
int temp=n;
int sum=0;
while(n!=0)
{
 int a=n%10;
sum=(sum*10)+a;
n=n/10;
}

if(temp==sum)
 System.out.println(temp+" is a palindrome number");
else
 System.out.println(temp+" is not a palindrome number");

}
}