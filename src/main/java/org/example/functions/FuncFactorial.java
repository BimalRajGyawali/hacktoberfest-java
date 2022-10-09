import java.util.*;
class FuncFactorial
{
    public static void facto(int n)
    { int mult=1;
      if(n>0)
      for(int i=1;i<=n;i++)
      {
          mult*=i;
      }
      else
      {
        System.out.println("Invalid input");
        return;
      }
      System.out.println("Factorial of number is "+mult);
      return;
    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     facto(n);
    }
}
