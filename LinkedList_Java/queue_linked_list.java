public class queue_linked_list {
    static class Node{
         int data;
         Node next;
         Node(int data){
            this.data=data;
            next=null;
         }
    }
    static class queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty() {
            return head==null && tail==null;
        }
        //add/enqueue
        public static void add(int data) {
            Node newNode=new Node(data);
            if(tail==null){
                tail=head=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        //remove/dequeue-O(1)
        public static int remove() {
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=null;
            }
            head=head.next;
            return front;
        }

        //peek
        public static int peek() {
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
