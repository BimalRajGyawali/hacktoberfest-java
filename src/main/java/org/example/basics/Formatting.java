package org.example.formatting;

import java.util.Scanner;

public class Formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                for(int z=s1.length(); z<15; z++)
                {
                    System.out.print(" ");
                }
                if(x>9 && x<99)
                {
                    System.out.print("0"+x);
                }
                else if(x>=0 && x<10)
                {
                    System.out.print("00"+x);
                }
                else{
                    System.out.print(x);
                }
                System.out.println();
            }
            System.out.println("================================");

    }
}
