package org.example.datastructures.linkedlist.algo;

public class SortLinkedList{
    Node head;
    Node sorted;
    class Node 
    {
        int val;
        Node next;
        public Node(int val) 
        {
            this.val = val;
        }
    }
  
    void push(int val) 
    {
        /* allocate node */
        Node newnode = new Node(val);
        /* link the old list off the new node */
        newnode.next = head;
        /* move the head to point to the new node */
        head = newnode;
    }
  
    // function to sort a singly linked list using insertion sort
    void insertionSort(Node headref) 
    {
        // Initialize sorted linked list
        sorted = null;
        Node current = headref;
        // Traverse the given linked list and insert every
        // node to sorted
        while (current != null) 
        {
            // Store next for next iteration
            Node next = current.next;
            // insert current in sorted linked list
            sortedInsert(current);
            // Update current
            current = next;
        }
        // Update head_ref to point to sorted linked list
        head = sorted;
    }
  
    /*
     * function to insert a new_node in a list. Note that 
     * this function expects a pointer to head_ref as this
     * can modify the head of the input linked list 
     * (similar to push())
     */
    void sortedInsert(Node newnode) 
    {
        /* Special case for the head end */
        if (sorted == null || sorted.val >= newnode.val) 
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else 
        {
            Node current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.val < newnode.val) 
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
  
    /* Function to print linked list */
    void printlist(Node head) 
    {
        while (head != null) 
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
      
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        SortLinkedList list = new SortLinkedList();
        list.push(5);
        list.push(20);
        list.push(4);
        list.push(3);
        list.push(30);
        System.out.println("Linked List before Sorting..");
        list.printlist(list.head);
        list.insertionSort(list.head);
        System.out.println("\nLinkedList After sorting");
        list.printlist(list.head);
    }
}
