import java.util.*;
public class Diamond {
    public static void main(String[] args){

        // DIAMOND PATTERN
        System.out.print("Enter the numbers of rows:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter the numbers of rows:5
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *