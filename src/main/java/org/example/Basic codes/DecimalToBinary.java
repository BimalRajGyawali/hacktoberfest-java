/* 
   Write a program to convert given decimal number to equivalent binary number.
*/

class DecimalToBinary
{
 
    public static void main(String args[ ])
     {
           int num;
           num=Integer.parseInt(args[0]);
           String binnum=Integer.toBinaryString(num);
     
           System.out.println("Binary equivalent of "+num+" is "+binnum);
     }
}

/* ============ OUTPUT =============

C:\Java\bin>javac DecimalToBinary.java

C:\Java\bin>java DecimalToBinary 45
Binary equivalent of 45 is 101101

================================= */
