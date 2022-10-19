package org.example.datastructures.linkedlist.algo;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNodeFromLinkedList {
    ListNode t;
    public void deleteNode(ListNode node) {
        while(node.next!=null){
            node.val=node.next.val;
            t=node;
            node=node.next;
        }
        t.next=null;
    }
  public static void main(String args[]){
    
  }
}
