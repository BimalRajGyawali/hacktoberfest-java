public class detecting_loops {
    class ListNode{
        int val;
        ListNode next;
        ListNode (int x){
            val=x;
            next=null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode hare=head;//fast
        ListNode turtle=head;//slow
        while(hare.next!=null && hare!=null)
        {
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
