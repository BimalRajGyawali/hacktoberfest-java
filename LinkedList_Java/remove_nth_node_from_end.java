class remove_nth_node_from_end{
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
    public ListNode removeNthFromEnd(ListNode head,int n){
        if(head.next==null){
            return null;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        int indexToSearch=size-n;
        ListNode prev=head;
        int i=0;
        while(i<indexToSearch){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;

    }
    public static void main(String[] args) {
        
    }
}