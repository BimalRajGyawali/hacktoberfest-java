import java.util.Scanner;
public class pyramid {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the numbers of rows: ");
        int rows = scan.nextInt();
        int no = rows;
        for(int r=1; r<=rows; r++){
            for(int sp=1; sp<=no; sp++){
                System.out.print(" ");
            }
            no--;
            for(int d=1; d<=r; d++){
                System.out.print(" "+r);
            }
            System.out.print("\n");
        }
    }
    
}
