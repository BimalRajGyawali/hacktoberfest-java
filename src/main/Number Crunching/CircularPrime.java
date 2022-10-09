import java.util.*;
public class CircularPrime 
{
    int n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        n=sc.nextInt();
        System.out.println("Entered no is: "+n);
    }  
     boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
                if(n%i==0)
                    c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    void check()
    {
        int p=n,d=0;
         while(p>0)
         {
             p=p/10;
             d++;
         }
          int num=n;
          String r="";
            while(num>0)
            {
              r=num%10+r;
              num=num/10;
            }
             int sn =Integer.parseInt(r);
             System.out.println(sn);
           for(int i=0;i<=d;i++)
           {
               String s= r.substring(i,d);
           }
             if(isPrime(p)&&isPrime(sn))
             System.out.println(n+" is a circular prime"); 
    }
     public static void main(String[] args) 
    {
        CircularPrime obj=new CircularPrime();
        obj.input();
        obj.check();
    }
    
}
