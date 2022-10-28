package org.example.leetcode;
//No13 in leetcode website

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println( rti2("XCC"));
    }
    static int rti2(String s){
        int total=0;
        Map<Character,Integer> hashmap=new HashMap<>();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);

        for (int i = 0; i <s.length(); i++) {
            if(i+1==s.length() || hashmap.get(s.charAt(i+1)) <= hashmap.get(s.charAt(i))){
                total=total+ hashmap.get(s.charAt(i));
            } else{
                total=total-hashmap.get(s.charAt(i));
            }
        }
        return total;
    }
}

