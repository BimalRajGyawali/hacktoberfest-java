class Greatest
{
public static void main(String args[])
{
  int a=90;
  int b=90;
  int c=90;

   
   if(a==b && b==c)
      System.out.println("All are same");
   else if(a>b || a>c)
      System.out.println(a+ " is Greatest");
   else if(b>c)
      System.out.println(b+ " is Greatest");
   else 
      System.out.println(c+ " is Greatest");
      
}
}
      