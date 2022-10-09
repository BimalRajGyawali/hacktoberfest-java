class Leap
{
public static void main(String args[])
{
  int num=2004;

if(num%400==0)
{
System.out.println(num + " is Leap year");
}
else if(num%4==0 && num%100!=0)
{
System.out.println(num + " is Leap year");
}
else
{
System.out.println(num + " is Not Leap year");
}
}
}