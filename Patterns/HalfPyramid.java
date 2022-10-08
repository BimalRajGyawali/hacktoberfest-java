import java.util.*;
public class HalfPyramid {
    public static void main(String[] args){

        // HALF PYRAMID
        System.out.print("Enter the numbers of rows:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter the numbers of rows:5
// *
// **
// ***
// ****
// *****