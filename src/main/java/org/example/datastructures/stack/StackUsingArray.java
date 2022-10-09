package org.example.datastructures.stack;
public class StackUsingArray 
{
    private int a[];
    private int top;
    public StackUsingArray()
    {
        a=new int[5];
        top=-1;
    }
    public void push(int num)
    {
        if(top==a.length-1)
            System.out.println("Stack is FULL, cannot push "+num+" to stack");
        else
        {
            top=top+1;
            a[top]=num;
            System.out.println(num+ " added to stack");
        }    
    }
    public void pop()
    {
        if(isEmpty())
            System.out.println("Cannot pop stack is EMPTY");
        else
        {
            System.out.println(a[top]+ " is popped out");
            top=top-1;
        }
    }
    void display()
    {
        if(isEmpty())
            System.out.println("Stack is EMPTY");
        else
        {
            System.out.println("Item in stack");
            for(int i=0;i<=top;i++)
            {
                System.out.println(a[top]);
            }
        }
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        StackUsingArray obj =new StackUsingArray();
            obj.display();
            obj.push(10);
            obj.push(20);
            obj.push(30);
            obj.push(40);
            obj.push(50);
            obj.display();
            obj.push(60);
            obj.pop();
            obj.pop();
            obj.display();
    }
}


