public class reverse_linked_list {
    Node head;
    private int size;
    reverse_linked_list(){
     this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first
    public void addFirst(int data) {
        Node newNode=new Node(data);
        if(head==null)
        {
             head=newNode;
             return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
             head=newNode;
             return;
        }
        Node currNode=head;//for traversing
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next= newNode;
    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){//no .next warna last wala node print nhi ho rha hoga
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;//head.next=null -> lastNode=null
        while(lastNode.next!=null){//null.next    to avoid this case we need to perform next if (line 69)
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    //returning size
    public int getSize() {
        return size;
    }

    //reversing
    public void reverseIterate() {
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        reverse_linked_list list=new reverse_linked_list();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        //list.reverseIterate();
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}
