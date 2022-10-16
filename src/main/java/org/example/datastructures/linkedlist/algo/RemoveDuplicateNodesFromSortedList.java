package org.example.datastructures.linkedlist.algo;
class RemoveDuplicateNodesFromSortedList{
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(ListNode next,int val){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
         
         while(list != null) {
        	 if (list.next == null) {
        		 break;
        	 }
        	 if (list.val == list.next.val) {
        		 list.next = list.next.next;
        	 } else {
        		 list = list.next;
        	 }
         }
         
         return head;
    }
    public static void main(String[] args) {
        
    }
}


