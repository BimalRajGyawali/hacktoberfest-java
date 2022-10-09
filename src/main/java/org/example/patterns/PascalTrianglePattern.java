import java.util.Scanner;

public class PascalTrianglePattern {
    public static void main(String[] args) {
        int a;
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    for (int i = 1; i <=a; i++)
    {
        for (int j = 1; j <=a-i; j++)
        {
        
            System.out.print("   ");
        }
        for (int j = 1; j <=i; j++)
        {
            System.out.print(j+"  ");
        }
        for (int j = i-1; j >=1; j--)
        {
            System.out.print(j+"  ");
        }
        System.out.println();
    }

    }
}
//input
// 5
//output
//               1  
//            1  2  1
//         1  2  3  2  1
//      1  2  3  4  3  2  1
//   1  2  3  4  5  4  3  2  1
