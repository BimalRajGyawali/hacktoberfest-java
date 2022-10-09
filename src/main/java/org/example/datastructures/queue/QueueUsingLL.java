package org.example.datastructures.queue;
public class QueueUsingLL 
{
    private Node F,R;
    public class QueueUsingLL()
    {
        F=null;
        R=null;
    }
    void addFromRear(int num)
    {
        Node nd= new Node(num);
        if(isEmpty())
        {
            F=nd;
            R=nd;
            System.out.println(num+" added as first element in queue");
        }
        else
        {
            R.next=nd;
            R=nd;
            System.out.println(num+" added to the queue");
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
            System.out.println(F.data+" is deleted");
            F=null;
            R=null;
        }
        else
        {
            System.out.println(F.data+" is deleted");
            Node t=F;
            F=F.next;
            t.next=null;
            t=null;
        }
    }
    
    public boolean isEmpty()
    {
        if(F==null && R==null)
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
            Node t=F;
            while(t!=null)
            {
                ans=ans+t.data+" ";
                t=t.next;
            }
            ans=ans+"]";
        }
        return ans;
    }
    
    public static void main(String[] args) 
    {
        QueueUsingLL q=new QueueUsingLL();
        System.out.println(q.toString());
        
        q.addFromRear(10);
        q.addFromRear(20);
        q.addFromRear(30);
        q.addFromRear(40);
        q.addFromRear(50);
        
        q.addFromRear(60);
        q.addFromRear(70);
        
        System.out.println(q.toString());
        
        q.removeFromFront();
        q.removeFromFront();
        q.removeFromFront();
        
        while(! q.isEmpty())
        {
            q.removeFromFront();
        }
        
        q.removeFromFront();
        
        System.out.println(q);    
    }
}


