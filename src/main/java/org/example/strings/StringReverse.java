package org.example.strings;
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        for (int i = A.length()-1; i >=0; i--) {
            B=B+ A.charAt(i);
        }
        System.out.println(B);
    }
}
