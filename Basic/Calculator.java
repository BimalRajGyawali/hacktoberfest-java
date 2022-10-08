import java.util.*;
class Calculator
{public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    System.out.println("1:Addition");
    System.out.println("2:Subtraction");
    System.out.println("3:Multiplication");
    System.out.println("4:Division");
    System.out.println("5:Remainder");
    System.out.println("Enter your choice");
    int ch=sc.nextInt();
    switch(ch)
    { case 1: System.out.println(a+b);
        break;
        case 2: System.out.println(a-b);
        break;
        case 3: System.out.println(a*b);
        break;
        case 4: double di=a/b;
        System.out.println(di);
        break;
        case 5: if(a>b)
        {
            int rem=a%b;
            System.out.println(rem);
        }
        else
         {
             int rem1=b%a;
             System.out.println(rem1);
         }
         break;
         default: System.out.println("OOPS! Wrong Input");
    }

}}