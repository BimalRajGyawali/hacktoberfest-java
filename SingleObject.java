package org.example.designpatterns.singleton


public class SingleObj
{   
   private static SingleObj instance = new SingleObj();
 
   private SingleObj(){}

   public static SingleObj getInstance()
   {
      return instance;
   }

   public void show()
   {
      System.out.println("Hello World!");
   }
}