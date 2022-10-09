import java.util.*;
class LCM
{
public static void main(String args[])
{
 Scanner lcm=new Scanner(System.in);
 System.out.print("Enter first number: ");
 int x=lcm.nextInt();
 System.out.print("Enter second number: ");
 int y=lcm.nextInt();
int LCM=1;

for(int i=1; i<=x && i<=y; i++)
{
 if(x%i==0 && y%i==0)
  {
   LCM=i;
  }
}
int L=(x*y)/LCM;
System.out.print("LCM of "+x+" and "+y+" is "+L);
}
}