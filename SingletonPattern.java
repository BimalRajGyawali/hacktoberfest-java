
package org.example.designpatterns.singleton



public class SingletonPattern 
{
   public static void main(String[] args) 
{

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      
      SingleObj object = SingleObj.getInstance();

      
      object.show();
   }
}