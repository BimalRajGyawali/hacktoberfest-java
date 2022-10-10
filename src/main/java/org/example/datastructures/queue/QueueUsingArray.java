package org.example.datastructures.queue;
public class QueueUsingArray  
{
    private int a[];
    private int F, R;
    
    QueueUsingArray()
    {
        a = new int[5];
        F = -1;
        R = -1;
    }
    
    void addFromRear(int num)
    {
        if(isEmpty())
        {
            F=0;
            R=0;
            a[R]=num;
            System.out.println(num+" added as first element in queue");
        }
        else if(R==a.length-1)
        {
            System.out.println("Cannot add, Queue is FULL from Rear Side");
        }
        else
        {
            R=R+1;
            a[R]=num;
            System.out.println(num+" added to queue");
        }
            
    }
    
    void removeFromFront()
    {
        if(isEmpty())
        {
            System.out.println("Cannot delete, Queue is Empty");
        }
        else if(F==R)
        {
            System.out.println(a[F]+" is deleted");
            F=-1;
            R=-1;
        }
        else
        {
            System.out.println(a[F]+" is deleted");
            F=F+1;
        }
    }
    
    public boolean isEmpty()
    {
        if(F==-1 && R==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // used during printing
    public String toString()   
    {
        String ans="";
        
        if(isEmpty())
        {
            ans = "[]";
        }
        else
        {
            ans="[";
            for(int i=F;i<=R;i++)
            {
                ans = ans + a[i]+" ";
            }
            ans=ans+"]";
        }
        
        return ans;
    }
    public static void main(String[] args) 
    {
        QueueUsingArray q=new QueueUsingArray ();
        System.out.println(q.toString());
        
        q.addFromRear(10);
        q.addFromRear(20);
        q.addFromRear(30);
        q.addFromRear(40);
        q.addFromRear(50);
        
        q.addFromRear(60);
        q.addFromRear(70);
        
        System.out.println(q.toString());
        
        //q.removeFromFront();
        //q.removeFromFront();
        //q.removeFromFront();
        
        while(! q.isEmpty())
        {
            q.removeFromFront();
        }
        
        q.removeFromFront();
        
        System.out.println(q);    
    }
}




