package org.example.datastructures.stack;
public class StackUsingLL  
{
    Node top;
    public StackUsingLL()
    {
      top = null;
    }
    private class Node
    {
      int data;
      Node next;
      Node(int data)
      {
        this.data = data;
      }
      public void displayData()
      {
        System.out.println(data);
      }
    }
      
    public void insertNode(int data)
    {
      Node newNode = new Node(data);
      newNode.next = top;
      top = newNode;
    }
      
    public int removeNode()
    {        
      Node temp = top;
      top = top.next;
      return temp.data;
    }
      
    public int nodeData()
    {
      return top.data;
    }
  
    public boolean isEmpty()
    {
      return top == null;
    }
      
    public void push(int item)
    {
      insertNode(item);
    }

    public int pop()
    {
      if(isEmpty())
      {
        throw new RuntimeException("Stack is Empty");
      }
      return removeNode();
    }
      
    public int peek()
    {
      if(isEmpty())
      {
        throw new RuntimeException("Stack is Empty");
      }
      return nodeData();
    }
      
    public void displayStack()
    {
      Node current = top;
      while(current != null)
      {
        current.displayData();
        current = current.next;
      }
    }
    public static void main(String[] args) 
    {
      StackUsingLL stack = new StackUsingLL();
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      System.out.println("Item peeked- " + stack.peek());
      System.out.println("Items in stack--");
      stack.displayStack();
      System.out.println("Item popped- " + stack.pop());
      System.out.println("Item popped- " + stack.pop());
      System.out.println("Item peeked- " + stack.peek());
      System.out.println("Items in stack--");
      stack.displayStack();
    }
  }

