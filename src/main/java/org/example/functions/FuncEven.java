import java.util.*;
class FuncEven
{
    public static void even(int n)
    {
         if(n%2==0)
        {System.out.println("Number is even");
    return;}
    else{
        System.out.println("Number is odd");
        return;
    }
    
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
even(n);
    }
}
    
