package org.example.strings;
public class ValidAnagramString {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int a[]=new int[26];
   
        int b[]=new int[26];
        for(int i =0; i<s.length();i++){
           a[ s.charAt(i)-'a']++;        
            b[t.charAt(i) - 'a']++;
 
        }
        for(int i =0; i<26;i++){
        if(a[i]!=b[i]){
            return false;
        }
        }
        return true;
    }

        public static void main(String[] args) {
            String s = "amisha";
            String s1 = "ashima";
            System.out.println(isAnagram(s,s1));
            String str = "cat";
            String str1 = "mat";
            System.out.println(isAnagram(str,str1));
        }
    
}
