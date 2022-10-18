package org.example.patterns;

public class Descendingorder {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //Taking rows value from the user    
        System.out.println("Enter the number of rows: ");    
        int rows = sc.nextInt();         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
               
            System.out.println();
        }         
        sc.close();
    }
}
//output
//Enter the number of rows: 5

//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1
