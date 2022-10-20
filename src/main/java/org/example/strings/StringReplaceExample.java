package org.example.strings;

class StringReplaceExample{
   public static void main(String args[]){  
      String s1="This is a new string";

      //using replace() method
      String replacedString = s1.replace("is","was");
    
      System.out.println(replacedString);// This was a new string will be printed
   }  
} 
