/*
   Write a program to calculate the sum of following series where n is input by user. 
    1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
*/


class Series
{
     public static void main(String args[ ])
     {
        int n=Integer.parseInt(args[0]);
        float sum=0;
 
       for(int i=1;i<=n;i++)
       {
           sum=sum+float(1f/i);
        }
       
       System.out.println(sum);
    }
}


/* =============== OUTPUT ============

C:\Java\bin>javac Series.java

C:\Java\bin>java Series 3
1.8333334

=================================== */
