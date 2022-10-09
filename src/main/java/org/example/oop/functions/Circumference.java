import java.util.*;
class Circumference
{
    public static double circum(double r)
    {
        return 2*3.14*r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
System.out.println(circum(r));
    }
}