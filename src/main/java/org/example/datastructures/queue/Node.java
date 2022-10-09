
package org.example.datastructures.queue;
public class Node 
{
   int data;
   Node next;
   
   public Node(int data)
   {
       this.data = data;
       next = null;    
   }
   
   public String toString()
   {
       return "("+data+")";   
   }
}
