package org.example.datastructures.queue;
public class deque 
{
    private int a[];
    private int f,r;
    private int mid;
    public deque()
    {
        a=new int[10];
        f=-1;
        r=-1;
        mid=a.length/2;
    }
    public void addFromRear(int num)
    {
        if(isEmpty())
        {
            f=mid;
            r=mid;
            a[f]=num;
            System.out.println(num+ " added as 1st elt of deque");
        }
        else if(r==a.length-1)
            System.out.println("Rear side is FULL, cannot add");
        else
        {
            r=r+1;
            a[r]=num;
            System.out.println(num+ " added to deque from rear side");
        }
    }
    public void removeFromRear()
    {
        if(isEmpty())
            System.out.println("Cannot delete, deque is EMPTY");    
        else if(f==r)
        {
            System.out.println(a[r]+ " is deleted");
            f=-1;
            r=-1;
        }
        else
        {
            System.out.println(a[r]+ " is deleted");
            r=r-1;
        }
    }
    public void addFromFront(int num)
    {
        if(isEmpty())
        {
            f=mid;
            r=mid;
            a[f]=num;
            System.out.println(num+ " added as 1st elt in deque");
        }
        else if(f==0)
            System.out.println("Front side is FULL, cannot add");
        else
        {
            f=f-1;
            a[f]=num;
            System.out.println(num+ " added to deque from front side");
        }
    }
    public boolean isEmpty()
    {
        if(f==-1 && r==-1)
            return true;
        else
            return false;
    }
    public void removeFromFront()
    {
        if(isEmpty())
            System.out.println("Cannot delete, deque is EMPTY");    
        else if(f==r)
        {
            System.out.println(a[r]+ " is deleted");
            f=-1;
            r=-1;
        }
        else
        {
            System.out.println(a[f]+ " is deleted");
            f=f+1;
        }
    }
    
    void display()
    {
        if(isEmpty())
            System.out.println("Deque is EMPTY");
        else
        {
            for(int i=f;i<=r;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args) 
    {
        deque dq = new deque();
        dq.addFromRear(10);
        dq.addFromRear(20);
        dq.addFromRear(30);
        dq.addFromRear(130);
        dq.addFromRear(230);
        
        dq.addFromRear(330);
        dq.addFromRear(430);
        dq.addFromRear(530);
        dq.addFromRear(630);
        
        dq.display();

        dq.addFromFront(40);
        dq.addFromFront(50);
        dq.addFromFront(60);
        
    }
}



