import java.util.*;
class TwoDArraySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int r=sc.nextInt();
        System.out.println("Enter the columns");
        int c=sc.nextInt();
        int numbers[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search");
        int x=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.println(x+" found at position "+(i+1)+","+(j+1));
                }
            }
        }

    }
}