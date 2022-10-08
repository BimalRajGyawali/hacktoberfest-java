import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int x=0;
        for(int i=n;i!=0;i/=10)
        {int rem=i%10;
            x=(x*10)+rem;
        }
        if(x==n)
        {System.out.println("Number is palindrome");}
        else{System.out.println("Not palindrome");}
}
}