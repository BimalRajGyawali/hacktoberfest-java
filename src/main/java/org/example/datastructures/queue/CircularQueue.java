package org.example.datastructures.queue;
public class CircularQueue 
{
    int a[];
    int F,R;
    public CircularQueue()
    {
        a=new int[5];
        F=-1;
        R=-1;
    }
    public void insert(int num)
    {
        if((R+1)%a.length==F)
            System.out.println("Circular Queue is FULL");
        else if(isEmpty())
        {
            F=0;
            R=0;
            a[R]=num;
            System.out.println(num+" is added as First elt of Circular Queue");
        }
        else
        {
            R=(R+1)%a.length;
            a[R]=num;
            System.out.println(num+ " added to Circular Queue");
        }
    }
    public void remove()
    {
        if(isEmpty())
            System.out.println("Cannot not delete Circular Queue is EMPTY");
        else if(F==R)
        {
            System.out.println(a[F]+ " is deleted");
            F=-1;
            R=-1;
        }
        else
        {
            System.out.println(a[F]+ " is deleted");
            F=(F+1)%a.length;
        }
    }
    public boolean isEmpty()
    {
        if(F==-1 && R==-1)
            return true;
        else
            return false;
    }

    public void display()
    {
        if(isEmpty())
            System.out.println("Circular queue is empty");
        else
        {
            if(F<=R)
            {
                for(int i=F;i<=R;i++)
                {
                    System.out.println(a[i]);
                }
            }
            else
            {
                for(int i=F;i<=a.length-1;i++)
                {
                    System.out.println(a[i]);
                }
                for(int i=0;i<=R;i++)
                {
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        CircularQueue obj = new CircularQueue();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.display();
        obj.remove();
        obj.remove();
        obj.display();
        obj.insert(60);
        obj.insert(70);
        obj.display();
    }
}


