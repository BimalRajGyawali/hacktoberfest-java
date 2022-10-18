package org.example.collections;

import java.util.*;  

public class TestJavaCollection3{  

  public static void main(String args[]){  

    Vector<String> v=new Vector<String>();  

    v.add("Ayush");  

    v.add("Amit");  

    v.add("Ashish");  

    v.add("Garima");  

    Iterator<String> itr=v.iterator();  

    while(itr.hasNext()){  

      System.out.println(itr.next());  

    }  

  }  

}  
