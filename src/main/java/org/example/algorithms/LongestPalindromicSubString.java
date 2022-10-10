package org.example.algorithms;
/*
An Algorithm that return the longest Palindromic Substring of a given string s
*/
import java.util.*;


public class LongestPalindromicSubString{

    public static void main(String [] args)
    {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s = scr.nextLine();

        System.out.println("The Longest Palindromic Substr is "+LongestPalindromeSubstr(s));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        char[] sc = s.toCharArray();
        boolean dp[][] = new boolean[n][n];
        int low=-1,high=-1;
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                dp[i][j] = sc[i]==sc[j] && (j-i<3 || dp[i+1][j-1]);
                if(dp[i][j] &&  j-i>high-low){
                    high=j;low=i;
                }
            }
        }
        if(low==-1)
            low=0;
        if(high==-1)
            high=0;
            return s.substring(low,high+1);
    }

}
