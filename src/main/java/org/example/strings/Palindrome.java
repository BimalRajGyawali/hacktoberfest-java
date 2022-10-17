package org.example.strings;
public class Palindrome {
   
        public static boolean isPalindrome(String s) {
            String p = s.toLowerCase();
            StringBuilder str = new StringBuilder("");
            for (int i = 0; i <p.length(); i++) {
                if ((p.charAt(i)>47 && p.charAt(i)<=57) || ( p.charAt(i)>96 &&p.charAt(i)<=122) ) {
                    str.append(p.charAt(i));
                }
            }
            int start =0;
            int end =str.length()-1;
            while(start<=end) {
                if (str.charAt(start)!= str.charAt(end)) {
                return false;
                    
                }
                start++;
                end--;
            }
    
            return true;
    
        }

        public static void main(String[] args) {
            String s = "Amisha";
            System.out.println(isPalindrome(s));
            String str = "101";
            System.out.println(isPalindrome(str));
        }
    

}
