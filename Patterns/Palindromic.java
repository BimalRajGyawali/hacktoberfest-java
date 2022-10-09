import java.util.*;
public class Palindromic {
    public static void main(String[] args){

        // PALINDROMIC PATTERN
        System.out.print("Enter the numbers of rows:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// OUTPUT:
// Enter the numbers of rows:5
//     1
//    212
//   32123
//  4321234
// 543212345
