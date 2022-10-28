package org.example.datastructures.linkedlist.algo;

import java.util.HashSet;
import java.util.Set;
 
public class LinkedListCycleDetection {
 
    static class Node {
        int data;
        Node next;
        Node(int tmp) {data = tmp;}
    }
 
    public static void main(String[] a){
 
        Node n1 = new Node(56);
        Node n2 = new Node(89);
        Node n3 = new Node(3);
        Node n4 = new Node(59);
        Node n5 = new Node(77);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;
 
        System.out.println("Loop detected or not: " + identifyLoop(n1));
    }
 
 
    static boolean identifyLoop(Node head) {
 
        
        Node slowPtr = head;
        Node fastPtr = head;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
