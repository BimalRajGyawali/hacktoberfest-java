import java.util.*;
class Reversesb
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String s=sc.nextLine();
     StringBuilder sb=new StringBuilder(s);
     String c="";
     int l=sb.length();
     for(int i=0;i<l;i++)
    {
       char d=sb.charAt(i);
       c=d+c;
    }
    System.out.println(c);
    }
}