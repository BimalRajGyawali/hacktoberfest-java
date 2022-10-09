package org.example.basics;
public class RemoveDuplicate {
    public static boolean[] map= new boolean[26];

    public static String removeDupli(String a,int index, String str) {
        if (a.length()==index) {
            return str;
        }
        if (!(map[a.charAt(index)-'a'])) {
            map[a.charAt(index)-'a']=true;
            str=str+ a.charAt(index);

            return removeDupli(a, index+1, str);

        } else {
            return removeDupli(a, index+1, str);
        }
        
    }
    public static void main(String[] args) {
        String a ="abbcdda";
        System.out.println(removeDupli(a, 0, ""));
        
    }
}
