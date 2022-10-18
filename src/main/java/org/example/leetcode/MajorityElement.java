package org.example.leetcode
import java.util.*;
public class MajorityElement {

    public static void main(String[] args) {
        int []a = {3,1,3,3,2};
        int size = 5;
        int ans = -1;
        HashMap<Integer, Integer>mp = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<size ; i++){
          if(mp.containsKey(a[i])) {
              mp.put(a[i],mp.get(a[i])+1);
          }
          else{
              mp.put(a[i],1);
          }
        }
       for(Map.Entry<Integer,Integer>e : mp.entrySet()){
           if(e.getValue() > size/2){
              ans = e.getKey();
              break;
           }
       }
       System.out.println(ans);
      
    }
} 
