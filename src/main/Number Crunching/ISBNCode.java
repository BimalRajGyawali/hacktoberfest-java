import java.util.*;
public class ISBNCode
{
    long n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 10-digit code");
        n=sc.nextLong();
    }  
    boolean is10_Digit(long a)
    {
        long p=a;
        int d=1;
        while(p>0)
            {
                p=p/10;
                d++;
            }
        if(d==10)
            return true;
        else
            return false;
    }
    void cal()
    {
      if(is10_Digit(n))
      {
        int m=1,s=0;
        long temp=n;
        while(n>0)
        {
            s=(int) (s+(n%10)*m);
            n=n/10;
            m++;
        }
        System.out.println("SUM= "+s);
        if(s%11==0)
                System.out.println("LEAVES NO REMAINDER - VALID ISBN CODE");
        else
                System.out.println("LEAVES REMAINDER - INVALID ISBN CODE");
      }
      else
          System.out.println("INVALID ISBN CODE");
    }
    public static void main(String[] args) 
    {
         ISBNCode  obj=new  ISBNCode ();
         obj.input();
         obj.cal();
    }
}
