package org.example.basics;
// A program to display the factors of the given number



import java.util.Scanner; // importing Scanner for taking input


class FactorsOfANumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
    System.out.println("The factors of "+num +" are : " );
        for(int i = 1; i<=num; i++){
            if(num%i == 0){
System.out.print(i+" ");
            }
        }
        in.close();
    }
}
