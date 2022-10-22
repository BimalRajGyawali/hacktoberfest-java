package org.example.algorithms.recursion;
// Printing All Poisible Permutation of Given String Using RECURSION

import java.util.Scanner;

public class printAllPermutation {

    private static void print(String s,String ans,int len,String x){
        if(len == ans.length()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ans.length()==0  || x.contains(ch+"")== false)
                print(s.substring(0,i)+s.substring(i+1),ans+ch,len,x);
            else
                return;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        print(str,"",str.length()," ");
    }
}


