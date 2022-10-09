import java.util.*;
class LinearSearch
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int numbers[]=new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter element "+(i+1));
           numbers[i]=sc.nextInt();
        }
        System.out.println("Enter number you want to search");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++)
        {
            if(x==numbers[i])
            {
                System.out.println("Number found at index "+i);
            }
        }
    }
}