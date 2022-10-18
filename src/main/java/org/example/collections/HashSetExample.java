package org.example.collections;

import java.util.*;  

public class HashSetExample{  

  public static void main(String args[]){  

    HashSet<String> set=new HashSet<String>();  //Creating HashSet and adding elements 

    set.add("Kirna");  

    set.add("Vijay");  

    set.add("Kirna");  

    set.add("Ajay");   

    Iterator<String> itr=set.iterator();  //Traversing elements 

    while(itr.hasNext()){  

      System.out.println(itr.next());  

    }  

  }  

}  
