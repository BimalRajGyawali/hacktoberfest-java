import java.util.*;
public class HollowRectangle {
    public static void main(String args[]){

        // HOLLOW RECTANGLE
        System.out.print("Enter no. of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                    else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter no. of rows and columns:4
// 5
// *****
// *   *
// *   *
// *****
