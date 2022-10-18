package org.example.strings;
class StringEqualsIgnoreCase{  
  public static void main(String args[]){  
    String s1="Aditya";  
    String s2="Aditya";  
    String s3="AdiTya";  
    String s4="java";  
    System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
    System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
    System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
  }
}  
