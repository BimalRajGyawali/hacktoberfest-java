package org.example.datastructures.queue;
import java.util.ArrayDeque;

public class DequeDemo
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addFirst(40);
        dq.addFirst(50);
        dq.addFirst(60);
        
        System.out.println(dq);
        
        //dq.removeLast();
        //dq.removeFirst();
        
        while(! dq.isEmpty())
        {
            dq.removeFirst();
        }
        
        System.out.println(dq);
    }
}

