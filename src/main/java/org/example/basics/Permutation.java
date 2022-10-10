package org.example.basics;
public class Permutation {
public static void printper(String str , String ans) {
    if (str.length()==0) {
        System.out.println(ans);
        return;
    }

    for (int i = 0; i < str.length(); i++) {
        char current= str.charAt(i);
        String newstr = str.substring(0, i)+str.substring(i+1);
        printper(newstr, ans+current);
    }
}
    public static void main(String[] args) {
       String s = "abc";
       printper(s, ""); 
    }
}
